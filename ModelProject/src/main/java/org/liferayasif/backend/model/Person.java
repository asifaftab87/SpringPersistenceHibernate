package org.liferayasif.backend.model;


import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PERSON")
public class Person implements Serializable {

	
	private static final long serialVersionUID = 6406331157651010390L;
	
	 @Id 
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	 @Column(name="PERSON_ID")
	 private Long id ;
	 
	 @Column(name="PERSON_KIN_ID")
	 private Long personKinId; 
	 
	 @Column(name="NAME")
	 private String name;
	 
	 
	 @Column(name="DOB")
	 private Long dob;
	 
	 
	 @Column(name="FATHER_NAME")
	 private String fatherName;
	 
	 
	 @Column(name="BIRTH_PLACE")
	 private String birthPlace;
	 
	@Transient
	public List<PersonContact> personContact;
	 
	@Transient
	 public List<PersonKin> personKin;
	 
	 public Person(){};
	 
	 public void setId(Long id)
	 {
		 this.id=id;
	 }
	public Long getId()
	{
		return id;
	}
	
	 public void setPersonKinId(Long personKinId)
	 {
		 this.personKinId=personKinId;
	 }
	public Long getpersonKinId()
	{
		return personKinId;
	}
	
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	public String getName()
	{
		return name;
	}
	
	public void setDob(Long dob)
	 {
		 this.dob=dob;
	 }
	public Long getDob()
	{
		return dob;
	}
	
	public void setFatherName(String fatherName)
	 {
		 this.fatherName=fatherName;
	 }
	public String getFatherName()
	{
		return fatherName;
	}
	
	public void setBirthPlace(String birthPlace)
	 {
		 this.birthPlace=birthPlace;
	 }
	public String getBirthPlace()
	{
		return birthPlace;
	}
	
	public void setPersonContact(List<PersonContact> personContact)
	{
		this.personContact=personContact;
	}
	public List<PersonContact> getPersonContact()
	{
		return personContact;
	}
	public void setPersonKin(List<PersonKin> personKin )
	{
		this.personKin=personKin;
	}
	public List<PersonKin> getPersonKin()
	{
		return personKin;
	}
}
