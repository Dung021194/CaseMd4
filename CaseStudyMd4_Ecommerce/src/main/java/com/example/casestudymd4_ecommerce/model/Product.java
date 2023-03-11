package com.example.casestudymd4_ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String name;
    private Double price;
    private Long quantity;
    private String description;
    private String imagePath;
    @Transient
    private MultipartFile image;
    @ManyToOne(targetEntity = Category.class)
    private Category category;
    @ManyToOne(targetEntity = Shop.class)
    private Shop shop;



}
