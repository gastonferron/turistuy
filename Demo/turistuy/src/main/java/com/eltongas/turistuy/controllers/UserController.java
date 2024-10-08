package com.eltongas.turistuy.controllers;

import com.eltongas.turistuy.entities.Users;
import com.eltongas.turistuy.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private IUserServices userServices;

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        Users newUsers = userServices.saveUser(users);
        System.out.println("Datos " + users.toString());
        return new ResponseEntity<>(newUsers, HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<String> testendpoint() {
        return new ResponseEntity<>("El endpoint funca!", HttpStatus.OK);
    }

}
