package com.sakshi.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshi.productservice.entity.Product;
import com.sakshi.productservice.exception.ProductNotFoundException;
import com.sakshi.productservice.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Autowired
	private SequenceGeneratorService service;

	@Override
	public Product saveDataToDB(Product product) {
		product.setProductID(service.generateSequence(Product.SEQUENCE_NAME));
		return productRepo.insert(product);
	}

	@Override
	public List<Product> findAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductDetails(long productId) {
		return productRepo.findById(productId)
				.orElseThrow(() -> new ProductNotFoundException("Product", "productId", productId));
	}
}
