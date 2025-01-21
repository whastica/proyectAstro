package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.CategoryDTO;


public interface CategoryServiceInterface {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);
    void deleteCategory(Long id);
    CategoryDTO getCategoryById(Long id);
    List<CategoryDTO> getAllCategories();
}
