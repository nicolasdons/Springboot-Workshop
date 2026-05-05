package com.projetospringjava.demo.service;


import com.projetospringjava.demo.entities.Product;
import com.projetospringjava.demo.repositories.ProductRepository;
import com.projetospringjava.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> FindALL() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}