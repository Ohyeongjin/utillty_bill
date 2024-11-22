package org.example.dto;


import org.example.entity.Auth;

import java.time.LocalDateTime;


public record UserDTO(Long userId,String id, String password, String name, String phone, Auth lv, Auth roleName, LocalDateTime createdAt, LocalDateTime updatedAt){
}
