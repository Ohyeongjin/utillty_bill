package org.example.service;

import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public interface AuthService {
 Auth createUser(AuthDTO authDTO);



    // user info
    Optional<Auth> getUserByPk(Long pk);

    // user update
    Optional<Auth> updateUser(Long pk, Auth auth);

    // user delete
    void deleteUser(Long pk);


}
