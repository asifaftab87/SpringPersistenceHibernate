package org.liferayasif.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="add1")
	private String id;
	
	@Column(name="add2")
	private String add2;
	
	@Column(name="add3")
	private String add3;
	
	public Address() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	
	@Override
	public String toString(){
		return "address 1 : "+id+"   address  2 : "+add2+"    address  3 : "+add3;
	}

	public void setAdd1(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
