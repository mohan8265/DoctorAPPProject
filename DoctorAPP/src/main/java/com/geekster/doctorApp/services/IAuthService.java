package com.geekster.doctorApp.services;

import com.geekster.doctorApp.models.AuthenticationToken;
import com.geekster.doctorApp.models.Patient;

public interface IAuthService {

     void saveToken(AuthenticationToken token);
     AuthenticationToken getToken(Patient patient);
     boolean authenticate(String userEmail, String token);


}
