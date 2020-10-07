package com.jasonkhalverson.springstore.data;

import com.jasonkhalverson.springstore.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository
        extends CrudRepository<Product, String> {
}
