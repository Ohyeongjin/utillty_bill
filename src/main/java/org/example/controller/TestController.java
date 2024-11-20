package org.example.controller;



import org.example.dto.AuthDTO;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    // 회원가입
    @PostMapping("/api/signup")
    public ResponseEntity<String> registerAuth(@RequestBody AuthDTO authDTO){
        testService.set(
                authDTO.pk(),
                authDTO.id(),
                authDTO.password(),
                authDTO.name(),
                authDTO.birthday() == null? LocalDate.now():authDTO.birthday(),
                authDTO.date() == null? LocalDateTime.now():authDTO.date(),
                authDTO.phoneNum()
        );
        return  ResponseEntity.ok("회원가입 성공 :" +authDTO.name());
    }
  /*  @GetMapping("/api/users/{id}")
    public String getUserById(@PathVariable Long id) {
        // 예시로 사용자 정보를 반환
        return "User ID: " + id;
    }*/


}
