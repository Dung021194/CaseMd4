package com.example.casestudymd4_ecommerce.service;

import com.example.casestudymd4_ecommerce.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IUserService extends ICOREService<User>{
    Page<User> findAll(Pageable pageable);
    Optional<User> findByUsername(String username);
}
