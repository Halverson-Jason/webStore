package com.jasonkhalverson.springstore.controllers;

import com.jasonkhalverson.springstore.data.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    CartRepository cartRepository;

    @Autowired
    CartController(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    @GetMapping
    public String showCart(Model model){

        return "cart";
    }

}
