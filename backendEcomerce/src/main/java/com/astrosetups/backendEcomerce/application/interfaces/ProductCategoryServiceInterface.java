package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.ProductCategoryDTO;

public interface ProductCategoryServiceInterface {
    ProductCategoryDTO createProductCategory(ProductCategoryDTO productCategoryDTO);
    ProductCategoryDTO updateProductCategory(Long id, ProductCategoryDTO productCategoryDTO);
    void deleteProductCategory(Long id);
    ProductCategoryDTO getProductCategoryById(Long id);
    List<ProductCategoryDTO> getProductCategoriesByProductId(Long productId);
    List<ProductCategoryDTO> getProductCategoriesByCategoryId(Long categoryId);
    List<ProductCategoryDTO> getAllProductCategories();
}