package org.liferayasif.front.dto;

public class WiproDto {
	
	private String department;
	private int noOfEmployee;
	private double avgSalary;
	private String location;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public double getAvgSalary() {
		return avgSalary;
	}
	public void setAvgSalary(double avgSalary) {
		this.avgSalary = avgSalary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
