package com.sakshi.productservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshi.productservice.entity.Product;
import com.sakshi.productservice.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {

	//using Logger(which are TRACE,DEBUG,INFO,WARN,ERROR)
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;

	//to add product 
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		return productService.saveDataToDB(product);
	}

	//to show all the products
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		
		logger.trace("FATAL ERROR");        //after executing logs will be printed fatal error in the console
		return productService.findAllProducts();
	}

	//to show particular product by id
	@GetMapping("/search/{productId}")
	public Product getProductById(@PathVariable long productId) {
		return productService.getProductDetails(productId);

	}

}
