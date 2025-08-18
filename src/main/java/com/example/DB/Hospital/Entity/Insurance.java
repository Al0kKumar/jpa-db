package com.example.DB.Hospital.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "insurance") // inverse side
    private Patient patient;

    @Column(nullable = false,length = 50)
   private String policyNumber;

    @Column(nullable = false, length = 100)
   private String provider;

    @Column(nullable = false)
   private LocalDate validUntil;

    @CreationTimestamp
    @Column(nullable = false)
   private LocalDateTime createdAt;
}
