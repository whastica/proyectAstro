package com.astrosetups.backendEcomerce.application.interfaces;

import java.util.List;

import com.astrosetups.backendEcomerce.application.DTO.CustomerOrderDTO;

public interface CustomerOrderServiceInterface {
    CustomerOrderDTO createCustomerOrder(CustomerOrderDTO customerOrderDTO);
    CustomerOrderDTO updateCustomerOrder(Long id, CustomerOrderDTO customerOrderDTO);
    void deleteCustomerOrder(Long id);
    CustomerOrderDTO getCustomerOrderById(Long id);
    List<CustomerOrderDTO> getAllCustomerOrders();
}

