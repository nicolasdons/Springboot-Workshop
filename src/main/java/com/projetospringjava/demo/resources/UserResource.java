package com.projetospringjava.demo.resources;

import com.projetospringjava.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")


public class UserResource {
      @GetMapping//o que vai acontecer quando alguem entrar nessa pagina
    public ResponseEntity<User> findALL() {
   User u = new User(1L,"joao","989898","joao@gmail.com","65266");
   return ResponseEntity.ok().body(u);
    }

}
