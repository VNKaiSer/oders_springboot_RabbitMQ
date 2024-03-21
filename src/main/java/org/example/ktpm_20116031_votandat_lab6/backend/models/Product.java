package org.example.ktpm_20116031_votandat_lab6.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private String productImage;
    private String description;
    private int inventory;
    private double price;

    public Product(String productName, String productImage, String description, int inventory, double price) {
        this.productName = productName;
        this.productImage = productImage;
        this.description = description;
        this.inventory = inventory;
        this.price = price;
    }
}
