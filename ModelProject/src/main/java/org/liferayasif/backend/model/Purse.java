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
@Table(name="PURSE")

public class Purse implements Serializable {
	
	private static final long serialVersionUID = -2048027331056057957L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PURSE_ID")
	private Integer id;
	
	@Column(name="PURSE_BIG_ID")
	private Integer purseBigId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="PRICE")
	private Integer price;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@Transient
	private List<PurseBig> purseBig;
	
	public List<PurseBig> getPurseBig() {
		return purseBig;
	}

	public void setPurseBig(List<PurseBig> purseBig) {
		this.purseBig = purseBig;
	}

	
	
	public Purse(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPurseBigId() {
		return purseBigId;
	}

	public void setPurseBigId(Integer purseBigId) {
		this.purseBigId = purseBigId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

		

}
