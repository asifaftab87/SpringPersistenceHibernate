package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.OrdersDao;
import org.liferayasif.backend.model.Orders;
import org.liferayasif.backend.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ordersService")
@Transactional
public class OrdersServiceImpl implements OrdersService{

		@Autowired
		private OrdersDao ordersDao;
		
		@Override
		public List<Orders> getAllOrders() {
			List<Orders> userList = ordersDao.getAllOrders();
			return userList;
		}

		@Override
		public Orders getOrdersById(Integer id) {
			Orders orders = ordersDao.getOrdersById(id);
			return orders;
		}

		@Override
		public Orders addOrders(Orders orders) {
			return ordersDao.addOrders(orders);
		}

		@Override
		public void deleteOrders(Integer id) {
			ordersDao.deleteOrders(id);
		}

		@Override
		public Orders updateOrders(Orders orders) {
			return ordersDao.updateOrders(orders);
		}
		
		@Override
		public List<Orders> findByName(String name){
			return ordersDao.findByName(name);
		}

}
