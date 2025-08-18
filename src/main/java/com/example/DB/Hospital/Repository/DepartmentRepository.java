package com.example.DB.Hospital.Repository;

import com.example.DB.Hospital.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}