package com.tuanlq.service;

import com.tuanlq.model.Category;
import com.tuanlq.model.Phone;
import com.tuanlq.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public Page<Phone> findAll123(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public Page<Phone> findAllByCategory123(Category category, Pageable pageable) {
        return phoneRepository.findAllByCategory456(category,pageable);
    }

    @Override
    public Phone findById123(Long id) {
        return null;
    }

    @Override
    public void save123(Phone phone) {

    }
}
