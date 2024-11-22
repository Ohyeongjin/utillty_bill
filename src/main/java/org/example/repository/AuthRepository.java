package org.example.repository;

import org.example.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<Auth,Long> {
    Optional<Auth> findByRoleName(String role);
}
