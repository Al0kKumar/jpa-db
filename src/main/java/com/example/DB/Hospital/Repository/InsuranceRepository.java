package com.example.DB.Hospital.Repository;

import com.example.DB.Hospital.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}