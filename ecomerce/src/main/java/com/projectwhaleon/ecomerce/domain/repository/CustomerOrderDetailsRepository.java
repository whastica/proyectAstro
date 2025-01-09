package com.projectwhaleon.ecomerce.domain.repository;

import java.util.List;

import com.projectwhaleon.ecomerce.domain.model.CostumerOrderDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderDetailsRepository extends JpaRepository<CostumerOrderDetails, Long> {
    List<CostumerOrderDetails> findByCustomerId(Long customerId);
    List<CostumerOrderDetails> findByProductId(Long productId);
}
