package com.sakshi.cartservice.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.sakshi.cartservice.entity.Cart;

public interface CartRepository extends MongoRepository<Cart, Long> {

	
}
