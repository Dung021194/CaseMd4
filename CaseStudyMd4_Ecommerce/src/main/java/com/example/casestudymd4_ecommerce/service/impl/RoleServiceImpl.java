package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Role;
import com.example.casestudymd4_ecommerce.repository.IRoleRepo;
import com.example.casestudymd4_ecommerce.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepo roleRepo;
    @Override
    public Page<Role> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Role findOne(Long id) {
        return roleRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Role role) {
        roleRepo.save(role);

    }

    @Override
    public void delete(Long id) {

    }
}
