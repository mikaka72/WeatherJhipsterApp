package com.mka.client.apixu.domain;


public class Hour {

	private String will_it_rain;

    private String wind_kph;

    private String windchill_f;

    private String windchill_c;

    private String is_day;

    private String pressure_in;

    private String dewpoint_c;

    private String time;

    private String heatindex_c;

    private String vis_km;

    private String pressure_mb;

    private String heatindex_f;

    private String vis_miles;

    private String temp_f;

    private Condition condition;

    private String wind_degree;

    private String temp_c;

    private String time_epoch;

    private String wind_dir;

    private String dewpoint_f;

    private String humidity;

    private String will_it_snow;

    private String chance_of_rain;

    private String precip_mm;

    private String wind_mph;

    private String feelslike_f;

    private String cloud;

    private String feelslike_c;

    private String chance_of_snow;

    private String precip_in;
    
    

	public Hour() {
		super();
	}

	public Hour(String will_it_rain, String wind_kph, String windchill_f, String windchill_c, String is_day,
			String pressure_in, String dewpoint_c, String time, String heatindex_c, String vis_km, String pressure_mb,
			String heatindex_f, String vis_miles, String temp_f, Condition condition, String wind_degree, String temp_c,
			String time_epoch, String wind_dir, String dewpoint_f, String humidity, String will_it_snow,
			String chance_of_rain, String precip_mm, String wind_mph, String feelslike_f, String cloud,
			String feelslike_c, String chance_of_snow, String precip_in) {
		super();
		this.will_it_rain = will_it_rain;
		this.wind_kph = wind_kph;
		this.windchill_f = windchill_f;
		this.windchill_c = windchill_c;
		this.is_day = is_day;
		this.pressure_in = pressure_in;
		this.dewpoint_c = dewpoint_c;
		this.time = time;
		this.heatindex_c = heatindex_c;
		this.vis_km = vis_km;
		this.pressure_mb = pressure_mb;
		this.heatindex_f = heatindex_f;
		this.vis_miles = vis_miles;
		this.temp_f = temp_f;
		this.condition = condition;
		this.wind_degree = wind_degree;
		this.temp_c = temp_c;
		this.time_epoch = time_epoch;
		this.wind_dir = wind_dir;
		this.dewpoint_f = dewpoint_f;
		this.humidity = humidity;
		this.will_it_snow = will_it_snow;
		this.chance_of_rain = chance_of_rain;
		this.precip_mm = precip_mm;
		this.wind_mph = wind_mph;
		this.feelslike_f = feelslike_f;
		this.cloud = cloud;
		this.feelslike_c = feelslike_c;
		this.chance_of_snow = chance_of_snow;
		this.precip_in = precip_in;
	}

	public String getWill_it_rain() {
		return will_it_rain;
	}

	public void setWill_it_rain(String will_it_rain) {
		this.will_it_rain = will_it_rain;
	}

	public String getWind_kph() {
		return wind_kph;
	}

	public void setWind_kph(String wind_kph) {
		this.wind_kph = wind_kph;
	}

	public String getWindchill_f() {
		return windchill_f;
	}

	public void setWindchill_f(String windchill_f) {
		this.windchill_f = windchill_f;
	}

	public String getWindchill_c() {
		return windchill_c;
	}

	public void setWindchill_c(String windchill_c) {
		this.windchill_c = windchill_c;
	}

	public String getIs_day() {
		return is_day;
	}

	public void setIs_day(String is_day) {
		this.is_day = is_day;
	}

	public String getPressure_in() {
		return pressure_in;
	}

	public void setPressure_in(String pressure_in) {
		this.pressure_in = pressure_in;
	}

	public String getDewpoint_c() {
		return dewpoint_c;
	}

	public void setDewpoint_c(String dewpoint_c) {
		this.dewpoint_c = dewpoint_c;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHeatindex_c() {
		return heatindex_c;
	}

	public void setHeatindex_c(String heatindex_c) {
		this.heatindex_c = heatindex_c;
	}

	public String getVis_km() {
		return vis_km;
	}

	public void setVis_km(String vis_km) {
		this.vis_km = vis_km;
	}

	public String getPressure_mb() {
		return pressure_mb;
	}

	public void setPressure_mb(String pressure_mb) {
		this.pressure_mb = pressure_mb;
	}

	public String getHeatindex_f() {
		return heatindex_f;
	}

	public void setHeatindex_f(String heatindex_f) {
		this.heatindex_f = heatindex_f;
	}

	public String getVis_miles() {
		return vis_miles;
	}

	public void setVis_miles(String vis_miles) {
		this.vis_miles = vis_miles;
	}

	public String getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(String temp_f) {
		this.temp_f = temp_f;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public String getWind_degree() {
		return wind_degree;
	}

	public void setWind_degree(String wind_degree) {
		this.wind_degree = wind_degree;
	}

	public String getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(String temp_c) {
		this.temp_c = temp_c;
	}

	public String getTime_epoch() {
		return time_epoch;
	}

	public void setTime_epoch(String time_epoch) {
		this.time_epoch = time_epoch;
	}

	public String getWind_dir() {
		return wind_dir;
	}

	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}

	public String getDewpoint_f() {
		return dewpoint_f;
	}

	public void setDewpoint_f(String dewpoint_f) {
		this.dewpoint_f = dewpoint_f;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWill_it_snow() {
		return will_it_snow;
	}

	public void setWill_it_snow(String will_it_snow) {
		this.will_it_snow = will_it_snow;
	}

	public String getChance_of_rain() {
		return chance_of_rain;
	}

	public void setChance_of_rain(String chance_of_rain) {
		this.chance_of_rain = chance_of_rain;
	}

	public String getPrecip_mm() {
		return precip_mm;
	}

	public void setPrecip_mm(String precip_mm) {
		this.precip_mm = precip_mm;
	}

	public String getWind_mph() {
		return wind_mph;
	}

	public void setWind_mph(String wind_mph) {
		this.wind_mph = wind_mph;
	}

	public String getFeelslike_f() {
		return feelslike_f;
	}

	public void setFeelslike_f(String feelslike_f) {
		this.feelslike_f = feelslike_f;
	}

	public String getCloud() {
		return cloud;
	}

	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	public String getFeelslike_c() {
		return feelslike_c;
	}

	public void setFeelslike_c(String feelslike_c) {
		this.feelslike_c = feelslike_c;
	}

	public String getChance_of_snow() {
		return chance_of_snow;
	}

	public void setChance_of_snow(String chance_of_snow) {
		this.chance_of_snow = chance_of_snow;
	}

	public String getPrecip_in() {
		return precip_in;
	}

	public void setPrecip_in(String precip_in) {
		this.precip_in = precip_in;
	}
    
    
	
}
