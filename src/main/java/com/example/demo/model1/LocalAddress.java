package com.example.demo.model1;

public class LocalAddress {
@NotBlank(message="address can not be blank")
private String addressno;
@NotBlank(message="empid can not be blank")
private String areaname;
@NotBlank(message="empid can not be blank")
private String cityname;
public String getAddressno() {
	return addressno;
}
public void setAddressno(String addressno) {
	this.addressno = addressno;
}
public String getAreaname() {
	return areaname;
}
public void setAreaname(String areaname) {
	this.areaname = areaname;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}

}
