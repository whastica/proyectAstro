package com.projectwhaleon.ecomerce.domain.repository;

import com.projectwhaleon.ecomerce.domain.model.ProductCategory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findByProductId(Long productId);
    List<ProductCategory> findByCategoryId(Long categoryId);
}
