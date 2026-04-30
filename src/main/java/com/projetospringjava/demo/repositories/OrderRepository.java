package com.projetospringjava.demo.repositories;

import com.projetospringjava.demo.entities.Order;
import com.projetospringjava.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order,Long> {
}
