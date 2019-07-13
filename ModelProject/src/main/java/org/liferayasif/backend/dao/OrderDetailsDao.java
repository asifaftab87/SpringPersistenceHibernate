package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.OrderDetails;

public interface OrderDetailsDao {

public List<OrderDetails> getAllOrderDetails();
	
	public OrderDetails getOrderDetailsById(Integer id);
	
	public OrderDetails addOrderDetails(OrderDetails orderDetails);
	
	public void deleteOrderDetails(Integer id);
	
	public OrderDetails updateOrderDetails(OrderDetails orderDetails);
	
	public List<OrderDetails> findByName(String name);
}
