package com.example.casestudymd4_ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    @ManyToOne(targetEntity = Product.class)
    Product product;
    @ManyToOne(targetEntity = User.class)
    User account;
    Double percent;

}
