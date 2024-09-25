package com.eltongas.turistuy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tourist")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tourist extends Users{

    private String nacionality;
}
