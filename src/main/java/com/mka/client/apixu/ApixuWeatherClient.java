package com.mka.client.apixu;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mka.client.WeatherClient;
import com.mka.client.apixu.builder.ApixuConnectionUrlBuilder;
import com.mka.client.apixu.domain.CurrentWeatherResponse;
import com.mka.client.apixu.domain.ForecastResponse;
import com.mka.client.apixu.mapper.ApixuResponseMapper;
import com.mka.service.dto.WeatherDTO;



@Component
public class ApixuWeatherClient implements WeatherClient{

	private RestTemplate restTemplate;
	
	private final ApixuResponseMapper apixuResponseMapper;
	private final ApixuConnectionUrlBuilder apixuConnectionUrlBuilder;

	private String proxyUrl="";
	private int port = 80;
	

	
	public ApixuWeatherClient(final ApixuResponseMapper apixuResponseMapper, 
			ApixuConnectionUrlBuilder apixuConnectionUrlBuilder)
			{
		this.apixuResponseMapper = apixuResponseMapper;
		this.apixuConnectionUrlBuilder = apixuConnectionUrlBuilder;
		
		restTemplate = getRestTemplate();
	}

	@Override
	public WeatherDTO getCurrentWeather(String location) {
		WeatherDTO weather = null;

		restTemplate.getMessageConverters().add(new SourceHttpMessageConverter());

		String responseXml = Optional.ofNullable(
				restTemplate.getForObject(apixuConnectionUrlBuilder.getCurrentWeahterUrl(location), String.class))
				.orElseThrow( () -> new RuntimeException("No response"));
		
		CurrentWeatherResponse response = Optional.ofNullable(apixuResponseMapper.getCurrentResponse(responseXml)).
				orElseThrow( () -> new RuntimeException("Could not deserialize response xml"));
		
		return apixuResponseMapper.getCurrentWeather(response);
	}

	@Override
	public List<WeatherDTO> getForecast(String location, int days) {
		
		restTemplate.getMessageConverters().add(new SourceHttpMessageConverter());
		String responseXml = Optional.ofNullable(
				restTemplate.getForObject(apixuConnectionUrlBuilder.getWeahterForecastUrl(location, days), String.class))
				.orElseThrow( () -> new RuntimeException("No response"));
		
		ForecastResponse response = Optional.ofNullable(apixuResponseMapper.getForecastResponse(responseXml)).
			orElseThrow( () -> new RuntimeException("Could not deserialize response xml"));
		
		return apixuResponseMapper.getForecastList(response);
		
	}
	
	private RestTemplate getRestTemplate() {
		RestTemplate template = null;
		if(!proxyUrl.isEmpty()) {
			SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		    Proxy proxy= new Proxy(Type.HTTP, new InetSocketAddress(proxyUrl, port));
		    requestFactory.setProxy(proxy);
		    template = new RestTemplate(requestFactory);
		} else {
			template = new RestTemplate();
		} 
		return template;
	}
	
}
