package com.fmi.frontendmodbdglobal.service;

import com.fmi.frontendmodbdglobal.model.Hotel;
import com.fmi.frontendmodbdglobal.model.Oras;
import com.fmi.frontendmodbdglobal.model.TipHotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HotelService {

    List<Hotel> findAll();

    Page<Hotel> findPaginated(Pageable pageable);

    Hotel save(Hotel hotel);

    List<TipHotel> findAllTipHotel();

    List<Oras> findAllOrase();

}
