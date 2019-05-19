package org.liferayasif.front.dto;

import java.util.List;

public class PatientDto {

	private Integer id;
	private String fName;
	private String lName;
	private String email;
	private Integer age;
	private Integer phone;
	


	public PatientDto(){}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Integer getPhone() {
		return phone;
	}



	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	
}