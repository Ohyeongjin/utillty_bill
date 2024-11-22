package org.example.service;

import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public interface AuthService {

   Auth set(AuthDTO authDto);

   /* // user info
    Optional<Auth> getUserBuId(Long lv);

    // user update
    Optional<Auth> updateUser(Long lv, Auth auth);

    // user delete
    void deleteUser(Long lv);*/


}
