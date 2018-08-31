package org.liferayasif.front.dto;

public class PurseDto {
	
	
	private Integer id;
	private Integer purseBigId;
	private String name;
	private String color;
	private Integer price;
	private Integer quantity;
	
	public PurseDto(){};
	
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
