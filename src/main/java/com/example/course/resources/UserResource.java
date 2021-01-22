package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//Respondendo a requisição no caminho /users
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Maria", "maria@gmail.com", "999999999", "senha123");
		return ResponseEntity.ok().body(u);
	}
	
}
