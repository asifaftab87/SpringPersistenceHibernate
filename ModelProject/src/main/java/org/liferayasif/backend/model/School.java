package org.liferayasif.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="SCHOOL_NAME")
	private String schoolName;
	
	@Column(name="NO_STUDENT")
	private int noStudent;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="FEES")
	private double fees;
	
	public double getFees() {
		return fees;
	}



	public void setFees(double fees) {
		this.fees = fees;
	}



	public void setNoStudent(int noStudent) {
		this.noStudent = noStudent;
	}



	public School (){};
	
		
	
	public void setId(Integer id)
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}
 
	public void setSchoolName(String schoolName)
	{
		this.schoolName=schoolName;
	}
	public String getSchoolName()
	{
		return schoolName;
	}
	public void setNoStudent(Integer noStudent)
	{
		this.noStudent=noStudent;
	}
	public Integer getNoStudent()
	{
		return noStudent;
	}
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}

	
}
