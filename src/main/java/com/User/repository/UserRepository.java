package com.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

