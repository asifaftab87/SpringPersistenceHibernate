package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable{

	
	private static final long serialVersionUID = 1748103942871529072L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private Integer id;

	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	
	@Column(name="PICTURE")
	private String picture;
	
	
	@Column(name="ACTIVE")
	private String active;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}
	
	
	
	
}
