package org.example.ktpm_20116031_votandat_lab6.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ktpm_20116031_votandat_lab6.models.Product;

import java.util.List;

public class JsonUtil {
    public static String toJson(List<Product> products) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(products);
    }

    public static List<Product> deserializeJson(String products) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(products, List.class);
    }
}
