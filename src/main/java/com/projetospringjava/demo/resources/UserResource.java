package com.projetospringjava.demo.resources;

import com.projetospringjava.demo.entities.User;
import com.projetospringjava.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")



public class UserResource {
    @Autowired
    private UserService service;
      @GetMapping//o que vai acontecer quando alguem entrar nessa pagina
    public ResponseEntity<List<User>> findALL() {
          List<User> list = service.FindALL();
          return ResponseEntity.ok().body(list);
    }
  @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
          User obj = service.findById(id);
          return  ResponseEntity.ok().body(obj);
  }
}
