package com.ca.order.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ca.order.domain.Order;
import com.ca.order.service.OrderServiceAmqp;

@Service

public class OrderServiceAmqpImpl implements OrderServiceAmqp {
	private static final Logger log = LoggerFactory.getLogger(OrderServiceAmqpImpl.class);

	@Autowired
	private RabbitTemplate orderMessageTemplate;
	
//	@Autowired
//	private RabbitTemplate paymentMessageTemplate;

	

	@Override
	public void publish(Order order) {
		log.info("Sending the index request through queue message");
		orderMessageTemplate.convertAndSend(order);

	}
	
/*	@Override
	public void publishPayment(Order order) {
		log.info("Sending the index request through queue message");
		paymentMessageTemplate.convertAndSend(order);
		}
*/
	

}
