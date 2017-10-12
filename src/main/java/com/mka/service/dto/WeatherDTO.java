package com.mka.service.dto;


public class WeatherDTO {

	private String location;
	private String tempature;
	private String wind;
	private String windfrom;
	private String icon;
	private String weatherDate;
	
	
	
	public WeatherDTO() {
		super();	
	}
	
	public WeatherDTO(String location, String tempature, String wind, String windfrom, String icon,
			String weatherDate) {
		super();
		this.location = location;
		this.tempature = tempature;
		this.wind = wind;
		this.windfrom = windfrom;
		this.icon = icon;
		this.weatherDate = weatherDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTempature() {
		return tempature;
	}
	public void setTempature(String tempature) {
		this.tempature = tempature;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getWindfrom() {
		return windfrom;
	}
	public void setWindfrom(String windfrom) {
		this.windfrom = windfrom;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getWeatherDate() {
		return weatherDate;
	}
	public void setWeatherDate(String weatherDate) {
		this.weatherDate = weatherDate;
	}

	
	
}
