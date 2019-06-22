package org.liferayasif.front.dto;

import java.util.Date;

public class RegistrationDto {

	private Integer id;
	private Integer hospitalId;
	private Integer doctorId;
	private Integer patientId;
	//date of registration
	private Date dor;
	private String outpatient;
	


	public RegistrationDto(){}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getHospitalId() {
		return hospitalId;
	}



	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}



	public Integer getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}



	public Integer getPatientId() {
		return patientId;
	}



	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}



	public Date getDor() {
		return dor;
	}



	public void setDor(Date dor) {
		this.dor = dor;
	}



	public String getOutpatient() {
		return outpatient;
	}



	public void setOutpatient(String outpatient) {
		this.outpatient = outpatient;
	}

}