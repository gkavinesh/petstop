package com.petstop.petstop.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String petType;

    private String petName;

    private String description;

    private String contactEmail;

    // Constructors, getters, and setters
}



