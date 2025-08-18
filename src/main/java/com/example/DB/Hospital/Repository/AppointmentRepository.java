package com.example.DB.Hospital.Repository;

import com.example.DB.Hospital.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}