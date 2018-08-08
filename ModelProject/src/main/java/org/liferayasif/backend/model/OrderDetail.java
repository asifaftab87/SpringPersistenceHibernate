package org.liferayasif.backend.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetail implements Serializable{

	
	private static final long serialVersionUID = -2673443256098908932L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Integer Id;
	
	@Column(name="PRODUCT_ID")
	private String  productID;
	
	
	@Column(name="ORDER_NUMBER")
	private Integer  orderNumber;
	
	@Column(name="PRICE")
	private Double  price;
	
	@Column(name="QUANTITY")
	private String  quantity;
	
	@Column(name="DISCOUNT")
	private String discount ;
	
	@Column(name="TOTAL")
	private String total ;
	
	@Column(name="IDSKU")
	private String  idsku;
	
	
	@Column(name="SIZE")
	private Integer size  ;
	
	@Column(name="COLOR")
	private String  color;
	
	@Column(name="FULL_FILLED")
	private String  full_filled;
	
	@Column(name="SHIP_DATE")
	private Timestamp shipDate  ;
	
	@Column(name="ORDER_DETAIL_ID")
	private String  orderDetailId;
	
	@Column(name="BILL_DATE")
	private Timestamp billDate  ;
	
	public OrderDetail (){};

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFull_filled() {
		return full_filled;
	}

	public void setFull_filled(String full_filled) {
		this.full_filled = full_filled;
	}

	public Timestamp getShipDate() {
		return shipDate;
	}

	public void setShipDate(Timestamp shipDate) {
		this.shipDate = shipDate;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Timestamp getBillDate() {
		return billDate;
	}

	public void setBillDate(Timestamp billDate) {
		this.billDate = billDate;
	}
	
	
	
}

	
	


	
	

