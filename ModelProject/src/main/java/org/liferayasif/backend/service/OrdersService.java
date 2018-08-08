package org.liferayasif.backend.service;

import java.util.List;

import org.liferayasif.backend.model.Orders;

public interface OrdersService {
	
	public List<Orders> getAllOrders();
	
	public Orders getOrdersById(Integer user);
	
	public Orders addOrders(Orders orders);
	
	public void deleteOrders(Integer id);
	
	public Orders updateOrders(Orders orders);
	
	public List<Orders> findByName(String name);

}
