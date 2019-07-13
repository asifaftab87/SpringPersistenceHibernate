package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.OrdersDao;
import org.liferayasif.backend.model.Orders;
import org.springframework.stereotype.Repository;

@Repository("ordersDao")
public class OrdersDaoImpl extends AbstractDao<Integer, Orders> implements OrdersDao{

	@Override
	@SuppressWarnings("unchecked")
	public List<Orders> getAllOrders() {
		Criteria criteria = createEntityCriteria();
		return (List<Orders>) criteria.list();
	}

	@Override
	public Orders getOrdersById(Integer id) {
		return getByKey(id);
	}

	@Override
	public Orders addOrders(Orders orders) {
		persist(orders);
		return orders;
	}

	@Override
	public void deleteOrders(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public Orders updateOrders(Orders orders) {
		getSession().update(orders);
		return orders;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> findByName(String name){
		
		Criteria criteria = getSession().createCriteria(Orders.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<Orders> ordersList = criteria.list();

		return ordersList;				
	}
	

}
