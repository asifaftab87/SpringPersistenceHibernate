package org.liferayasif.front.dto;

 
public class PersonDto {
	
	private Integer id ;
	private String personKinId; 
	private String name;
	private Integer dob;
	private String fatherName;
	private String birthPlace;
	 
	public PersonDto(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonKinId() {
		return personKinId;
	}

	public void setPersonKinId(String personKinId) {
		this.personKinId = personKinId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDob() {
		return dob;
	}

	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	/*@Transient
	public List<PersonContact> personContactList;
	 
	@Transient
	 public List<PersonKin> personKinList;*/

}
