package com.onlinestore.backend.service;

import com.onlinestore.backend.entity.Product;
import com.onlinestore.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	public List<Product>getAllProducts(){
		return productRepository.findAll();
	}
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
}
