package com.sakshi.productservice.service;

import java.util.List;

import com.sakshi.productservice.entity.Product;

public interface ProductService {

	Product saveDataToDB(Product product);

	List<Product> findAllProducts();

	Product getProductDetails(long productId);

}
