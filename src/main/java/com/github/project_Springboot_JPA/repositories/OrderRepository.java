package com.github.project_Springboot_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.project_Springboot_JPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
