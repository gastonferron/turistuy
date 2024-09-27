package com.eltongas.turistuy.repository;

import com.eltongas.turistuy.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository <Department, String>{

}