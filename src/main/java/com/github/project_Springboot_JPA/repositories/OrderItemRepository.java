package com.github.project_Springboot_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.project_Springboot_JPA.entities.OrderItem;
import com.github.project_Springboot_JPA.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
