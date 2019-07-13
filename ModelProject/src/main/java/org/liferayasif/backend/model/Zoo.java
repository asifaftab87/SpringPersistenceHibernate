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
@Table(name="ZOO")

public class Zoo implements Serializable{
 

	private static final long serialVersionUID = -2316546631981838231L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID")
private Integer id;

@Column(name="NAME")
private String name;


@Column(name="EMAIL")
private String email;


@Transient
public List<ZooAddress> zooAddressList;

public Zoo(){}

public Integer getId(){
	return id;
}

public void setId(Integer id){
	
	this.id=id;
}
public String getName(){
	return name;
}

public void setName(String name){
	
	this.name=name;
}
public String getEmail(){
	return email;
}

public void setEmail(String email){
	
	this.email=email;
}

public List<ZooAddress> getZooAddressList(){
	return zooAddressList;
}

public void setZooAddressList(List<ZooAddress> zooAddressList)
{
	this.zooAddressList=zooAddressList;
}

}
