package org.liferayasif.backend.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.liferayasif.backend.abstrct.dao.AbstractDao;
import org.liferayasif.backend.dao.OrderDetailDao;
import org.liferayasif.backend.model.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailDaoImpl  extends AbstractDao<Integer , OrderDetail> implements OrderDetailDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetail> getAllOrderDetails() {
		Criteria criteria = createEntityCriteria();
		return (List<OrderDetail>) criteria.list();
	}

	@Override
	public OrderDetail getOrderDetailById(Integer id) {
		return getByKey(id);
	}

	@Override
	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		persist(orderDetail);
		return orderDetail;
	}

	@Override
	public void deleteOrderDetail(Integer id) {
	Query query = getSession().createSQLQuery("delete from OrderDetail where is  id = :id" );
	query.executeUpdate();
		
	}

	@Override
	public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
		getSession().update(orderDetail);
		return orderDetail;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetail> findByName(String name) {
		Criteria criteria  = getSession().createCriteria(OrderDetail.class);
		criteria.add(Restrictions.eq("name" , name));
		List<OrderDetail> orderDetail = criteria.list();
		return orderDetail;
	}
	
	

}
