package com.rjdo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjdo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
