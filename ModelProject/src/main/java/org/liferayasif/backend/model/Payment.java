package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment implements Serializable{
	
	private static final long serialVersionUID = 8479324842461047522L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PAYMENT_ID")
	private Integer id;
	
	@Column(name="PAYMENT_TYPE")
	private String paymentName; 
	
	@Column(name="ALLOWED")
	private String allowed;
	
	public Payment() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getAllowed() {
		return allowed;
	}

	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
}
