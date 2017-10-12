package com.mka.client.apixu.builder;

import org.springframework.stereotype.Component;

@Component
public class ApixuConnectionUrlBuilder {

	//@Value("${com.weather.service.apixu.apikey}")
	private String apiKey = "774f5ba8a80e4359bb2123201172009";
	
	//@Value("${com.weather.service.apixu.currentweatherendpoint}")
	private String currentWeatherEndpoint = "http://api.apixu.com/v1/current.xml?";
	
	//@Value("${com.weather.service.apixu.weatherforecastendpoint}")
	private String weatherforecastendpoint = "http://api.apixu.com/v1/forecast.xml?";
	
	
	
	public String getCurrentWeahterUrl(String location) {
		StringBuilder builder = new StringBuilder();
		builder.append(currentWeatherEndpoint).append("key=").append(apiKey).append("&q=").append(location);
		return builder.toString();
	}
	
	public String getWeahterForecastUrl(String location, int days) {
		StringBuilder builder = new StringBuilder();
		builder.append(weatherforecastendpoint).append("key=").append(apiKey).append("&q=").append(location).append("&days=")
		.append(days);
		return builder.toString();
	}
	
}
