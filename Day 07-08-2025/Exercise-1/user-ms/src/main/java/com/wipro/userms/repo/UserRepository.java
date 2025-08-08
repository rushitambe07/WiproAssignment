package com.wipro.userms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.userms.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {}

