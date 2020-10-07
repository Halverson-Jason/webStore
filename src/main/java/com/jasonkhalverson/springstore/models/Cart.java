package com.jasonkhalverson.springstore.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(targetEntity = Product.class)
    private List<Product> products;

    public void addToCart(Product product){
        this.products.add(product);
    }

}
