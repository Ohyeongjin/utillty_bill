package org.examle.service;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Main.class)
public class LogTest {

    @Autowired
//    LoginService loginService;

    @Test
     void setAuthTest() {
        Long pk = 1L;
        String id = "admin";
        String password = "1234ewer";
//        loginService.getLoging(id,password  );
    }

}
