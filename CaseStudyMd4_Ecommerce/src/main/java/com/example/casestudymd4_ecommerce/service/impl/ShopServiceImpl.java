package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Shop;
import com.example.casestudymd4_ecommerce.repository.IShopRepo;
import com.example.casestudymd4_ecommerce.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class ShopServiceImpl implements IShopService {
    @Autowired
    IShopRepo shopRepo;
    @Override
    public Page<Shop> findAll(Pageable pageable) {
        return shopRepo.findAll(pageable);
    }

    @Override
    public Shop findOne(Long id) {
        return shopRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Shop shop) {
        shopRepo.save(shop);

    }

    @Override
    public void delete(Long id) {
        shopRepo.deleteById(id);

    }
}
