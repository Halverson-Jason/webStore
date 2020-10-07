package com.jasonkhalverson.springstore.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;

    @NotNull(message = "Username is required.")
    @Basic(optional = false)
    private String userName;

    @OneToOne
    private Cart cart;
}
