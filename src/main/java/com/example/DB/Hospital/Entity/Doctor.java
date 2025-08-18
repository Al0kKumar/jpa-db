package com.example.DB.Hospital.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(length = 100)
    private String specilization;

    @Column(nullable = false,unique = true,length = 100)
    private String email;

}
