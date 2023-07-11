package com.har.model;

public class Address {
	String hNo;
	String street;
	String state;
	String city;
	public Address(String hNo, String street,  String city, String state) {
		this.hNo = hNo;
		this.street = street;
		this.state = state;
		this.city = city;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}