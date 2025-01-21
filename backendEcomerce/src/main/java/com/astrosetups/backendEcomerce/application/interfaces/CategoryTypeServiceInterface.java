package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.CategoryTypeDTO;

public interface CategoryTypeServiceInterface {
    CategoryTypeDTO createCategoryType(CategoryTypeDTO categoryTypeDTO);
    CategoryTypeDTO updateCategoryType(Long id, CategoryTypeDTO categoryTypeDTO);
    void deleteCategoryType(Long id);
    CategoryTypeDTO getCategoryTypeById(Long id);
    List<CategoryTypeDTO> getAllCategoryTypes();
}
