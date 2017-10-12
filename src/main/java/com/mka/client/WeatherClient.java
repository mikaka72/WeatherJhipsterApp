package com.mka.client;

import java.util.List;

import com.mka.service.dto.WeatherDTO;

public interface WeatherClient {

	public WeatherDTO getCurrentWeather(String location);
	
	public List<WeatherDTO> getForecast(String location, int days);
	
}
