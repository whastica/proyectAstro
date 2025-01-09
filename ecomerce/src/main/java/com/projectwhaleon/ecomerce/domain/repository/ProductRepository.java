package com.projectwhaleon.ecomerce.domain.repository;

import com.projectwhaleon.ecomerce.domain.model.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findBySku(String sku);
    List<Product> findByNameContaining(String name);
}
