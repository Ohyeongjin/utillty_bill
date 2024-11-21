package org.example.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record UserDTO(Long pk , String id, String password, String name, String phoneNum, LocalDateTime date, List<String> roles){
}
