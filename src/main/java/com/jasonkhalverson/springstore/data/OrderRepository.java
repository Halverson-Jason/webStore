package com.jasonkhalverson.springstore.data;

import com.jasonkhalverson.springstore.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, String> {
}
