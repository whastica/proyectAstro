package com.projectwhaleon.ecomerce.domain.repository;

import java.util.Optional;

import com.projectwhaleon.ecomerce.domain.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String name);
}
