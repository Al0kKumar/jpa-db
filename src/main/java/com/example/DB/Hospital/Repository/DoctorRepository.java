package com.example.DB.Hospital.Repository;

import com.example.DB.Hospital.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}