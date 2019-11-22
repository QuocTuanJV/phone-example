package com.tuanlq.repository;

import com.tuanlq.model.Category;
import com.tuanlq.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PhoneRepository extends PagingAndSortingRepository<Phone,Long> {
 Page<Phone> findAllByCategory456(Category category, Pageable pageable);
}
