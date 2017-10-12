package com.mka.client.apixu.domain;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


@Root(strict=false)
public class Forecastday {
	
	@Element
	private Astro astro;
	@Element
    private Day day;
	@ElementList(inline = true, required = false)
    private List<Hour> hour;
	@Element
    private Date date;
	@Element
    private String date_epoch;
	
	
	
	public Forecastday() {
		super();
	}
	public Forecastday(Astro astro, Day day, List<Hour> hour, Date date, String date_epoch) {
		super();
		this.astro = astro;
		this.day = day;
		this.hour = hour;
		this.date = date;
		this.date_epoch = date_epoch;
	}
	public Astro getAstro() {
		return astro;
	}
	public void setAstro(Astro astro) {
		this.astro = astro;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public List<Hour> getHour() {
		return hour;
	}
	public void setHour(List<Hour> hour) {
		this.hour = hour;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDate_epoch() {
		return date_epoch;
	}
	public void setDate_epoch(String date_epoch) {
		this.date_epoch = date_epoch;
	}
	
	
	
	
}
	