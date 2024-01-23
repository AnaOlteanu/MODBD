package com.fmi.frontendmodbdglobal.repository;

import com.fmi.frontendmodbdglobal.model.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepository extends JpaRepository<Rezervare, Long> {

}
