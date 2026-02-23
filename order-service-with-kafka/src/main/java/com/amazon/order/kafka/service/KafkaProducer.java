package com.amazon.order.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void producerMessage(String _topic, String _message) {
		// send message to kafka broker
		kafkaTemplate.send(_topic, _message);
	}
}
