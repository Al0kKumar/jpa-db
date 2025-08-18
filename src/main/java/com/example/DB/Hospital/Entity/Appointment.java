package com.example.DB.Hospital.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)  // patient is required in appointment
    private Patient patient;  // owning side

    @ManyToOne
    @JoinColumn(nullable = false)  // doctor is must in appointment
    private Doctor doctor; // owning side , an appointment will have only one doctor

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;
}
