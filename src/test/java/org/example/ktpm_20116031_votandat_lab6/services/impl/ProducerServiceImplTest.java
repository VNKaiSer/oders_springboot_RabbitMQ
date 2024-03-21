package org.example.ktpm_20116031_votandat_lab6.services.impl;

import org.example.ktpm_20116031_votandat_lab6.backend.models.Product;
import org.example.ktpm_20116031_votandat_lab6.backend.services.ProducerService;
import org.example.ktpm_20116031_votandat_lab6.backend.services.impl.ProducerServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProducerServiceImplTest {

    @Test
    void sendOrder() {
        Product product = new Product("Product1","image1","description1",1,0);
        Product product2 = new Product("Product2","image2","description2",2,0);
        Product product3 = new Product("Product3","image3","description3",3,0);
        ProducerService producerService = new ProducerServiceImpl();
        try {
            producerService.sendOrder(List.of(product,product2,product3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}