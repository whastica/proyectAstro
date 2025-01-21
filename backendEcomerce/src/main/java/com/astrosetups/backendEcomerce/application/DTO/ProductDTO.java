package com.astrosetups.backendEcomerce.application.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private Double price;
    private Set<CategoryDTO> category;
    private CategoryTypeDTO categoryType;

}
