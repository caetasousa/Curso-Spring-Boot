package com.caetasousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caetasousa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
