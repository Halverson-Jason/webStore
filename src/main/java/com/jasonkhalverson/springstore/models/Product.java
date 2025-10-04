package com.jasonkhalverson.springstore.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Entity
@Table(name = "products")
@Indexed
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    @FullTextField
    private final String name;

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    @FullTextField
    private final String description;

    @Positive(message = "Price should be greater than 0")
    private final BigDecimal price;

    @NotEmpty(message = "pictureUrl should not be empty")
    private final String pictureUrl;

}
