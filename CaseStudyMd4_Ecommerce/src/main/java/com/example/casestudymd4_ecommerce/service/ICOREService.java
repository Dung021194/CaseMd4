package com.example.casestudymd4_ecommerce.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICOREService <E>{
    Page<E> findAll(Pageable pageable);
    E findOne(Long id);
    void save(E e);
    void delete(Long id);
}
