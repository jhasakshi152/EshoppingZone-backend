package com.paymentgateway.razorpay.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@RestController
@CrossOrigin
public class PaymentController {
	
	@PostMapping("/create_order/{amount}")
	public String createTicket(@PathVariable int amount) throws RazorpayException {
		var client = new RazorpayClient("rzp_test_j0rpBfrZGL4Nej", "BOuTz6Exy5P9F4FldiJ13PAB");

		JSONObject object = new JSONObject();
		object.put("amount", amount * 100);
		object.put("currency", "INR");
		object.put("receipt", "txn_123456");

		Order order = client.Orders.create(object);

		return order.toString();

	}

}
