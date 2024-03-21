package org.example.ktpm_20116031_votandat_lab6.backend.services.impl;

import org.example.ktpm_20116031_votandat_lab6.backend.models.Product;
import org.example.ktpm_20116031_votandat_lab6.backend.repositories.ProductRepository;
import org.example.ktpm_20116031_votandat_lab6.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
