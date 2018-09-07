package org.liferayasif.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WORKER")

public class Worker  implements Serializable{

	private static final long serialVersionUID = 2539116631575223437L;
	
	@Id					
	@GeneratedValue(strategy = GenerationType.AUTO)					
	@Column(name="WORKER_ID")					
	private Integer id;					
						
	
	@Column(name = "FULL_NAME")				
	private String fullName;				
					
	@Column(name = "Father_NAME")				
	private String fatherName;				
					
	@Column(name = "SPOUSE_NAME ")				
	private String motherName;				
					
	@Column(name = "GENDER ")				
	private String gender ;				
					
	@Column(name = "BIRTH_DATE ")				
	private Date birthDate ;				
					
	@Column(name = "ADDRESS ")				
	private String address ;				
					
	@Column(name = "CITY ")				
	private String city;				
					
	@Column(name = "STATE ")				
	private String state;				
					
	@Column(name = "COUNTRY ")				
	private String country;				
					
					
	@Column(name = "PIN_CODE ")				
	private Integer pinCode;				
					
	@Column(name = "MOBILE_NO ")				
	private Long mobileNo ;				
					
	@Column(name = "EMAIL_ADDRESS ")				
	private String emailAddress;				
					
	@Column(name = "PASSWORD ")				
	private String password ;				
					
	@Column(name = "CONFIRM_PASSWORD ")				
	private String confirmPassword ;				
					
					
	@Column(name = "YEARLY_INCOME ")				
	private Double yearlyIncome ;

	public Worker(){};

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


	public Double getYearlyIncome() {
		return yearlyIncome;
	}


	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}				
			



}
