package com.lty.ic.gw.bean;

import java.io.Serializable;

public class GPSData implements Serializable {
	private static final long serialVersionUID = 1L;

	private String date;
	private String time;
	private Double lan;
	private Double lat;
	private Integer vec1;
	private Integer vec2;
	private Integer vec3;
	private Integer direction;
	private Float altitude;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Double getLan() {
		return lan;
	}
	public void setLan(Double lan) {
		this.lan = lan;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Integer getVec1() {
		return vec1;
	}
	public void setVec1(Integer vec1) {
		this.vec1 = vec1;
	}
	public Integer getVec2() {
		return vec2;
	}
	public void setVec2(Integer vec2) {
		this.vec2 = vec2;
	}
	public Integer getVec3() {
		return vec3;
	}
	public void setVec3(Integer vec3) {
		this.vec3 = vec3;
	}
	public Integer getDirection() {
		return direction;
	}
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	public Float getAltitude() {
		return altitude;
	}
	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}
}
