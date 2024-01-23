package com.fmi.frontendmodbdglobal.service;

import com.fmi.frontendmodbdglobal.model.Discount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DiscountService {

    List<Discount> findAll();
    Page<Discount> findPaginated(Pageable pageable);
    Discount save(Discount rezervare);
}
