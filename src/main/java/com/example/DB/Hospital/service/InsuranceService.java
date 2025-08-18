package com.example.DB.Hospital.service;

import com.example.DB.Hospital.Entity.Insurance;
import com.example.DB.Hospital.Entity.Patient;
import com.example.DB.Hospital.Repository.InsuranceRepository;
import com.example.DB.Hospital.Repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public void assignInsurancetoPatient(Insurance insurance,Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(()-> new IllegalArgumentException("Patient not found "));

        patient.setInsurance(insurance);
    }
}
