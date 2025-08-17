package com.example.DB.Hospital.Repository;


import com.example.DB.Hospital.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
