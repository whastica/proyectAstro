package com.projectwhaleon.ecomerce.application.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;
    private Set<CategoryTypeDTO> categoryType;
    private Set<ProductDTO> product;
}
