package com.eltongas.turistuy.repository;

import com.eltongas.turistuy.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository <Users, Integer>{

}
