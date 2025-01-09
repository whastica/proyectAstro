package com.projectwhaleon.ecomerce.application.DTO;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderDTO {
    private Long id;
    private String numBill;
    private LocalDateTime date;
    private String status;
    private Double total;
    private String offerCode;
    private CustomerDTO customer;
    private Set<CustomerOrderDetailsDTO> customerOrderDetails;
}
