package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.OrderDetail;

public interface OrderDetailService {

	public List<OrderDetail> getAllOrderDetails();
	
	public OrderDetail getOrderDetailById(Integer id);
	
	public OrderDetail addOrderDetail(OrderDetail orderDetail);
	
	public void deleteOrderDetail(Integer id);
	
	public OrderDetail updateOrderDetail(OrderDetail orderDetail);
	
	public List<OrderDetail> findByName(String name);
	
}
