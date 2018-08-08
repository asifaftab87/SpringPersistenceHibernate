package org.liferayasif.backend.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.liferayasif.backend.dao.OrderDetailDao;
import org.liferayasif.backend.model.OrderDetail;
import org.liferayasif.backend.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderDetailService")
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService{

	@Autowired
	private OrderDetailDao orderDetailDao;
	
	@Override
	public List<OrderDetail> getAllOrderDetails() {
		List<OrderDetail> orderDetail = orderDetailDao.getAllOrderDetails();
		return orderDetail;
	}

	@Override
	public OrderDetail getOrderDetailById(Integer id) {
		OrderDetail orderDetail = orderDetailDao.getOrderDetailById(id);
		return orderDetail;
	}

	@Override
	public OrderDetail addOrderDetail(OrderDetail orderDetail) {
		return orderDetailDao.addOrderDetail(orderDetail);
	}

	@Override
	public void deleteOrderDetail(Integer id) {
		orderDetailDao.deleteOrderDetail(id);
		
	}

	@Override
	public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
		 
		return orderDetailDao.updateOrderDetail(orderDetail);
	}

	@Override
	public List<OrderDetail> findByName(String name) {
		return orderDetailDao.findByName(name);
	}
	
	

}
