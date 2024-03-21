package org.example.ktpm_20116031_votandat_lab6.frontend.controllers;


import org.example.ktpm_20116031_votandat_lab6.backend.models.Customer;
import org.example.ktpm_20116031_votandat_lab6.backend.models.Order;
import org.example.ktpm_20116031_votandat_lab6.backend.services.ProductService;
import org.example.ktpm_20116031_votandat_lab6.frontend.form_model.FormOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PageController {
    @Autowired private ProductService productService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        FormOrder formOrder = new FormOrder();

        model.addAttribute("formOrder",formOrder);
        return "index";
    }

    @PostMapping(
            path = "/order",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}
    )
    public String order(
                        @ModelAttribute FormOrder formOrder
                        ) {
//        System.out.println(customer);
//        if (customer.getName() == null || customer.getEmail() == null || customer.getAddress() == null) {
//            return "redirect:/";
//        }

        System.out.println(formOrder);




        return "index";
    }
}
