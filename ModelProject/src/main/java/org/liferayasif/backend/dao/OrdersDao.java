package org.liferayasif.backend.dao;

import java.util.List;

import org.liferayasif.backend.model.Orders;

public interface OrdersDao {
	
	public List<Orders> getAllOrders();
	
	public Orders getOrdersById(Integer id);
	
	public Orders addOrders(Orders orders);
	
	public void deleteOrders(Integer id);
	
	public Orders updateOrders(Orders orders);
	
	public List<Orders> findByName(String name);
	

}
