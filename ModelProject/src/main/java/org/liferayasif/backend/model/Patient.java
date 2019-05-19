package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient implements Serializable{

	private static final long serialVersionUID = 8479324842461047522L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="FNAME")
	private String fName;
	
	@Column(name="LNAME")
	private String lName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="doctorId")
	private Integer doctorId;
	
	@Column(name="hospitalId")
	private Integer hospitalId;
	
	
	public Patient() {}


	


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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}





	public Integer getDoctorId() {
		return doctorId;
	}





	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}





	public Integer getHospitalId() {
		return hospitalId;
	}





	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	

	
}
