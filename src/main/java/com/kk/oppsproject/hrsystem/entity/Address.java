package com.kk.oppsproject.hrsystem.entity;

public class Address {

	private int id;
	private String zip;
	private String country;
	private String state;
	private String city;
	private String line1;
	private String line2;
	
	
	public Address() {
	}
	public Address(String zip, String country, String state, String city, String line1, String line2) {
		super();
		this.id = 1;
		this.zip = zip;
		this.country = country;
		this.state = state;
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", zip='" + zip + '\'' +
				", country='" + country + '\'' +
				", state='" + state + '\'' +
				", city='" + city + '\'' +
				", line1='" + line1 + '\'' +
				", line2='" + line2 + '\'' +
				'}';
	}
}
