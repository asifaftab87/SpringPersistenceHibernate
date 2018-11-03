package org.liferayasif.front.dto;

public class BestDto {

	
	private int idBest;
	private String name;	
	private int DOB;
	private String gender;
	private String address;
	private String email;
	private String country;
	private String state;
	private String mobileNo;
	
	
	public BestDto(){};
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getIdBest() {
		return idBest;
	}

	public void setIdBest(int idBest) {
		this.idBest = idBest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setCity(String state) {
		this.state = state;
	}

	
	
	
	
	
	
	
}
