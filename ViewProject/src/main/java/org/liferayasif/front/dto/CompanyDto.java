package org.liferayasif.front.dto;

public class CompanyDto {
	
	private Integer id;
	private String name;
	private String email;
	private Integer num;

	public CompanyDto() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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

}
