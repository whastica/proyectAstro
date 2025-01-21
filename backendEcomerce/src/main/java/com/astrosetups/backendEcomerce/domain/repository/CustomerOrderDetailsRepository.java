package com.astrosetups.backendEcomerce.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astrosetups.backendEcomerce.domain.model.CustomerOrderDetails;

@Repository
public interface CustomerOrderDetailsRepository extends JpaRepository<CustomerOrderDetails, Long> {
    List<CustomerOrderDetails> findByCustomerId(Long costumerId);
    List<CustomerOrderDetails> findByProductId(Long productId);
}