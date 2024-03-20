package org.example.ktpm_20116031_votandat_lab6.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.example.ktpm_20116031_votandat_lab6.models.Product;
import org.example.ktpm_20116031_votandat_lab6.services.ConsumerService;
import org.example.ktpm_20116031_votandat_lab6.utils.JsonUtil;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    @JmsListener(destination = ORDER_QUEUE)
    public void receiveOrder(Message jsonMessage) throws JMSException, JsonProcessingException {
        String messageData = null;
        System.out.println("Received message " + jsonMessage);
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
            List<Product> products = (List<Product>) JsonUtil.deserializeJson(messageData);
            System.out.println(products);

//            System.out.println("Received message " + ((TextMessage) jsonMessage).getText());
        }
    }
}
