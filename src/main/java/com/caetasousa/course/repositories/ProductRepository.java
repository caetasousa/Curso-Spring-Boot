package com.caetasousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caetasousa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
