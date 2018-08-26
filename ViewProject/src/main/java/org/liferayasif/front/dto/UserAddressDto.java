package org.liferayasif.front.dto;

import java.sql.Timestamp;

public class UserAddressDto {
	private Integer id;
	private Integer userId;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String postcode;
	private String city;
	private String state;
	private String cntry;
	private String telNum;
	private String crtId;
	private Timestamp crtDt;
	private String updtId;
	private Timestamp updtDt;
	private String status;
	
	public UserAddressDto (){};
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getCntry() {
		return cntry;
	}
	public void setCntry(String cntry) {
		this.cntry = cntry;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getCrtId() {
		return crtId;
	}
	public void setCrtId(String crtId) {
		this.crtId = crtId;
	}
	public Timestamp getCrtDt() {
		return crtDt;
	}
	public void setCrtDt(Timestamp crtDt) {
		this.crtDt = crtDt;
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
