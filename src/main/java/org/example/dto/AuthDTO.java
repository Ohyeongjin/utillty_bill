package org.example.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AuthDTO(Long pk , String id, String password, String name, LocalDate birthday, LocalDateTime date, String phoneNum){
}
