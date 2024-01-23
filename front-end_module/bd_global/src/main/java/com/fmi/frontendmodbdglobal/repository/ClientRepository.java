package com.fmi.frontendmodbdglobal.repository;

import com.fmi.frontendmodbdglobal.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
