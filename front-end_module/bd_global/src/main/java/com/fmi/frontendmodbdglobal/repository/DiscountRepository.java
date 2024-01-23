package com.fmi.frontendmodbdglobal.repository;

import com.fmi.frontendmodbdglobal.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
