package com.mka.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.mka.service.WeatherService;
import com.mka.service.dto.WeatherDTO;

@RequestMapping("/api")
@RestController
public class WeatherResource {

	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/weather/{location}")
	@Timed
	public WeatherDTO getWeather(@PathVariable(value = "location") String location) {
		return weatherService.getCurrentWeather(location);
	}
	
	
}
