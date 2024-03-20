package org.example.ktpm_20116031_votandat_lab6.services.impl;

import org.example.ktpm_20116031_votandat_lab6.models.Product;
import org.example.ktpm_20116031_votandat_lab6.services.ProducerService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProducerServiceImplTest {

    @Test
    void sendOrder() {
        Product product = new Product("Product1","image1","description1",1);
        Product product2 = new Product("Product2","image2","description2",2);
        Product product3 = new Product("Product3","image3","description3",3);
        ProducerService producerService = new ProducerServiceImpl();
        try {
            producerService.sendOrder(List.of(product,product2,product3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}