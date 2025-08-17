package com.example.DB.Hospital;

import com.example.DB.Hospital.Entity.Patient;
import com.example.DB.Hospital.Repository.PatientRepository;
import com.example.DB.Hospital.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void getAllPatients(){
        List<Patient> patients = patientRepository.findAll();
        System.out.println(patients);
    }

    @Test
    public void getPatientbyId(Long id){
        Patient patient = patientService.getPatientbyId(id);
        System.out.println(patient);
    }

    public void createPatient(Patient patient){
        patientRepository.save(patient);
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }
}
