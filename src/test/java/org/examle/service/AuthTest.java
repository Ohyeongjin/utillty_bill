package org.examle.service;

import org.example.Main;
import org.example.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ContextConfiguration(classes = {Main.class,TestService.class})
public class AuthTest {

    @Autowired
    private TestService testService;

    @Test
     public void setAuthTest() {
        Long pk = 1L;
        String id = "admin";
        String password = "1234ewer";
        String name = "관리자";
        LocalDate birthday = LocalDate.now();
        LocalDateTime date = LocalDateTime.now();
        String phoneNum = "010-1111-2222";
        testService.set(pk,id,password,name,birthday,date,phoneNum);
    }

}
