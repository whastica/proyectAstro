package com.astrosetups.backendEcomerce.application.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryTypeDTO {
    private Long id;
    private String name;
    private CategoryDTO category;
    private Set<ProductDTO> product;
}
