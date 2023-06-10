package com.sakshi.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sakshi.productservice.entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, Long> {

	
}
