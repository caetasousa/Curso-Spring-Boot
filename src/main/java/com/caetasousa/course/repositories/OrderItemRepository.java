package com.caetasousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caetasousa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
