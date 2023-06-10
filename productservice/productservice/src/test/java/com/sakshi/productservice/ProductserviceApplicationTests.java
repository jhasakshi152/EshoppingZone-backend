package com.sakshi.productservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.h2.command.dml.MergeUsing.When;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sakshi.productservice.controller.ProductController;
import com.sakshi.productservice.entity.Product;
import com.sakshi.productservice.repository.ProductRepo;
import com.sakshi.productservice.service.ProductService;

@SpringBootTest
class ProductserviceApplicationTests {

	@InjectMocks
	ProductController productController;

	@Mock
	private ProductService productService;

	@MockBean
	private ProductRepo productRepo;

	@Test
	@Order(1)
	public void saveProduct() {
		Product product = new Product(1234567, "Colgate", "wellness", "Nothing", 22.0, 3, "img");
		Mockito.when(productService.saveDataToDB(product)).thenReturn(product);
	}

	@Test
	@Order(2)
	public void getListProducts() {
		List<Product> listProducts = new ArrayList<Product>();
		listProducts.add(new Product(1234567, "Colgate", "wellness", "Nothing", 22.0, 3, "img"));
		listProducts.add(new Product(1234568, "Colgate", "wellness", "Nothing", 22.0, 3, "img"));
		listProducts.add(new Product(1234569, "Colgate", "wellness", "Nothing", 22.0, 3, "img"));
		when(productService.findAllProducts()).thenReturn(listProducts);
		assertEquals(3, listProducts.size());
	}

}
