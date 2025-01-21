package com.astrosetups.backendEcomerce.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TemporalType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_order_details")
public class CustomerOrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer amount;
    private Double price;
    private Double subTotal;
    private String offerCode;
    
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    
    @ManyToOne
    @JoinColumn(name = "costumer_order_id")
    private CustomerOrder costumerOrder;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
