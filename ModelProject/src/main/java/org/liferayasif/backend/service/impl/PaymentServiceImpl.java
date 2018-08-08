package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.PaymentDao;
import org.liferayasif.backend.model.Payment;
import org.liferayasif.backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public List<Payment> getAllPayment() {
		List<Payment> paymentList = paymentDao.getAllPayment();
		return paymentList;
	}

	@Override
	public Payment getPaymentById(Integer id) {
		Payment payment = paymentDao.getPaymentById(id);
		return payment;
	}

	@Override
	public Payment addPayment(Payment payment) {
		return paymentDao.addPayment(payment);
	}

	@Override
	public void deletePayment(Integer id) {
		paymentDao.deletePayment(id);
	}

	@Override
	public Payment updatePayment(Payment payment) {
		return paymentDao.updatePayment(payment);
	}
	
	@Override
	public List<Payment> findByName(String name){
		return paymentDao.findByName(name);
	}


}
