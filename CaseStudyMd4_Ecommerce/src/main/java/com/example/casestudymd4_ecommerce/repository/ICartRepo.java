package com.example.casestudymd4_ecommerce.repository;

import com.example.casestudymd4_ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepo extends JpaRepository<Cart,Long> {
}
