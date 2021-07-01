package com.kk.oppsproject.hrsystem.entity;

import java.util.Date;

public class FullTime extends Employee{
	
	private Date start;
	private Float baseSalaryPerYear;
	private Float bonusPerYear;
	
	public FullTime() {
	}

	public FullTime(Date start, Float baseSalaryPerYear, Float bonusPerYear) {
		this.start = start;
		this.baseSalaryPerYear = baseSalaryPerYear;
		this.bonusPerYear = bonusPerYear;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Float getBaseSalaryPerYear() {
		return baseSalaryPerYear;
	}

	public void setBaseSalaryPerYear(Float baseSalaryPerYear) {
		this.baseSalaryPerYear = baseSalaryPerYear;
	}

	public Float getBonusPerYear() {
		return bonusPerYear;
	}

	public void setBonusPerYear(Float bonusPerYear) {
		this.bonusPerYear = bonusPerYear;
	}

	@Override
	public String toString() {
		return "FullTime{" +
				"start=" + start +
				", baseSalaryPerYear=" + baseSalaryPerYear +
				", bonusPerYear=" + bonusPerYear +
				'}';
	}
}
