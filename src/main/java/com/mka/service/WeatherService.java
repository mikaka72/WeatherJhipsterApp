package com.mka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mka.dao.WeatherDao;
import com.mka.service.dto.WeatherDTO;

@Service
public class  WeatherService {

	@Autowired 
	WeatherDao weatherDao;
	
	
	public WeatherDTO  getCurrentWeather(String location) {

		return weatherDao.find(location);
	}

	
	public List<WeatherDTO> getWeatherForecast(String location, int days) {
		
		return weatherDao.getWeatherForecast(location, days);
	}
	
}
