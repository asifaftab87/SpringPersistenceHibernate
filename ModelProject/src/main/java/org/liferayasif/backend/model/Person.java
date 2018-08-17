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
	 private String personKinId; 
	 
	 @Column(name="NAME")
	 private String name;
	 
	 
	 @Column(name="DOB")
	 private Long dob;
	 
	 
	 @Column(name="FATHER_NAME")
	 private String fatherName;
	 
	 
	 @Column(name="BIRTH_PLACE")
	 private String birthPlace;
	 
	@Transient
	public List<PersonContact> personContactList;
	 
	@Transient
	 public List<PersonKin> personKinList;
	 
	 public Person(){};
	 
	 public void setId(Long id)
	 {
		 this.id=id;
	 }
	public Long getId()
	{
		return id;
	}
	
	 public void setPersonKinId(String personKinId)
	 {
		 this.personKinId=personKinId;
	 }
	 
	public String getpersonKinId()
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
	
	public void setPersonContactList(List<PersonContact> personContactList)
	{
		this.personContactList=personContactList;
	}
	public List<PersonContact> getPersonContactList()
	{
		return personContactList;
	}
	public void setPersonKin(List<PersonKin> personKinList )
	{
		this.personKinList=personKinList;
	}
	public List<PersonKin> getPersonKinList()
	{
		return personKinList;
	}
}
