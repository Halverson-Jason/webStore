package com.jasonkhalverson.springstore.controllers;

import com.jasonkhalverson.springstore.data.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping
    public String showItems(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "home";
    }

}
