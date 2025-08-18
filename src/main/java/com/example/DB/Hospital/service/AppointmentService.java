package com.example.DB.Hospital.service;

import com.example.DB.Hospital.Entity.Appointment;
import com.example.DB.Hospital.Entity.Doctor;
import com.example.DB.Hospital.Entity.Patient;
import com.example.DB.Hospital.Repository.AppointmentRepository;
import com.example.DB.Hospital.Repository.DoctorRepository;
import com.example.DB.Hospital.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    public void createAppointment(Appointment appointment,Long doctorId,Long patientId){
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        appointmentRepository.save(appointment);
    }
}
