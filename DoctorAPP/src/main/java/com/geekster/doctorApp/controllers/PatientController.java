package com.geekster.doctorApp.controllers;


import com.geekster.doctorApp.dto.SignInInput;
import com.geekster.doctorApp.dto.SignInOutput;
import com.geekster.doctorApp.dto.SignUpInput;
import com.geekster.doctorApp.dto.SignUpOutput;
import com.geekster.doctorApp.models.AppointmentKey;
import com.geekster.doctorApp.models.Doctor;
import com.geekster.doctorApp.services.IAuthService;
import com.geekster.doctorApp.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @Autowired
    IAuthService authService;

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return patientService.signUp(signUpDto);
    }


    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto)
    {
        return patientService.signIn(signInDto);
    }

    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>> getAllDoctors(@RequestParam String userEmail, @RequestParam String token)
    {
        HttpStatus status;
        List<Doctor> allDoctors = null;

        if(authService.authenticate(userEmail,token))
        {

            allDoctors =  patientService.getAllDoctors();
            status = HttpStatus.OK;
        }
        else
        {
            status = HttpStatus.FORBIDDEN;
        }


        return new ResponseEntity<List<Doctor>>(allDoctors, status);
    }


    @DeleteMapping("appointment")
    ResponseEntity<Void> cancelAppointment(@RequestParam String userEmail, @RequestParam String token, @RequestBody AppointmentKey key)
    {

        HttpStatus status;
        if(authService.authenticate(userEmail,token))
        {
            patientService.cancelAppointment(key);
            status = HttpStatus.OK;
        }
        else
        {
            status = HttpStatus.FORBIDDEN;
        }

        return new ResponseEntity<Void>(status);

    }

}
