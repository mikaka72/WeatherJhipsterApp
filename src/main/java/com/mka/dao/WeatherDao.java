package com.mka.dao;

import java.util.List;

import com.mka.service.dto.WeatherDTO;

public interface WeatherDao  extends WeatherApiDao<WeatherDTO, String> {
	public List<WeatherDTO> getWeatherForecast(String location, int days);
}
