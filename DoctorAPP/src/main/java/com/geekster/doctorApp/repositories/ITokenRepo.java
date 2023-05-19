package com.geekster.doctorApp.repositories;

import com.geekster.doctorApp.models.AuthenticationToken;
import com.geekster.doctorApp.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
