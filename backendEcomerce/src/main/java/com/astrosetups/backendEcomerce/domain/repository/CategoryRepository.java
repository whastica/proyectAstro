package com.astrosetups.backendEcomerce.domain.repository;

import java.util.Optional;

import com.astrosetups.backendEcomerce.domain.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String name);
}

