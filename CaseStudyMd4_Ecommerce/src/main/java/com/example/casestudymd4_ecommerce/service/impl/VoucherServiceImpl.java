package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Voucher;
import com.example.casestudymd4_ecommerce.repository.IVoucherRepo;
import com.example.casestudymd4_ecommerce.service.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class VoucherServiceImpl implements IVoucherService {
    @Autowired
    IVoucherRepo voucherRepo;
    @Override
    public Page<Voucher> findAll(Pageable pageable) {
        return voucherRepo.findAll(pageable);
    }

    @Override
    public Voucher findOne(Long id) {
        return voucherRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Voucher voucher) {
        voucherRepo.save(voucher);

    }

    @Override
    public void delete(Long id) {
        voucherRepo.deleteById(id);
    }
}
