package com.astrosetups.backendEcomerce.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astrosetups.backendEcomerce.domain.model.ProductCategory;

@Repository

public interface ProductCategoryRespository extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findByProductId(Long productId);
    List<ProductCategory> findByCategoryId(Long categoryId);
}
