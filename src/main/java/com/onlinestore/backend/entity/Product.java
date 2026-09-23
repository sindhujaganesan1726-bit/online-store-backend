package com.onlinestore.backend.entity;

import jakarta.persistence.*;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private double cost;
	private String image;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image =image;
	}
}
