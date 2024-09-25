package com.eltongas.turistuy.services;

import com.eltongas.turistuy.entities.Users;

import java.util.List;
import java.util.Optional;

public interface IUserServices {
    public Users saveUser(Users users);
    public List<Users> getAllUsers();
    public Optional<Users> findByID(Integer id);
}
