package com.fmi.frontendmodbdglobal.repository;

import com.fmi.frontendmodbdglobal.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
