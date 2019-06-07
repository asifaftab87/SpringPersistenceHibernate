package org.liferayasif.front.dto;

public class DoctorDto {

	private Integer id;
	private String fName;
	private String lName;
	private String email;
	private String phone;
	private Integer hospitalId;
	private String specialization;

	public DoctorDto(){}



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



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Integer getHospitalId() {
		return hospitalId;
	}



	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}