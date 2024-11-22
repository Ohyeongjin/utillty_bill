package org.example.dto;


import java.time.LocalDateTime;


public record UserSignupDTO(String userId, String password, String name, String phone,LocalDateTime createdAt){
}
