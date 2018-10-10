package com.capgemini.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.app.entities.Order;
import com.capgemini.app.repository.OrderRepository;
import com.capgemini.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order submitOrder(Order order) {

		return orderRepository.save(order);
	}

	@Override
	public Order cancelOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		/*
		 * if (optional.isPresent()) { optional.get().setStatus("cancel");
		 */
		return orderRepository.save(optional.get());
		/*
		 * } return null;
		 */
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteById(orderId);
	}

	@Override
	public Order getOrderById(int orderId) {
		Optional<Order> optionalProduct = orderRepository.findById(orderId);
		return optionalProduct.get();

	}
}
