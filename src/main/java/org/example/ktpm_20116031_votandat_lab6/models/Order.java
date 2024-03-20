package org.example.ktpm_20116031_votandat_lab6.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate orderDay;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;

    public Order(LocalDate orderDay, Customer customer, Product product, int quantity) {
        this.orderDay = orderDay;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}
