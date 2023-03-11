package com.example.casestudymd4_ecommerce.service;


import com.example.casestudymd4_ecommerce.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends ICOREService<Product> {
    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllPage(Pageable pageable, String name);
}
