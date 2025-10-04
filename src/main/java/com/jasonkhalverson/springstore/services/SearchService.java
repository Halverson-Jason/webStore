package com.jasonkhalverson.springstore.services;

import com.jasonkhalverson.springstore.models.Product;
import org.hibernate.search.mapper.orm.Search;
import org.hibernate.search.mapper.orm.session.SearchSession;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class SearchService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Product> searchProducts(String searchTerm) {
        SearchSession searchSession = Search.session(entityManager);

        return searchSession.search(Product.class)
                .where(f -> f.match()
                        .fields("name", "description")
                        .matching(searchTerm))
                .fetchHits(20);
    }
}
