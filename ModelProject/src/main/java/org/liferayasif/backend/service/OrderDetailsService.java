package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.OrderDetails;

public interface OrderDetailsService {
	
	public List<OrderDetails> getAllOrderDetails();
	
	public OrderDetails getOrderDetailsById(Integer orderDetails);
	
	public OrderDetails addOrderDetails(OrderDetails orderDetails);
	
	public void deleteOrderDetails(Integer id);
	
	public OrderDetails updateOrderDetails(OrderDetails orderDetails);
	
	public List<OrderDetails> findByName(String name);

}
