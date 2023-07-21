# DoctorAPPProject

## Framework and Language used
* Spring Boot
* Java
---

## Data flow
1. controllers
    * AppointmentController
    * DoctorController
    * PatientController
---

2. dto
    * SignInInput
    * SignInOutput
    * SignUpInput
    * SignUpOutput
---

3. models
    * Appointment
    * AppointmentKey
    * AuthenticationToken
    * Doctor
    * Patient
    * Specialization
---

4. services
    * AppointmentService
    * AuthenticationService
    * DoctorService
    * IAuthService
    * PatientService
---

5. repositories
    * IAppointmentRepo
    * IDoctorRepo
    * IPatientRepo
    * ITokenRepo
---

## Data Structure Used
* Mysql
---

## Project Summary
```In this project user first have to sign up, after successfully sign up they have to sign in by providing correct informations. if the user valid they can book a appointment with a doctor. and user can also get details for their booked appointment. user can also check the available doctors. on the doctor side they are eligible to check their appointment list and their patient details.```


