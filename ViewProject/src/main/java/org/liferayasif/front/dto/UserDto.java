package org.liferayasif.front.dto;

import java.util.Date;
import java.util.List;

public class UserDto {

	private Integer id;
	private String name;
	private String email;
	private Date dob;
	private Integer contactId;
	private String rollNum;
	
	private List<UserAddressDto> UserAddressDtoList;
	
	public List<UserAddressDto> getUserAddresList() {
		return UserAddressDtoList;
	}

	public void setUserAddressList(List<UserAddressDto> userAddressDtoList) {
		UserAddressDtoList = userAddressDtoList;
	}

	public UserDto(){}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "id: "+id+"   name: "+name+"    email: "+email;
	}


	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	
}