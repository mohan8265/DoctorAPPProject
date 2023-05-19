package com.geekster.doctorApp.services;


import com.geekster.doctorApp.models.Appointment;
import com.geekster.doctorApp.models.AppointmentKey;
import com.geekster.doctorApp.repositories.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}
