package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.CustomerOrderDetailsDTO;

public interface CustomerOrderDetailsServiceInterface {
    CustomerOrderDetailsDTO createCustomerOrderDetails(CustomerOrderDetailsDTO customerOrderDetailsDTO);
    CustomerOrderDetailsDTO updateCustomerOrderDetails(Long id, CustomerOrderDetailsDTO customerOrderDetailsDTO);
    void deleteCustomerOrderDetails(Long id);
    CustomerOrderDetailsDTO getCustomerOrderDetailsById(Long id);
    List<CustomerOrderDetailsDTO> getAllCustomerOrderDetails();
}
