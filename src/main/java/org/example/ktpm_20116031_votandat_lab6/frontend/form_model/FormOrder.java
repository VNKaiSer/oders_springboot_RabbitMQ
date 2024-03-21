package org.example.ktpm_20116031_votandat_lab6.frontend.form_model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.ktpm_20116031_votandat_lab6.backend.models.Customer;
import org.example.ktpm_20116031_votandat_lab6.backend.models.Order;

import java.util.List;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class FormOrder {
    private Customer customer;
    private List<Order> orders;
}
