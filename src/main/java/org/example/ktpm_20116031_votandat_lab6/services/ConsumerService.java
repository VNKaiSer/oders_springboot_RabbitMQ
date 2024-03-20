package org.example.ktpm_20116031_votandat_lab6.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.jms.JMSException;
import jakarta.jms.Message;

public interface ConsumerService {
    final String ORDER_QUEUE = "order-queue";
    void receiveOrder(Message message) throws JMSException, JsonProcessingException;
}
