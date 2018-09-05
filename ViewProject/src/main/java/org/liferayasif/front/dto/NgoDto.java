package org.liferayasif.front.dto;

import java.util.Date;

public class NgoDto {
	
	private Integer id;
	private String fullName;
	private String fatherName;
	private String motherName;
	private Date birthDate;
	private String birthDateString;
	private String gender;
	private String password;
	private String confirmPassword ;
	private String address ;
	private String city;
	private String state;
	private String country;
	private Integer pinCode;
	private Long mobileNo ;
	private String emailAddress;
	private Double yearlyIncome ;
	private Double yearlyExpense ;
	
	public NgoDto (){};

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Double getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public Double getYearlyExpense() {
		return yearlyExpense;
	}
	public void setYearlyExpense(Double yearlyExpense) {
		this.yearlyExpense = yearlyExpense;
	}





	public String getBirthDateString() {
		return birthDateString;
	}





	public void setBirthDateString(String birthDateString) {
		this.birthDateString = birthDateString;
	}
	

}
