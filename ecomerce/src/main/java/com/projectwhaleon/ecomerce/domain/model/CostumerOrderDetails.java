package com.projectwhaleon.ecomerce.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "costumer_order_details")
public class CostumerOrderDetails {
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
    private CostumerOrder costumerOrder;
    
    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
