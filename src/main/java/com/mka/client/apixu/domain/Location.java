package com.mka.client.apixu.domain;


public class Location {
	
	private String region;
	private String localtime_epoch;
	private String localtime;
	private String lon;
	private String tz_id;
	private String name;
	private String lat;
	private String country;
	
	
	
	public Location() {
		super();
	}
	public Location(String region, String localtime_epoch, String localtime, String lon, String tz_id, String name,
			String lat, String country) {
		super();
		this.region = region;
		this.localtime_epoch = localtime_epoch;
		this.localtime = localtime;
		this.lon = lon;
		this.tz_id = tz_id;
		this.name = name;
		this.lat = lat;
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLocaltime_epoch() {
		return localtime_epoch;
	}
	public void setLocaltime_epoch(String localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}
	public String getLocaltime() {
		return localtime;
	}
	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getTz_id() {
		return tz_id;
	}
	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
