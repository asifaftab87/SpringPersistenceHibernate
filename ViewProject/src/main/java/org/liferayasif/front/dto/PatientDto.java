package org.liferayasif.front.dto;

import java.util.Date;

public class PatientDto {

	private Integer id;
	private String fName;
	private String lName;
	private String email;
	private Integer age;
	private String phone;
	private Integer doctorId;
	private Integer hospitalId;
	//date of birth
	private Date dob;
	//date of entry
	private Date doe;
	//date of release
	private Date dor;
	//cured
	private String c;
	


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



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public Date getDoe() {
		return doe;
	}



	public void setDoe(Date doe) {
		this.doe = doe;
	}



	public Date getDor() {
		return dor;
	}



	public void setDor(Date dor) {
		this.dor = dor;
	}



	public String getC() {
		return c;
	}



	public void setC(String c) {
		this.c = c;
	}




	
}