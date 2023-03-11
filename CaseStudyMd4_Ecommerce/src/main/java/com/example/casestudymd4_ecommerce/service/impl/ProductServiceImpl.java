package com.example.casestudymd4_ecommerce.service.impl;

import com.example.casestudymd4_ecommerce.model.Product;
import com.example.casestudymd4_ecommerce.repository.IProductRepo;
import com.example.casestudymd4_ecommerce.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class ProductServiceImpl implements IProductService {
    @Value("${upload}")
    private String uploadPath;
    @Value("${display}")
    private String displayPath;
    @Autowired
    IProductRepo productRepo;

    @Override
    public Page<Product> findAllPage(Pageable pageable, String name) {
        return productRepo.findAllByNameContaining(pageable,name);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public Product findOne(Long id) {
       return productRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        if (product.getImage()!=null){
            product.setImagePath(getFileName(product));
        }else {
            if (product.getImagePath().equals("")){
                product.setImagePath(displayPath + "avatar.jpg");
            }
        }
        productRepo.save(product);

    }

    @Override
    public void delete(Long id) {
        productRepo.deleteById(id);

    }
    public String getFileName(Product product) {
        MultipartFile image = product.getImage();
        String fileName = image.getOriginalFilename();
        try {
            FileCopyUtils.copy(image.getBytes(), new File(uploadPath + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return fileName;
    }
}
