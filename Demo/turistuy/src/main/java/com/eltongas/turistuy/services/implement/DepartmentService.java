package com.eltongas.turistuy.services.implement;

import com.eltongas.turistuy.entities.Department;
import com.eltongas.turistuy.repository.IDepartmentRepository;
import com.eltongas.turistuy.services.IDepartmentServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentServices {

    @Autowired
    private IDepartmentRepository iDepartmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return iDepartmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return iDepartmentRepository.findAll();
    }

    @Override
    public Optional<Department> findByID(String name_department) {
        return iDepartmentRepository.findById(name_department);
    }
}
