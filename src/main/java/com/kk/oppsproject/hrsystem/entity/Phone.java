package com.kk.oppsproject.hrsystem.entity;

public class Phone {

	private int id;
	private String areaCode;
	private String number;
	private String countryCode;

	public Phone() {
	}

	public Phone( String areaCode, String number, String countryCode) {
		this.id = 1;
		this.areaCode = areaCode;
		this.number = number;
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"id=" + id +
				", areaCode='" + areaCode + '\'' +
				", number='" + number + '\'' +
				", countryCode='" + countryCode + '\'' +
				'}';
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
	
	
}
