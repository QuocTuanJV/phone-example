package com.tuanlq.service;

import com.tuanlq.model.Category;
import com.tuanlq.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhoneService {
    Page<Phone> findAll123(Pageable pageable);
    Page<Phone> findAllByCategory123(Category category, Pageable pageable);
    Phone findById123(Long id);
    void save123(Phone phone);

}
