package com.geekster.doctorApp.repositories;

import com.geekster.doctorApp.models.Appointment;
import com.geekster.doctorApp.models.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
