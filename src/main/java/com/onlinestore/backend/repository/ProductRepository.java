package com.onlinestore.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinestore.backend.entity.Product;


public interface ProductRepository  extends JpaRepository<Product, Long>{

}
