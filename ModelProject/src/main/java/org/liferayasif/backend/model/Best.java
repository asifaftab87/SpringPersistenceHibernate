package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Best")
public class Best implements Serializable{
	
	
	private static final long serialVersionUID = 5790368220300925279L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="Id_Best")
	private int idBest;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DOB")
	private int dob;
	
	@Column(name="GENDER")
	private String gender;
	
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="MOBILE_NO")
	private String mobileNo;
	
	public Best(){};
	
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
		return dob;
	}

	public void setDOB(int dob) {
		this.dob = dob;
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

	public void setState(String state) {
		this.state = state;
	}

	
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	

}
