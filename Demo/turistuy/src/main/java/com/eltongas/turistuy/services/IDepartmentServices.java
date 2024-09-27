package com.eltongas.turistuy.services;

import com.eltongas.turistuy.entities.Department;

import java.util.List;
import java.util.Optional;
public interface IDepartmentServices {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartments();
    public Optional<Department> findByID(String name_department);
}
