package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
							.id(UUID.randomUUID().toString())
							.name("PS4")
							.quantity(5)
							.price(9300)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("XBOX360")
					.quantity(2)
					.price(100)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Nintendo")
					.quantity(80)
					.price(1100)
					.build());

		};
	}

}
