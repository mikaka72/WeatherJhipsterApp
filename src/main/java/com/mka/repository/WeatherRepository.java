package com.mka.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.mka.client.WeatherClient;
import com.mka.dao.WeatherDao;
import com.mka.service.dto.WeatherDTO;


@Repository
public class WeatherRepository implements WeatherDao {

	
	
	final WeatherClient weatherClient;


	public WeatherRepository(final WeatherClient weatherClient) {
		this.weatherClient = weatherClient;
	}

	@Override
	public WeatherDTO find(String key) {
		return weatherClient.getCurrentWeather(key);
	}

	@Override
	public List<WeatherDTO> getWeatherForecast(String location, int days) {
		return weatherClient.getForecast(location, days);
	}
}
