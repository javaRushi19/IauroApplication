package com.iauro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iauro.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
