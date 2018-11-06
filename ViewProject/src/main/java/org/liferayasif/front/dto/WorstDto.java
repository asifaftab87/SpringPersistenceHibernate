package org.liferayasif.front.dto;

import java.util.Date;

public class WorstDto {
	
	private Integer worstId;
	private String name;
	private String fatherName;
	private String motherName;
	private String gender ;
	private Date birthDate ;
	private String emailAddress;
	private String password ;
	private String confirmPassword ;
	
	public WorstDto(){};
	
	
	public void setWorstId(Integer worstId)
	{
		this.worstId=worstId;
	}
	
	public Integer getWorstId()
	{
		return worstId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	

}
