package com.mka.client.apixu.domain;


public class Condition {
	
	private String icon;
	private String text;
	private String code;
	
	
	
	
	public Condition() {
		super();
	}
	public Condition(String icon, String text, String code) {
		super();
		this.icon = icon;
		this.text = text;
		this.code = code;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
