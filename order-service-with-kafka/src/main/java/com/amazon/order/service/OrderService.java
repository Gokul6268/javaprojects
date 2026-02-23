package com.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.order.kafka.service.KafkaProducer;
import com.amazon.order.request.OrderRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderService {

	@Autowired
	KafkaProducer kafkaProducer;

	public String createOrder(OrderRequest orderRequest) {
		System.out.println("OrderService.createOrder()");

		String message = convertObjToJson(orderRequest);

		System.out.println(" JSON message sending to Kafka ::: " + message);
		// send message to kafka
		kafkaProducer.producerMessage("order-placed", message);

		System.out.println(" MESSAGE SENT to KAFKA.....");

		return "Order Created";
	}

	private String convertObjToJson(OrderRequest order) {
		ObjectMapper mapper = new ObjectMapper();

		String json = null;
		try {
			json = mapper.writeValueAsString(order);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return json;
	}

}
