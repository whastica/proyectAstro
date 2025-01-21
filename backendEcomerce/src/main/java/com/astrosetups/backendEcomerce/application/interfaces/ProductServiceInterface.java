package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.ProductDTO;

public interface ProductServiceInterface {
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
    ProductDTO getProductById(Long id);
    List<ProductDTO> getAllProducts();
    ProductDTO getProductBySku(String sku);
}
