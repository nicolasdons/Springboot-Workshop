package com.projetospringjava.demo.repositories;

import com.projetospringjava.demo.entities.Category;
import com.projetospringjava.demo.entities.Order;
import com.projetospringjava.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
