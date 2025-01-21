package com.astrosetups.backendEcomerce.domain.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_orders")
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "num_bill")
    private String numBill;
    
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime date;
    
    private String status;
    private Double total;
    
    @Column(name = "offer_code")
    private String offerCode;
    
    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Customer customer;
    
    @OneToMany(mappedBy = "costumerOrder", cascade = CascadeType.ALL)  
    private Set<CustomerOrderDetails> customerOrderDetails; 

}
