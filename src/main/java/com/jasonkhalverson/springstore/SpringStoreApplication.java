package com.jasonkhalverson.springstore;

import com.jasonkhalverson.springstore.data.ProductRepository;
import com.jasonkhalverson.springstore.models.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(ProductRepository product) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				product.save(new Product("Item 1","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
				product.save(new Product("Item 2","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
				product.save(new Product("Item 3","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
				product.save(new Product("Item 4","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
				product.save(new Product("Item 5","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
				product.save(new Product("Item 6","This is a description", new BigDecimal(10.99), "http://arstarst.com"));
			}
		};
	}
}
