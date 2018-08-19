package org.liferayasif.backend.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PersonKin")
public class PersonKin implements Serializable {

	private static final long serialVersionUID = 3243419770999905641L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_KIN_ID")
	private Integer id;
	
	
	@Column(name="PERSON_ID")
	private Integer personId ;
	
	@Column(name="NAME")
	private String  name;
	
	@Column(name="RELATION")
	private String  relation;
	
	@Column(name="MOBILE_NO")
	private Long  mobileNo;
	
	@Column(name="EMAIL")
	private String email ;
	
	@Column(name="address")
	private String  address;
	
	public PersonKin(){};
	
	@Transient
	public List<Person> personList;
	
	@Transient
	public List<PersonContact> personContactList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public List<PersonContact> getPersonContactList() {
		return personContactList;
	}

	public void setPersonContactList(List<PersonContact> personContactList) {
		this.personContactList = personContactList;
	}
	
	
	
}
