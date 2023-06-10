package com.sakshi.cartservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshi.cartservice.entity.Cart;
import com.sakshi.cartservice.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Autowired
	private SequenceGeneratorService service;
	
	@Autowired
	ProductDetailsProxy productDetailsProxy;

	@Override
	public void addItemToCartService(Cart cart) {
		cart.setUserId(service.generateSequence(Cart.SEQUENCE_NAME));
		cartRepository.save(cart);
	}

	@Override
	public void removeItemFromCart(Cart cart) {
		cartRepository.delete(cart);
	}

	@Override
	public void displayAllProductsInCart(long userId) {
                                                        
	}

}
