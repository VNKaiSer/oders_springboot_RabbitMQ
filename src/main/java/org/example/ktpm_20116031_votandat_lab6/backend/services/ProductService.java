package org.example.ktpm_20116031_votandat_lab6.backend.services;

import org.example.ktpm_20116031_votandat_lab6.backend.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
}
