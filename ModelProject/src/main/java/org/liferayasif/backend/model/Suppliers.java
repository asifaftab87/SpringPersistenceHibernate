package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIERS")
public class Suppliers implements Serializable {

	private static final long serialVersionUID = -5337377630175988844L;
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="SUPPLIERS_ID")
private Integer id;

@Column(name="SUPPLIER_ID")
private String supplierId;

@Column(name="COMPANY_NAME")
private String companyName;

@Column(name="CONTACT_FNAME")
private String contactFName;

@Column(name="CONTACT_LNAME")
private String contactLName;

@Column(name="CONTACT_TITLE")
private String contactTitle;

@Column(name="ADDRESS1")
private String address1;

@Column(name="ADDRESS2")
private String address2;

@Column(name="CITY")
private String city;

@Column(name="STATE")
private String state;

@Column(name="POSTAL_CODE")
private String postalCode;

@Column(name="COUNTRY")
private String country ;

@Column(name="PHONE")
private String phone ;

@Column(name="FAX")
private String fax;

@Column(name="EMAIL")
private String email;

@Column(name="URL")
private String url;

@Column(name="PAYMENT_METHODS")
private String paymentMethods;

@Column(name="DISCOUNT_TYPE")
private String discountType;

@Column(name="TYPE_GOODS")
private String typeGoods;

@Column(name="NOTES")
private String notes;

@Column(name="DISCOUNT_AVAILABLE")
private String discountAvailable;

@Column(name="CURRENT_ORDER")
private String currentOrder;

@Column(name="LOGO")
private String logo;

@Column(name="CUSTOMER_ID")
private String customerId;

@Column(name="SIZE_URL")
private String sizeURL;

public Suppliers(){};

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getSupplierId() {
	return supplierId;
}

public void setSupplierId(String supplierId) {
	this.supplierId = supplierId;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getContactFName() {
	return contactFName;
}

public void setContactFName(String contactFName) {
	this.contactFName = contactFName;
}

public String getContactLName() {
	return contactLName;
}

public void setContactLName(String contactLName) {
	this.contactLName = contactLName;
}

public String getContactTitle() {
	return contactTitle;
}

public void setContactTitle(String contactTitle) {
	this.contactTitle = contactTitle;
}

public String getAddress1() {
	return address1;
}

public void setAddress1(String address1) {
	this.address1 = address1;
}

public String getAddress2() {
	return address2;
}

public void setAddress2(String address2) {
	this.address2 = address2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPostalCode() {
	return postalCode;
}

public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getFax() {
	return fax;
}

public void setFax(String fax) {
	this.fax = fax;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getPaymentMethods() {
	return paymentMethods;
}

public void setPaymentMethods(String paymentMethods) {
	this.paymentMethods = paymentMethods;
}

public String getDiscountType() {
	return discountType;
}

public void setDiscountType(String discountType) {
	this.discountType = discountType;
}

public String getTypeGoods() {
	return typeGoods;
}

public void setTypeGoods(String typeGoods) {
	this.typeGoods = typeGoods;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
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

public String getLogo() {
	return logo;
}

public void setLogo(String logo) {
	this.logo = logo;
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getSizeURL() {
	return sizeURL;
}

public void setSizeURL(String sizeURL) {
	this.sizeURL = sizeURL;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}



	
}
