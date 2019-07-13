package org.liferayasif.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="WORST")
public class Worst implements Serializable{

	
	private static final long serialVersionUID = 8101126109952463752L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WORST_ID")
	private Integer worstId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@Column(name = "MOTHER_NAME ")
	private String motherName;
	
	@Column(name = "GENDER ")
	private String gender ;
	
	@Column(name = "BIRTH_DATE ")
	@DateTimeFormat(pattern = "yyyy/mm/dd")  
	private Date birthDate ;
	
	@Column(name = "EMAIL_ADDRESS ")
	private String emailAddress;
	
	
	@Column(name = "PASSWORD ")
	private String password ;
	
	@Column(name = "CONFIRM_PASSWORD ")
	private String confirmPassword ;
	
	
	public Worst(){}


	public Integer getWorstId() {
		return worstId;
	}


	public void setWorstId(Integer worstId) {
		this.worstId = worstId;
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
