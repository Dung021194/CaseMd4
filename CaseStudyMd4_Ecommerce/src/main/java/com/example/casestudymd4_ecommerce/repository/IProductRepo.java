package com.example.casestudymd4_ecommerce.repository;

import com.example.casestudymd4_ecommerce.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product,Long> {

    Page<Product> findAllByNameContaining(Pageable pageable, String name);
}
