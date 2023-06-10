package com.sakshi.cartservice;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sakshi.cartservice.controller.CartController;
import com.sakshi.cartservice.entity.Cart;
import com.sakshi.cartservice.repository.CartRepository;
import com.sakshi.cartservice.service.CartService;


@SpringBootTest
class CartServiceApplicationTests {


//	@InjectMocks
//	CartController cartController;
//
//	@Mock
//	private CartService cartService;
//
//	@MockBean
//	private CartRepository cartRepository;
//
//	@Test
//	@Order(1)
//	public void saveProduct() {
//		Cart cart = new Cart(56823, 25638);
//		Mockito.when(cartService.addItemToCartService(cart)).thenReturn(cart);
//	}
	
}
