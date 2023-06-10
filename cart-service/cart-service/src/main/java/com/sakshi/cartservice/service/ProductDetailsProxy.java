package com.sakshi.cartservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sakshi.cartservice.entity.Product;


@FeignClient(name="product-service", url="localhost:9002")
public interface ProductDetailsProxy {
	
	@GetMapping("/search/{productId}")
	public Product getProductById(@PathVariable long productId);

}
