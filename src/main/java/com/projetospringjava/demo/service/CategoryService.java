package com.projetospringjava.demo.service;

import com.projetospringjava.demo.entities.Category;
import com.projetospringjava.demo.entities.Order;
import com.projetospringjava.demo.repositories.CategoryRepository;
import com.projetospringjava.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> FindALL() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
