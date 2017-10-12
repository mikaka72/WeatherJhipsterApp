package com.mka.client.apixu.domain;


public class Day {

	private String avgtemp_c;

    private String totalprecip_mm;

    private String mintemp_f;

    private String mintemp_c;

    private String totalprecip_in;

    private Condition condition;

    private String uv;

    private String avghumidity;

    private String avgvis_km;

    private String avgtemp_f;

    private String maxwind_mph;

    private String avgvis_miles;

    private String maxwind_kph;

    private String maxtemp_c;

    private String maxtemp_f;

    
	public Day() {
		super();
		
	}

	public Day(String avgtemp_c, String totalprecip_mm, String mintemp_f, String mintemp_c, String totalprecip_in,
			Condition condition, String uv, String avghumidity, String avgvis_km, String avgtemp_f, String maxwind_mph,
			String avgvis_miles, String maxwind_kph, String maxtemp_c, String maxtemp_f) {
		super();
		this.avgtemp_c = avgtemp_c;
		this.totalprecip_mm = totalprecip_mm;
		this.mintemp_f = mintemp_f;
		this.mintemp_c = mintemp_c;
		this.totalprecip_in = totalprecip_in;
		this.condition = condition;
		this.uv = uv;
		this.avghumidity = avghumidity;
		this.avgvis_km = avgvis_km;
		this.avgtemp_f = avgtemp_f;
		this.maxwind_mph = maxwind_mph;
		this.avgvis_miles = avgvis_miles;
		this.maxwind_kph = maxwind_kph;
		this.maxtemp_c = maxtemp_c;
		this.maxtemp_f = maxtemp_f;
	}

	public String getAvgtemp_c() {
		return avgtemp_c;
	}

	public void setAvgtemp_c(String avgtemp_c) {
		this.avgtemp_c = avgtemp_c;
	}

	public String getTotalprecip_mm() {
		return totalprecip_mm;
	}

	public void setTotalprecip_mm(String totalprecip_mm) {
		this.totalprecip_mm = totalprecip_mm;
	}

	public String getMintemp_f() {
		return mintemp_f;
	}

	public void setMintemp_f(String mintemp_f) {
		this.mintemp_f = mintemp_f;
	}

	public String getMintemp_c() {
		return mintemp_c;
	}

	public void setMintemp_c(String mintemp_c) {
		this.mintemp_c = mintemp_c;
	}

	public String getTotalprecip_in() {
		return totalprecip_in;
	}

	public void setTotalprecip_in(String totalprecip_in) {
		this.totalprecip_in = totalprecip_in;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public String getUv() {
		return uv;
	}

	public void setUv(String uv) {
		this.uv = uv;
	}

	public String getAvghumidity() {
		return avghumidity;
	}

	public void setAvghumidity(String avghumidity) {
		this.avghumidity = avghumidity;
	}

	public String getAvgvis_km() {
		return avgvis_km;
	}

	public void setAvgvis_km(String avgvis_km) {
		this.avgvis_km = avgvis_km;
	}

	public String getAvgtemp_f() {
		return avgtemp_f;
	}

	public void setAvgtemp_f(String avgtemp_f) {
		this.avgtemp_f = avgtemp_f;
	}

	public String getMaxwind_mph() {
		return maxwind_mph;
	}

	public void setMaxwind_mph(String maxwind_mph) {
		this.maxwind_mph = maxwind_mph;
	}

	public String getAvgvis_miles() {
		return avgvis_miles;
	}

	public void setAvgvis_miles(String avgvis_miles) {
		this.avgvis_miles = avgvis_miles;
	}

	public String getMaxwind_kph() {
		return maxwind_kph;
	}

	public void setMaxwind_kph(String maxwind_kph) {
		this.maxwind_kph = maxwind_kph;
	}

	public String getMaxtemp_c() {
		return maxtemp_c;
	}

	public void setMaxtemp_c(String maxtemp_c) {
		this.maxtemp_c = maxtemp_c;
	}

	public String getMaxtemp_f() {
		return maxtemp_f;
	}

	public void setMaxtemp_f(String maxtemp_f) {
		this.maxtemp_f = maxtemp_f;
	}
    
    
	
}
