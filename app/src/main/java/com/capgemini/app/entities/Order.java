package com.capgemini.app.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "order")
public class Order {
	@Id
	private int orderId;
	private int customerId;
	private double totalAmount;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate date;
	private String status;
	private List<Item> item;

	public Order(int orderId, int customerId, double totalAmount, LocalDate date, String status, List<Item> item) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.date = date;
		this.status = status;
		this.item = item;
	}

	public Order() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

}