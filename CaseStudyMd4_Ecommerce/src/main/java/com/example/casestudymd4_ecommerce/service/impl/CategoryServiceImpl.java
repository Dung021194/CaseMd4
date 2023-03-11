package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Category;
import com.example.casestudymd4_ecommerce.repository.ICategoryRepo;
import com.example.casestudymd4_ecommerce.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    ICategoryRepo categoryRepo;
    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepo.findAll(pageable);
    }

    @Override
    public Category findOne(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }
    @Override
    public void delete(Long id) {
        categoryRepo.deleteById(id);
    }
}
