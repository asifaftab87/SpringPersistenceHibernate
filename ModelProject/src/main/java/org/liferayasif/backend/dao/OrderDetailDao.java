package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.OrderDetail;

public interface OrderDetailDao {
	
	public List<OrderDetail> getAllOrderDetails();
	
	public OrderDetail getOrderDetailById();
	
	public OrderDetail addOrderDetail();
	
	
	
	
}
