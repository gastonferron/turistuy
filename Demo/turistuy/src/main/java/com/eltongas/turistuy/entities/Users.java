package com.eltongas.turistuy.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id_user;
    protected String username;
    protected String mail;
    protected String name_user;
    protected String lastname;
    protected String tel;
}
