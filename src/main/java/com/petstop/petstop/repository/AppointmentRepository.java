package com.petstop.petstop.repository;

import com.petstop.petstop.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
