package org.liferayasif.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders implements Serializable{
		
		private static final long serialVersionUID = 8479324842461047522L;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ORDER_ID")
		private Integer id;
		
		@Column(name="CUSTOMER_ID")
		private String customerId; 
		
		@Column(name="ORDER_NUMBER")
		private String orderNumber;

		@Column(name="PAYMENT_ID")
		private String paymentId;
		
		@Column(name="ORDER_DATE")
		private String orderDate;
		
		@Column(name="SHIP_DATE")
		private String shipDate;
		
		@Column(name="REQUIRED_DATE")
		private String requiredDate;
		
		@Column(name="SHIPPER_ID")
		private String shipperId;
		
		@Column(name="FREIGHT")
		private String freight;
		
		@Column(name="SALES_TAX")
		private String salesTax;

		@Column(name="TIME_STAMP")
		private String timeStamp;
		
		@Column(name="TRANSACT_STATUS")
		private String transactStatus;
		
		@Column(name="ERR_LOC")
		private String errLoc;
		
		@Column(name="ERR_MSG")
		private String errMsg;
		
		@Column(name="FULFILLED")
		private String fulfilled;
		
		@Column(name="DELETED")
		private String deleted;
		
		@Column(name="PAID")
		private String paid;
		
		@Column(name="PAYMENT_DATE")
		private String paymentDate;
		
		public Orders() {}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
		}

		public String getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public String getShipDate() {
			return shipDate;
		}

		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}

		public String getRequiredDate() {
			return requiredDate;
		}

		public void setRequiredDate(String requiredDate) {
			this.requiredDate = requiredDate;
		}

		public String getShipperId() {
			return shipperId;
		}

		public void setShipperId(String shipperId) {
			this.shipperId = shipperId;
		}

		public String getFreight() {
			return freight;
		}

		public void setFreight(String freight) {
			this.freight = freight;
		}

		public String getSalesTax() {
			return salesTax;
		}

		public void setSalesTax(String salesTax) {
			this.salesTax = salesTax;
		}

		public String getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getTransactStatus() {
			return transactStatus;
		}

		public void setTransactStatus(String transactStatus) {
			this.transactStatus = transactStatus;
		}

		public String getErrLoc() {
			return errLoc;
		}

		public void setErrLoc(String errLoc) {
			this.errLoc = errLoc;
		}

		public String getErrMsg() {
			return errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public String getFulfilled() {
			return fulfilled;
		}

		public void setFulfilled(String fulfilled) {
			this.fulfilled = fulfilled;
		}

		public String getDeleted() {
			return deleted;
		}

		public void setDeleted(String deleted) {
			this.deleted = deleted;
		}

		public String getPaid() {
			return paid;
		}

		public void setPaid(String paid) {
			this.paid = paid;
		}

		public String getPaymentDate() {
			return paymentDate;
		}

		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}
		
		
}
