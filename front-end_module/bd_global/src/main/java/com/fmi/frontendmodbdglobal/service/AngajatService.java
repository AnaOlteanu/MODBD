package com.fmi.frontendmodbdglobal.service;

import com.fmi.frontendmodbdglobal.model.Angajat;
import com.fmi.frontendmodbdglobal.model.Discount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AngajatService {

    List<Angajat> findAll();
    Page<Angajat> findPaginated(Pageable pageable);
    Angajat save(Angajat angajat);
}
