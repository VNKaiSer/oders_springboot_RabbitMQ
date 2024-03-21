package org.example.ktpm_20116031_votandat_lab6.backend.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ktpm_20116031_votandat_lab6.backend.models.Customer;
import org.example.ktpm_20116031_votandat_lab6.backend.models.Product;

import java.util.List;

public class JsonUtil {
    public static String productToJson(List<Product> products) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(products);
    }

    public static String customerToJson(Customer customers) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(customers);
    }

    public static String deserializeCustomerJson(String customers) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(customers, Customer.class).toString();
    }

    public static List<Product> deserializeProductJson(String products) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(products, List.class);
    }
}
