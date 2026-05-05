package com.projetospringjava.demo.repositories;

import com.projetospringjava.demo.entities.Product;
import com.projetospringjava.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Long> {
}
