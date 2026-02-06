package com.amazon.order.request;

import java.util.List;

public class OrderRequest {

	private String orderStatus;
	private List<OrderItemRequest> items;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItemRequest> getItems() {
		return items;
	}

	public void setItems(List<OrderItemRequest> items) {
		this.items = items;
	}

}
