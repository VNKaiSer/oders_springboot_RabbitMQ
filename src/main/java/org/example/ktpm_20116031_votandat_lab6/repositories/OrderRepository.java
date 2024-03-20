package org.example.ktpm_20116031_votandat_lab6.repositories;

import org.example.ktpm_20116031_votandat_lab6.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
