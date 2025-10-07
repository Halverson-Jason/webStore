package com.jasonkhalverson.springstore.controllers;

import com.jasonkhalverson.springstore.models.Product;
import com.jasonkhalverson.springstore.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/api/search/")
    public String search(@RequestParam("q") String q, Model model) {
        List<Product> searchResults = searchService.searchProducts(q);
        model.addAttribute("products", searchResults);
        return "home";
    }
}