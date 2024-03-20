package org.example.ktpm_20116031_votandat_lab6.services.impl;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.example.ktpm_20116031_votandat_lab6.models.Product;
import org.example.ktpm_20116031_votandat_lab6.services.ProducerService;
import org.example.ktpm_20116031_votandat_lab6.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProducerServiceImpl implements ProducerService {

     private JmsTemplate jmsTemplate;
    ProducerServiceImpl() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");
        jmsTemplate = new JmsTemplate(connectionFactory);
    }

    @Override
    public void sendOrder(List<Product> products) throws Exception {
        String productsJson = JsonUtil.toJson(products);
        System.out.println(productsJson);
        jmsTemplate.send(ORDER_QUEUE, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return  session.createTextMessage(productsJson);
            }
        });
    }

    public static void main(String[] args) {
        ProducerService producerService = new ProducerServiceImpl();
        try {
            producerService.sendOrder(List.of(new Product("Product1","image1","description1",1),
                    new Product("Product2","image2","description2",2),
                    new Product("Product3","image3","description3",3)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
