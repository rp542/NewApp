package com.capgemini.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.app.entities.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

}
