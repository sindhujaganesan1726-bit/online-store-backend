package com.onlinestore.backend;

import com.onlinestore.backend.entity.Product;
import com.onlinestore.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner{
	
	private final ProductRepository productRepository;
	
	public DataSeeder(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public void run(String...args) throws Exception{
		if (productRepository.count()==0) {
			Product laptop = new Product();
			laptop.setName("Laptop");
			laptop.setCost(50000);
			laptop.setImage("assets/Laptop.jpg");
			productRepository.save(laptop);
			
			Product mobile = new Product();
			mobile.setName("Mobile phone");
			mobile.setCost(30000);
			mobile.setImage("assets/mobilephones.jpg");
			productRepository.save(mobile);
		
			Product headphones = new Product();
			headphones.setName("Head phones");
			headphones.setCost(3000);
			headphones.setImage("assets/Headphones.jpg");
			productRepository.save(laptop);
			
			Product keyboard = new Product();
			keyboard.setName("Keyboard");
			keyboard.setCost(1500);
			keyboard.setImage("assets/Keyboard.jpg");
			productRepository.save(keyboard);
		
		
		}
		
	}

}
