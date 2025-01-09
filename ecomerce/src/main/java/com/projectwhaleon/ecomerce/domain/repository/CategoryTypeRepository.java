package com.projectwhaleon.ecomerce.domain.repository;

import java.util.Optional;

import com.projectwhaleon.ecomerce.domain.model.Category_type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTypeRepository extends JpaRepository<Category_type, Long> {
    Optional<Category_type> findByName(String name);
}