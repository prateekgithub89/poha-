package com.example.Poha.repo;

import com.example.Poha.model.Employee_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee_Model,Long> {
}
