package org.examle.service;

import org.example.Main;
import org.example.dto.AuthDTO;
import org.example.service.AuthService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
@ContextConfiguration(classes = Main.class)
public class AuthTest {

    @Autowired
    AuthService authService;

    @Test
     void setAuthTest() {
        Long pk = 3L;
        String id = "admin3";
        String password = "1234qwer";
        String name = "관리자3";
        LocalDate birthday = LocalDate.now();
        LocalDateTime date = LocalDateTime.now();
        String phoneNum = "010-1111-2222";

        authService.createUser(new AuthDTO( pk,
                id,
                password,
                name,
                birthday,
                date,
                phoneNum
        ));
    }

}
