package org.example.ktpm_20116031_votandat_lab6.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate orderDay;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Product product;
    private int quantity;

    public Order(LocalDate orderDay, Customer customer, Product product, int quantity) {
        this.orderDay = orderDay;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}
