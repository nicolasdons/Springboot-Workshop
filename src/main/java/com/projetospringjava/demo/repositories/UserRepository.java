package com.projetospringjava.demo.repositories;

import com.projetospringjava.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {
}
