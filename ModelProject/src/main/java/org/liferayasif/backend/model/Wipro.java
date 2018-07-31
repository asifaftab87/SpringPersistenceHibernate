package org.liferayasif.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WIPRO")
public class Wipro {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idWipro;
	
	@Column(name="department")
	private String department;
	
	@Column(name="noOfEmployee")
	private int noOfEmployee;
	
	@Column(name="avgSalary")
	private double avgSalary;
	
	@Column(name="location")
	private String location;
	
	
	public void setIdWipro(Integer idWipro)
	{
		this.idWipro=idWipro;
	}
	public int getIdWipro()
	{
		return idWipro;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setNoOfEmployee(Integer noOfEmployee)
	{
		this.noOfEmployee=noOfEmployee;
	}
	public int getNoOfEmployee()
	{
		return noOfEmployee;
	}
	public void setAvgSalary(double avgSalary)
	{
		this.avgSalary=avgSalary;
	}
	public double getAvgSalary()
	{
		return avgSalary;
	}
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getlocation()
	{
		return location;
	}
	
}
