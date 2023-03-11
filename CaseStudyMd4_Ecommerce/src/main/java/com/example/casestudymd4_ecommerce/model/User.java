package com.example.casestudymd4_ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String password;
private String phoneNumber;
private String email;
private String address;
private Double balance;
private Boolean status;
@ManyToMany(fetch = FetchType.EAGER)
private Set<Role> roles;
}
