package com.rjdo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjdo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
