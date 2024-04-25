package com.petstop.petstop.controller;

import com.petstop.petstop.entity.Appointment;
import com.petstop.petstop.service.AppointmentService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping("/appointment")
    public Appointment postAppointment(@RequestBody Appointment appointment) {
        return appointmentService.post(appointment);
    }

    @GetMapping("/appointment")
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    @DeleteMapping("/appointment/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable Long id){
        try{
            appointmentService.deleteAppointment(id);
            return new ResponseEntity<>( "Appointment with ID" + id + " deleted successfully", HttpStatus.OK);

        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/appointment/{id}")
    public ResponseEntity<?> getAppointmentById(@PathVariable Long id){
        Appointment appointment = appointmentService.getAppointmentByID(id);
        if(appointment == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(appointment);
    }

    @PatchMapping("/appointment/{id}")
    public ResponseEntity<?> updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment){
        Appointment updatedAppointment = appointmentService.updateAppointment(id,appointment);

        if(updatedAppointment == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(updatedAppointment);
    }





}

