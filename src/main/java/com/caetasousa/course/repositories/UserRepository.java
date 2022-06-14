package com.caetasousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caetasousa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
