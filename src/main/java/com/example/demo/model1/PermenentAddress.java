package com.example.demo.model1;

import javax.validation.constraints.NotBlank;

public class PermenentAddress {
	@NotBlank(message="address can not be blank")
	private String addressno1;
	@NotBlank(message="address can not be blank")
	private String areaname1;
	@NotBlank(message="address can not be blank")
	private String cityname1;
	public String getAddressno1() {
		return addressno1;
	}
	public void setAddressno1(String addressno1) {
		this.addressno1 = addressno1;
	}
	public String getAreaname1() {
		return areaname1;
	}
	public void setAreaname1(String areaname1) {
		this.areaname1 = areaname1;
	}
	public String getCityname1() {
		return cityname1;
	}
	public void setCityname1(String cityname1) {
		this.cityname1 = cityname1;
	}
	
}
