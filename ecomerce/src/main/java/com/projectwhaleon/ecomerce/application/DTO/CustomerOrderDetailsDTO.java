package com.projectwhaleon.ecomerce.application.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderDetailsDTO {
    private Long id;
    private Integer amount;
    private Double price;
    private Double subTotal;
    private String offerCode;
    private LocalDateTime date;
    private CustomerOrderDTO customerOrder;
    private CustomerDTO customer;
    private ProductDTO product;
}
