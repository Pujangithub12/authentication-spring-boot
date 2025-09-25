package com.example.authentication.repository;


import com.example.authentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(Long username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
