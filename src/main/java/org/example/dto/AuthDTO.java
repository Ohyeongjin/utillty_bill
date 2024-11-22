package org.example.dto;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AuthDTO(Long lv , String authName, String roleName, Boolean activeYn, LocalDateTime createdAt, LocalDateTime updatedAt){
}
