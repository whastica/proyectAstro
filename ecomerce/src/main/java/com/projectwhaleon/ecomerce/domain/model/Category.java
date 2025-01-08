package com.projectwhaleon.ecomerce.domain.model;

import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.Data;

import jakarta.persistence.OneToMany;

import jakarta.persistence.ManyToMany;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "category")
    private Set<Category_type> category_type;
    
    @ManyToMany(mappedBy = "category")
    private Set<Product> product;
}
