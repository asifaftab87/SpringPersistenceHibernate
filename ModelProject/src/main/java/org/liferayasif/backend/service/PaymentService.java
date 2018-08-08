package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Payment;

public interface PaymentService {

	public List<Payment> getAllPayment();
	
	public Payment getPaymentById(Integer id);
	
	public Payment addPayment(Payment payment);
	
	public void deletePayment(Integer id);
	
	public Payment updatePayment(Payment payment);
	
	public List<Payment> findByName(String name);


}
