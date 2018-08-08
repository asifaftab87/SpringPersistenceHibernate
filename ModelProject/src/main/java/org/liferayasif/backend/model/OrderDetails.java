package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class OrderDetails implements Serializable{
	
	private static final long serialVersionUID = 8479324842461047522L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Integer id;
	
	@Column(name="PRODUCT_ID")
	private String productId; 
	
	@Column(name="ORDER_NUMBER")
	private String orderNumber;

	@Column(name="PRICE")
	private String price;
	
	@Column(name="QUANTITY")
	private String quantity;
	
	@Column(name="DISCOUNT")
	private String discount;
	
	@Column(name="TOTAL")
	private String total;
	
	@Column(name="IDSKU")
	private String idsku;
	
	@Column(name="SIZE")
	private String size;
	
	@Column(name="COLOR")
	private String color;

	@Column(name="FULFILLED")
	private String fulfilled;
	
	@Column(name="SHIP_DATE")
	private String shipDate;
	
	@Column(name="ODER_DETAIL_ID")
	private String orderDetailId;
	
	@Column(name="BILL_DATE")
	private String billDate;
	
	public OrderDetails() {}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getIdsku() {
		return idsku;
	}

	public void setIdsku(String idsku) {
		this.idsku = idsku;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFulfilled() {
		return fulfilled;
	}

	public void setFulfilled(String fulfilled) {
		this.fulfilled = fulfilled;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
}
