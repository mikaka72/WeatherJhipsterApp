package com.mka.client.apixu.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(strict=false)
public class ForecastResponse {
	@Element
	private Location location;
	@Element
    private Forecast forecast;
	@Element
    private Current current;
	
	
	
	public ForecastResponse() {
		super();
	}
	public ForecastResponse(Location location, Forecast forecast, Current current) {
		super();
		this.location = location;
		this.forecast = forecast;
		this.current = current;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}
	public Current getCurrent() {
		return current;
	}
	public void setCurrent(Current current) {
		this.current = current;
	}
	
	
	
	
}
