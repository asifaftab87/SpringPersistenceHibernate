package org.liferayasif.backend.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY_ADDRESS")
public class CompanyAddress implements Serializable {

	
	private static final long serialVersionUID = -9029820225530278557L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COMPANY_ADDRESS_ID")
	private Integer id;
	
	@Column(name="COMPANY_ID")
	private Integer companyId;
	
	@Column(name="ADDRESS1")
	private String address1;
	
	@Column(name="ADDRESS2")
	private String address2;
	
	
	@Column(name="ADDRESS3")
	private String address3;
	
	
	@Column(name="ADDRESS4")
	private String address4;
	
	@Column(name="POSTCODE")
	private String postcode;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="TEL_NUM")
	private String telNum;
	
	@Column(name="CREATE_ID")
	private String createId;
	
	@Column(name="CREATE_DT")
	private Timestamp createDt;
	
	@Column(name="UPDT_ID")
	private String updtId;
	
	@Column(name="UPDT_DT")
	private Timestamp updtDt;
	
	@Column(name="STATUS")
	private String status;
	
	
	public  CompanyAddress(){}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	


	public Integer getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getAddress3() {
		return address3;
	}


	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getAddress4() {
		return address4;
	}


	public void setAddress4(String address4) {
		this.address4 = address4;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
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


	public String getTelNum() {
		return telNum;
	}


	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}


	public String getCreateId() {
		return createId;
	}


	public void setCreateId(String createId) {
		this.createId = createId;
	}


	public Timestamp getCreateDt() {
		return createDt;
	}


	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}


	public String getUpdtId() {
		return updtId;
	}


	public void setUpdtId(String updtId) {
		this.updtId = updtId;
	}


	public Timestamp getUpdtDt() {
		return updtDt;
	}


	public void setUpdtDt(Timestamp updtDt) {
		this.updtDt = updtDt;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
