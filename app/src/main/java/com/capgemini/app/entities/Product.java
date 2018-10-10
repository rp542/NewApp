package com.capgemini.app.entities;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private HashMap<String, Object> productSpecifications;

	public Product() {
		super();
	}

	public Product(int productId, String productName, double productPrice,
			HashMap<String, Object> productSpecifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productSpecifications = productSpecifications;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public HashMap<String, Object> getProductSpecifications() {
		return productSpecifications;
	}

	public void setProductSpecifications(HashMap<String, Object> productSpecifications) {
		this.productSpecifications = productSpecifications;
	}

}