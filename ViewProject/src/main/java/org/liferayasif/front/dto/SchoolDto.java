package org.liferayasif.front.dto;

public class SchoolDto {
	
	private Integer id;
	private String schoolName;
	private int noStudent;
	private String location;
	private double fees;
	
	public SchoolDto (){};
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getNoStudent() {
		return noStudent;
	}
	public void setNoStudent(int noStudent) {
		this.noStudent = noStudent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}

}
