package com.fenix.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fenix.api.models.User;


public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

    public boolean existsByEmail(String email);
}