package com.astrosetups.backendEcomerce.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astrosetups.backendEcomerce.domain.model.CategoryType;

@Repository
public interface CategoryTypeRepository extends JpaRepository<CategoryType, Long> {
    Optional<CategoryType> findByName(String name);
}