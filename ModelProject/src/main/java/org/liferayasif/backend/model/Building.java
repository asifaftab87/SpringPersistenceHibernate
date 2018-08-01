package org.liferayasif.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="building")
public class Building {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FLOORS")
	private int floors;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="FLATS")	
	private int flats;
	
	@Column(name="NAME")	
	private String name;
	
	public Building() {}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFlats() {
		return flats;
	}

	public void setFlats(int flats) {
		this.flats = flats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "floors: "+floors+"   address: "+address+"    flats: "+flats+"    name: "+name;
	}
	
}
