package org.examle.service;

import org.example.Main;
import org.example.dto.UserSignupDTO;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDateTime;

@SpringBootTest
@ContextConfiguration(classes = Main.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
     void setSingTest()throws Exception {
        String userId = "admin";
        String password = "1234ewer";
        String name = "정관리";
        String phone = "010-0000-0000";
        LocalDateTime createdAt = LocalDateTime.now();
        userService.signup(new UserSignupDTO(
                        userId,
                        password,
                        name,
                        phone,
                        createdAt

                )
        );

    }
}
