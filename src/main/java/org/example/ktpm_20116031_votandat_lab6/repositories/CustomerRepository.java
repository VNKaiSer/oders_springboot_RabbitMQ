package org.example.ktpm_20116031_votandat_lab6.repositories;

import org.example.ktpm_20116031_votandat_lab6.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CustomerRepository extends JpaRepository<Customer, Long> {
}
