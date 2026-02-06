package com.amazon.order.service;

import org.springframework.stereotype.Service;

import com.amazon.order.request.OrderRequest;

@Service
public interface IOrderService {

	public void createOrder(OrderRequest orderRequest);
	public int fetchOrder(int orderId);
}
