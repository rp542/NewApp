package com.capgemini.app.service;

import com.capgemini.app.entities.Order;

public interface OrderService {
	public Order submitOrder(Order order);

	public void deleteOrder(int orderId);

	public Order cancelOrder(int orderId);

	public Order getOrderById(int orderId);

	public Order updateOrder(Order order);

}
