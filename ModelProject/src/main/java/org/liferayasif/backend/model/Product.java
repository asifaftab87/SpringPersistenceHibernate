package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{

	private static final long serialVersionUID = -2666890559041776278L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private Integer Id;
	
		
	@Column(name="SKU")
	private String sku; 
	
	@Column(name="ID_SKU")
	private Integer idSku ; 
	
	@Column(name="VENDOR_PRODUCT_ID")
	private Integer vendorProductId ; 
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription; 
	
	@Column(name="SUPPLIER_ID")
	private Integer supplierId ; 
	
	@Column(name="CATEGORY_ID")
	private Integer categoryId; 
	
	@Column(name="QUATITY_PER_UNIT")
	private Integer quantityPerUnit; 
	
	@Column(name="UNIT_PRICE")
	private Double unitPrice; 
	
	@Column(name="MSRP")
	private String Msrp; 
	
	@Column(name="AVAILABLE_SIZE")
	private Integer availableSize; 
	
	@Column(name="AVAILABLE_COLORS")
	private String availableColors; 
	
	@Column(name="SIZE")
	private Integer size; 
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="DISCOUNT")
	private String discount; 
	
	@Column(name="UNIT_WEIGHT")
	private Integer unitWeight; 
	
	@Column(name="UNITS_IN_STOCK")
	private Integer unitInStock; 
	
	@Column(name="UNITS_ON_ORDER")
	private String unitOnOrder; 
	
	@Column(name="REORDER_LEVEL")
	private String reorderLevel; 

	@Column(name="PRODUCT_AVAILABLE")
	private String productAvailable;
	
	@Column(name="DISCOUNT_AVAILABLE")
	private String discountAvailable; 
	
	@Column(name="CURRENT_ORDER")
	private String currentOrder; 
	
	@Column(name="PICTURE")
	private String picture; 
	
	@Column(name="RANKING")
	private String ranking; 
	
	@Column(name="NOTE")
	private String note; 
	
	public Product(){}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getIdSku() {
		return idSku;
	}

	public void setIdSku(Integer idSku) {
		this.idSku = idSku;
	}

	public Integer getVendorProductId() {
		return vendorProductId;
	}

	public void setVendorProductId(Integer vendorProductId) {
		this.vendorProductId = vendorProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(Integer quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getMsrp() {
		return Msrp;
	}

	public void setMsrp(String msrp) {
		Msrp = msrp;
	}

	public Integer getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(Integer availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColors() {
		return availableColors;
	}

	public void setAvailableColors(String availableColors) {
		this.availableColors = availableColors;
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

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Integer getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(Integer unitWeight) {
		this.unitWeight = unitWeight;
	}

	public Integer getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(Integer unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getUnitOnOrder() {
		return unitOnOrder;
	}

	public void setUnitOnOrder(String unitOnOrder) {
		this.unitOnOrder = unitOnOrder;
	}

	public String getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public String getDiscountAvailable() {
		return discountAvailable;
	}

	public void setDiscountAvailable(String discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	public String getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(String currentOrder) {
		this.currentOrder = currentOrder;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	

	
}
