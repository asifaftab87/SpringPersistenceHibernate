package org.liferayasif.backend.service.impl;

import java.util.List;

import org.liferayasif.backend.dao.OrderDetailsDao;
import org.liferayasif.backend.model.OrderDetails;
import org.liferayasif.backend.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("orderDetailsService")
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService{

		@Autowired
		private OrderDetailsDao orderDetailsDao;
		
		@Override
		public List<OrderDetails> getAllOrderDetails() {
			List<OrderDetails> orderDetailsList = orderDetailsDao.getAllOrderDetails();
			return orderDetailsList;
		}

		@Override
		public OrderDetails getOrderDetailsById(Integer id) {
			OrderDetails orderDetails = orderDetailsDao.getOrderDetailsById(id);
			return orderDetails;
		}

		@Override
		public OrderDetails addOrderDetails(OrderDetails user) {
			return orderDetailsDao.addOrderDetails(user);
		}

		@Override
		public void deleteOrderDetails(Integer id) {
			orderDetailsDao.deleteOrderDetails(id);
		}

		@Override
		public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
			return orderDetailsDao.updateOrderDetails(orderDetails);
		}
		
		@Override
		public List<OrderDetails> findByName(String name){
			return orderDetailsDao.findByName(name);
		}


}
