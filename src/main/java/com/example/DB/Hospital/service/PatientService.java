package com.example.DB.Hospital.service;

import com.example.DB.Hospital.Entity.Patient;
import com.example.DB.Hospital.Repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

   // @Transactional
    public Patient getPatientbyId(Long id){
        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();

        return p1;
    }
}
