package com.geekster.doctorApp.repositories;

import com.geekster.doctorApp.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Long> {

    Patient findFirstByPatientEmail(String userEmail);
}
