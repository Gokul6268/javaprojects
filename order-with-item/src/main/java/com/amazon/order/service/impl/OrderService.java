package com.amazon.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.order.entity.OrderEntity;
import com.amazon.order.entity.OrderItemEntity;
import com.amazon.order.repo.OrderRepo;
import com.amazon.order.request.OrderItemRequest;
import com.amazon.order.request.OrderRequest;
import com.amazon.order.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	@Autowired
	OrderRepo orderRepo;

	@Override
	public void createOrder(OrderRequest orderRequest) {

		OrderEntity entity = new OrderEntity();
		entity.setOrderStatus(orderRequest.getOrderStatus());

		List<OrderItemRequest> items = orderRequest.getItems();
		List<OrderItemEntity> entiryItems = new ArrayList<OrderItemEntity>();

		for (OrderItemRequest oir : items) {
			OrderItemEntity entiry = new OrderItemEntity();
			entiry.setItemName(oir.getItemName());
			entiry.setPrice(oir.getPrice());
			entiry.setQty(oir.getQty());
			entiryItems.add(entiry);
		}

		entity.setItems(entiryItems);

		orderRepo.save(entity);
	}

	@Override
	public int fetchOrder(int orderId) {
		System.out.println("OrderService.fetchOrder() START and order id is " + orderId);
		List<OrderEntity> orderEntityList = orderRepo.findAll();

		for (OrderEntity oe : orderEntityList) {
			List<OrderItemEntity> items = oe.getItems();
			for (OrderItemEntity oie : items) {
				System.out.println(oie.getOrderItemId());
				System.out.println(oie.getItemName());
			}
		}
		System.out.println("OrderService.fetchOrder() END");
		return 1;

	}

}
