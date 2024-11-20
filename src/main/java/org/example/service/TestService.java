package org.example.service;


import jakarta.validation.Valid;
import org.example.entity.Auth;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public interface TestService {
   void set(Long pk, String id, String password, String name, LocalDate birthday, LocalDateTime date,String phoneNum);


}
