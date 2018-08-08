package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers implements Serializable{
	
	private static final long serialVersionUID = 8479324842461047522L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName; 
	
	@Column(name="LAST_NAME")
	private String last_name;

	@Column(name="CLASS")
	private String class1;
	
	@Column(name="ROOM")
	private String room;
	
	@Column(name="BUILDING")
	private String building;
	
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
	private String country;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="VOICE_MAIL")
	private String voicMail;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CREDIT_CARD")
	private String creditCard;
	
	@Column(name="CREDIT_CARD_TYPE_ID")
	private String creditCardTypeId;
	
	
	@Column(name="CARD_EXP_MO")
	private String cardExpMo;
	
	
	@Column(name="CARD_EXP_YR")
	private String cardExpYr;
	
	
	@Column(name="BILLING_ADDRESS")
	private String billingAddress;
	
	
	@Column(name="BILLING_CITY")
	private String billingCity;
	
	
	@Column(name="BILLING_REGION")
	private String billingRegion;
	
	
	@Column(name="BILLING_POSTAL_CODE")
	private String billingPostalCode;
	
	
	@Column(name="BILLING_COUNTRY")
	private String billingCountry;
	
	
	@Column(name="SHIP_ADDRESS")
	private String shipAddress;
	
	@Column(name="SHIP_CITY")
	private String shipCity;
	
	@Column(name="SHIP_REGION")
	private String shipRegion;
	
	@Column(name="SHIP_POSTAL_CODE")
	private String shipPostalCode;
	
	@Column(name="SHIP_COUNTRY")
	private String shipCountry;
	
	@Column(name="DATE_ENTERED")
	private String dateEntered;
	
	public Customers() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVoicMail() {
		return voicMail;
	}

	public void setVoicMail(String voicMail) {
		this.voicMail = voicMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getCreditCardTypeId() {
		return creditCardTypeId;
	}

	public void setCreditCardTypeId(String creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}

	public String getCardExpMo() {
		return cardExpMo;
	}

	public void setCardExpMo(String cardExpMo) {
		this.cardExpMo = cardExpMo;
	}

	public String getCardExpYr() {
		return cardExpYr;
	}

	public void setCardExpYr(String cardExpYr) {
		this.cardExpYr = cardExpYr;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingRegion() {
		return billingRegion;
	}

	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}

	public String getBillingPostalCode() {
		return billingPostalCode;
	}

	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipRegion() {
		return shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	public String getShipCountry() {
		return shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

	public String getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}
}
