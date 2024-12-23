package com.projectwhaleon.ecomerce.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectwhaleon.ecomerce.domain.model.Role;
import com.projectwhaleon.ecomerce.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String email);

    User findByRole(Role email);
}