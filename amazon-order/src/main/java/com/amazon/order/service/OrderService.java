package com.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.order.entity.OrderEntity;
import com.amazon.order.repository.OrderRepository;
import com.amazon.order.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public String createOrder(OrderRequest orderRequest) {

		System.out.println("OrderService.createOrder():::::::::::::::::::::::::::::::");

		OrderEntity entity = new OrderEntity();

		entity.setDescription(orderRequest.getDescription());
		entity.setPrice(orderRequest.getPrice());
		entity.setQty(orderRequest.getQty());
		entity.setItemName(orderRequest.getItemName());

		entity = orderRepository.save(entity);

		int orderId = entity.getId();
		if (orderId > 0) {
			return " Order has been placed and order id is " + orderId;
		}

		return "unable to place an order";
	}

}
