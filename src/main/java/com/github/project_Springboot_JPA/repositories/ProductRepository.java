package com.github.project_Springboot_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.project_Springboot_JPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
