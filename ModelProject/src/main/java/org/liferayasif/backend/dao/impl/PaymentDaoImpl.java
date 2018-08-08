package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.PaymentDao;
import org.liferayasif.backend.model.Payment;
import org.springframework.stereotype.Repository;

@Repository("paymentDao")
public class PaymentDaoImpl extends AbstractDao<Integer, Payment> implements PaymentDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Payment> getAllPayment() {
		Criteria criteria = createEntityCriteria();
		return (List<Payment>) criteria.list();
	}

	@Override
	public Payment getPaymentById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Payment addPayment(Payment payment) {
		persist(payment);
		return payment;
	}

	@Override
	public void deletePayment(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Payment updatePayment(Payment payment) {
		getSession().update(payment);
		return payment;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Payment> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(Payment.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Payment> paymentList = criteria.list();

		return paymentList;				
	}

}
