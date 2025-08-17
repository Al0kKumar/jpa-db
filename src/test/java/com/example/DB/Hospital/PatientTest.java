package com.example.DB.Hospital;

import com.example.DB.Hospital.Entity.Patient;
import com.example.DB.Hospital.Repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void getAllPatients(){
        List<Patient> patients = patientRepository.findAll();
        System.out.println(patients);
    }

    public void getPatientbyId(Long id){
        patientRepository.findById(id);
    }

    public void createPatient(Patient patient){
        patientRepository.save(patient);
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }
}
