package com.onlinestore.backend.controller;

import com.onlinestore.backend.entity.Product;
import com.onlinestore.backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController (ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product>getAllProducts(){
		return productService.getAllProducts();
	}
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id ) {
		return productService.getProductById(id);
	}
}


	


