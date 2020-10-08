package com.jasonkhalverson.springstore.data;

import com.jasonkhalverson.springstore.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameIgnoringCase(String username);

}