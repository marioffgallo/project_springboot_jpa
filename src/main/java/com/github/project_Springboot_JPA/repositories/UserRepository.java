package com.github.project_Springboot_JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.project_Springboot_JPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
