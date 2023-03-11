package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Cart;
import com.example.casestudymd4_ecommerce.repository.ICartRepo;
import com.example.casestudymd4_ecommerce.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements ICartService {
    @Autowired
    ICartRepo cartRepo;

    @Override
    public Page<Cart> findAll(Pageable pageable) {
        return cartRepo.findAll(pageable);
    }

    @Override
    public Cart findOne(Long id) {
        return cartRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Cart cart) {
        cartRepo.save(cart);

    }


    @Override
    public void delete(Long id) {
        cartRepo.deleteById(id);

    }
}
