package com.projectwhaleon.ecomerce.domain.repository;

import com.projectwhaleon.ecomerce.domain.model.CostumerOrder;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CostumerOrder, Long> {
    List<CostumerOrder> findByCustomerId(Long customerId);
    List<CostumerOrder> findByStatus(String status);
}
