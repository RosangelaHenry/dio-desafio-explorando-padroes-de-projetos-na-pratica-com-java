package com.desafio_dio_springboot.userdepto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_dio_springboot.userdepto.entities.User;
import com.desafio_dio_springboot.userdepto.repositories.UserRepository;

import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> result = repository.findById(id);
        return result.orElse(null); 
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return repository.save(user);
    }
}
