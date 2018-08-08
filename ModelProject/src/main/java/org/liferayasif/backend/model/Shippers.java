package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shippers")
public class Shippers implements Serializable{
	private static final long serialVersionUID = 8479324842461047522L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SHIPPER_ID")
	private Integer id;
	
	@Column(name="COMPANY_NAME")
	private Integer companyName;

	@Column(name="PHONE")
	private Integer phone;
	
	public Shippers() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Integer companyName) {
		this.companyName = companyName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	


	

}
