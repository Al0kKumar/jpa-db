package com.example.DB.Hospital.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(
        indexes = {
                @Index(name = "birth_date", columnList = "birthDate")
        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    @Column(unique = true)
    private String email;

    private String gender;

}
