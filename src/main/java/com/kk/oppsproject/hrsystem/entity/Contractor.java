package com.kk.oppsproject.hrsystem.entity;

import java.util.Date;

public class Contractor extends Employee {
	
	private Date start;//DateTime
	private Date end;  //DateTime
	private Float hourlyRate;
	
	public Contractor() {
	}

	public Contractor(Date start, Date end, Float hourlyRate) {
		this.start = start;
		this.end = end;
		this.hourlyRate = hourlyRate;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Contractor{" +
				"start=" + start +
				", end=" + end +
				", hourlyRate=" + hourlyRate +
				'}';
	}
}
