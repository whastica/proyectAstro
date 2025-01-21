package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.CustomerDTO;

public interface CustomerServiceInterface {
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
    void deleteCustomer(Long id);
    CustomerDTO getCustomerById(Long id);
    List<CustomerDTO> getAllCustomers();
}
