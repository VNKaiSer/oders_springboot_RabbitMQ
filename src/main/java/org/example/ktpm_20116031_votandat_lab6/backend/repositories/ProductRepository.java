package org.example.ktpm_20116031_votandat_lab6.backend.repositories;

import org.example.ktpm_20116031_votandat_lab6.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
