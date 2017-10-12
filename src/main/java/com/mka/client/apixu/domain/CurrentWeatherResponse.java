package com.mka.client.apixu.domain;



public class CurrentWeatherResponse {

	private Location location;

    private Current current;

    
    
	public CurrentWeatherResponse() {

	}

	public CurrentWeatherResponse(Location location, Current current) {
		super();
		this.location = location;
		this.current = current;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

    
    
}
