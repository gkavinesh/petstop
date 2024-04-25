package com.petstop.petstop.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import com.petstop.petstop.entity.Appointment;
import com.petstop.petstop.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public Appointment post(Appointment appointment){

        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();

    }

    public void deleteAppointment(Long id){
        if(!appointmentRepository.existsById(id)){
            throw new EntityNotFoundException("Employee with ID " + id + " not found");
        }

        appointmentRepository.deleteById(id);
    }

    public Appointment getAppointmentByID(Long id){
        return appointmentRepository.findById(id).orElse(null);
    }

    public Appointment updateAppointment(Long id,Appointment appointment){
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
        if(optionalAppointment.isPresent()){
            Appointment existingAppointment = optionalAppointment.get();

            existingAppointment.setContactEmail(appointment.getContactEmail());
            existingAppointment.setPetName(appointment.getPetName());
            existingAppointment.setPetType(appointment.getPetType());
            existingAppointment.setDescription(appointment.getDescription());

            return appointmentRepository.save(existingAppointment);

        }
        return null;
    }

}
