package com.eltongas.turistuy.controllers;

import com.eltongas.turistuy.entities.Users;
import com.eltongas.turistuy.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private IUserServices userServices;

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        Users newUsers = userServices.saveUser(users);
        System.out.println("Datos " + users);
        return new ResponseEntity<>(newUsers, HttpStatus.OK);

    }


}
