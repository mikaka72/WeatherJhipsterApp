package com.mka.client.apixu.domain;

import java.util.List;

import org.simpleframework.xml.ElementList;


public class Forecast {
	@ElementList(inline = true, required = false)
	private List<Forecastday> forecastday;

	
	public Forecast() {
		super();
	}

	public Forecast(List<Forecastday> forecastday) {
		super();
		this.forecastday = forecastday;
	}

	public List<Forecastday> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}
	
	
	
}
