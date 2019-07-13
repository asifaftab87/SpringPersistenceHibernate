package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PURSE_BIG")
public class PurseBig implements Serializable{

	private static final long serialVersionUID = 727339460267050978L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PURSE_BIG_ID")
	private Integer id;
	
	@Column(name="PURSE_ID")
	private Integer purseId;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPurseId() {
		return purseId;
	}

	public void setPurseId(Integer purseId) {
		this.purseId = purseId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Column (name="BUYER_NAME")
	private String buyerName;
	
	@Column (name="AGE")
	private Integer age ;
	
	@Column (name="STATE")
	private String state;
	
	@Column (name="CITY")
	private String city;
	
	@Column (name="PIN_CODE")
	private Integer pinCode ;
	
	@Column (name="MODE_OF_PAYMENT")
	private String modeOfPayment;
	
	@Column(name="ID_PROOF")
	private String idProof;
	
	@Column(name="PAYMENT_AMOUNT")
	private Integer paymentAmount;

}
