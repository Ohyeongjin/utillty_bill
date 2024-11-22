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
        Long lv = 3L;
        String authName = "admin";
        String roleName = "관리자";
        Boolean activeYn = true;
        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime updatedAt = LocalDateTime.now();

        authService.set(new AuthDTO(
                lv,
                authName,
                roleName,
                activeYn,
                createdAt,
                updatedAt
        ));
    }

}
