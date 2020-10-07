package com.jasonkhalverson.springstore.data;

import com.jasonkhalverson.springstore.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository
        extends CrudRepository<Cart, String> {
}
