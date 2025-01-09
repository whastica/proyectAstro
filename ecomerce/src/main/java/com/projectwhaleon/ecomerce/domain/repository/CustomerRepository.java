package com.projectwhaleon.ecomerce.domain.repository;

import com.projectwhaleon.ecomerce.domain.model.Costumer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Costumer, Long> {
    Optional<Costumer> findByPhone(String phone);
}
