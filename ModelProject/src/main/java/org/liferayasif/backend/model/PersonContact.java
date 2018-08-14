package org.liferayasif.backend.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PERSON_CONTACT")
public class PersonContact implements Serializable {

	private static final long serialVersionUID = -2882877810666694524L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_CONTACT_ID")
	private Long id;
	
	@Column(name="PERSON_ID")
	private Long personId;
	
	
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
	
	@Column(name="CNTRY")
	private String cntry;
	
	@Column(name="TEL_NUM")
	private String telNum;
	
	@Column(name="CRT_ID")
	private String crtId;
	
	@Column(name="CRT_DT")
	private Timestamp crtDt;
	
	@Column(name="UPDT_ID")
	private String updtId;
	
	@Column(name="UPDT_DT")
	private Timestamp updtDt;
	
	@Column(name="STATUS")
	private String status;

	public PersonContact(){};
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
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

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public List<PersonKin> getPersonKin() {
		return personKin;
	}

	public void setPersonKin(List<PersonKin> personKin) {
		this.personKin = personKin;
	}

	@Transient
	private List<Person> person;
	
	@Transient
	private List<PersonKin> personKin;
	
	
	

}
