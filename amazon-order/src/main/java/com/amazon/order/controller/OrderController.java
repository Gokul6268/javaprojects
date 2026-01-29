package com.amazon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.order.request.OrderRequest;
import com.amazon.order.service.OrderService;

@RestController
@RequestMapping("/amazon")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/placeorder")
	public String placeOrder(@RequestBody OrderRequest orderRequest) {

		System.out.println("OrderController.placeOrder():::::::::::::");
		String response = orderService.createOrder(orderRequest);

		return response;
	}

}
