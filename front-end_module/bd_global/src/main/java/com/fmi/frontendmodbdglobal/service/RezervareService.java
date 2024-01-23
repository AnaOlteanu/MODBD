package com.fmi.frontendmodbdglobal.service;

import com.fmi.frontendmodbdglobal.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RezervareService {

    List<Rezervare> findAll();
    Page<Rezervare> findPaginated(Pageable pageable);
    Rezervare save(Rezervare rezervare);

    List<Angajat> findAllAngajati();
    List<Discount> findAllDiscount();
    List<Camera> findAllCamera();
    List<Client> findAllClient();

    void updateCameraRezervare(Long idRezervare);
}
