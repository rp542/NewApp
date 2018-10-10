package com.capgemini.app.entities;

import java.util.Objects;

public class Item {
	private int itemId;
	private int quantity;
	private int productId;
	private double total;

	public Item() {
		super();
	}

	public Item(int itemId, int quantity, int productId, double total) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.productId = productId;
		this.total = total;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemId, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;

		if (productId != other.productId)
			return false;

		return true;
	}

}
