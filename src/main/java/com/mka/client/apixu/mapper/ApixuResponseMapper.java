package com.mka.client.apixu.mapper;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mka.client.apixu.domain.CurrentWeatherResponse;
import com.mka.client.apixu.domain.ForecastResponse;
import com.mka.service.dto.WeatherDTO;

@Component
public class ApixuResponseMapper {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public  CurrentWeatherResponse getCurrentResponse(String xml)  {
		Serializer serializer = new Persister();
		CurrentWeatherResponse response = null;
		try {
			response = serializer.read(CurrentWeatherResponse.class, xml);
		} catch (Exception e) {
			logger.error("Error parsing response xml: " , e);
		}
		 
		return response;
	}
	
	
	public  ForecastResponse getForecastResponse(String xml) {
		
		Serializer serializer = new Persister();
		ForecastResponse response = null;
		try {
			response = serializer.read(ForecastResponse.class, xml);
		} catch (Exception e) {
			logger.error("Error parsing response xml: " , e);
		}
		return response;
	}
	
	public List<WeatherDTO> getCurrentWeatherList(CurrentWeatherResponse response){
		
		WeatherDTO weather  = new WeatherDTO(response.getLocation().getName(), 
				response.getCurrent().getTemp_c(),
				response.getCurrent().getWind_kph(), 
				response.getCurrent().getWind_dir(),
				response.getCurrent().getCondition().getIcon(),
				response.getLocation().getLocaltime());
		
		List<WeatherDTO> weathers = new ArrayList<>();
		weathers.add(weather);
		return weathers;
	}
	
	public WeatherDTO getCurrentWeather(CurrentWeatherResponse response){
		
		return  new WeatherDTO(response.getLocation().getName(), 
				response.getCurrent().getTemp_c(),
				response.getCurrent().getWind_kph(), 
				response.getCurrent().getWind_dir(),
				response.getCurrent().getCondition().getIcon(),
				response.getLocation().getLocaltime());
		
	
	}
	
	public List<WeatherDTO> getForecastList(ForecastResponse response){
		List<WeatherDTO> weathers = new ArrayList<>();
		String name = response.getLocation().getName();
		
		response.getForecast().getForecastday().forEach(forecastday -> {
			forecastday.getHour().forEach(hour ->{
				weathers.add(new WeatherDTO(name, 
						hour.getTemp_c(), 
						hour.getWind_kph(), 
						hour.getWind_dir(), 
						hour.getCondition().getIcon(), 
						hour.getTime()));
			});
		});
		
		return weathers;
	}
	
}
