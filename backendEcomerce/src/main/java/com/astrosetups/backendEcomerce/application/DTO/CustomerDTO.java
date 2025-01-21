package com.astrosetups.backendEcomerce.application.DTO;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDTO {
    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String city;
    private String country;
    private String postalCode;
    private Set<CustomerOrderDTO> customerOrder;
}
