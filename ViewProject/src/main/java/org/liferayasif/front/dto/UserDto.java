package org.liferayasif.front.dto;

public class UserDto {

	private Integer id;
	private String name;
	private String email;

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
	
}