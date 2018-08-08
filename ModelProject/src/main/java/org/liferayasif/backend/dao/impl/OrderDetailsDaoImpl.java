package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.OrderDetailsDao;
import org.liferayasif.backend.model.OrderDetails;
import org.springframework.stereotype.Repository;

@Repository("orderDetails")
public class OrderDetailsDaoImpl extends AbstractDao<Integer, OrderDetails> implements OrderDetailsDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<OrderDetails> getAllOrderDetails() {
		Criteria criteria = createEntityCriteria();
		return (List<OrderDetails>) criteria.list();
	}

	@Override
	public OrderDetails getOrderDetailsById(Integer id) {
		return getByKey(id);
	}

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderDetails) {
		persist(orderDetails);
		return orderDetails;
	}

	@Override
	public void deleteOrderDetails(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
		getSession().update(orderDetails);
		return orderDetails;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetails> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(OrderDetails.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<OrderDetails> orderDetailsList = criteria.list();

		return orderDetailsList;				
	}
	

}
