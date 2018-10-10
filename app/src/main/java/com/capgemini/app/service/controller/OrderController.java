package com.capgemini.app.service.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.app.entities.Item;
import com.capgemini.app.entities.Order;
import com.capgemini.app.service.OrderService;

@RestController
public class OrderController {
	private HashMap<Integer, Set<Item>> hashMap = new HashMap<>();
	@Autowired
	OrderService orderService;

	@PostMapping("/addtocart/{customerId}")
	public ResponseEntity<Set<Item>> addToCart(@RequestBody Item item, @PathVariable int customerId) {
		Set<Item> sampleItem = hashMap.get(customerId);
		if (sampleItem == null) {
			sampleItem = new HashSet<>();
			sampleItem.add(item);
			hashMap.put(customerId, sampleItem);
		} else {
			sampleItem.add(item);
			hashMap.put(customerId, sampleItem);
		}
		return new ResponseEntity<Set<Item>>(sampleItem, HttpStatus.OK);
	}

	@PostMapping("/order")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {

		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(orderService.submitOrder(order),
				HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/order/{orderId}")
	public ResponseEntity<Order> findOrderById(@PathVariable int orderId) {
		Order order1 = orderService.getOrderById(orderId);
		return new ResponseEntity<Order>(order1, HttpStatus.OK);

	}

	@DeleteMapping("/order/{orderId}")
	public ResponseEntity<Order> deleteOrder(@PathVariable int orderId) {

		Order o = orderService.getOrderById(orderId);

		orderService.deleteOrder(orderId);
		return new ResponseEntity<Order>(HttpStatus.OK);

	}

}
