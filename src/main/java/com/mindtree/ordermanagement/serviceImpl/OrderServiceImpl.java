package com.mindtree.ordermanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ordermanagement.dao.OrderDao;
import com.mindtree.ordermanagement.mapper.OrderMapper;
import com.mindtree.ordermanagement.service.OrderService;
import com.mindtree.ordermanagement.util.OrderDto;
import com.mindtree.ordermanagement.util.OrderStatus;
import com.mindtree.ordermanagement.entity.Order;;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper mapper;

	@Autowired
	private OrderDao dao;

	@Override
	public OrderDto findByOrderId(Long orderId) {
		Optional<Order> order = dao.findById(orderId);
		return mapper.mapToOrderDto(order.get());
	}

	@Override
	public List<OrderDto> findByUserId(Long userId) {
		List<Order> orderList = dao.findByUserId(userId);
		return mapper.mapToUserDtoList(orderList);
	}

	@Override
	public OrderDto saveOrder(OrderDto orderDto) {
		Order order = mapper.mapToOrder(orderDto);
		Order orerRes = dao.save(order);
		return mapper.mapToOrderDto(orerRes);
	}

	@Override
	public void updateOrderStatus(Long orderId, OrderStatus status) {
		Optional<Order> orderOpt = dao.findById(orderId);
		orderOpt.get().setOrderStatus(status);
		dao.save(orderOpt.get());
	}
}
