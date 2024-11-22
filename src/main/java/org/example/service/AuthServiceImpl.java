package org.example.service;

import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.example.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service("authService")
public class AuthServiceImpl implements AuthService {
    @Autowired AuthRepository authRepository;

    @Override

    public Auth set(AuthDTO authDto) {
        Auth existingAuth = authRepository.findById(authDto.lv()).orElseThrow(() -> new RuntimeException("Auth not found"));

        if (authDto.authName() != null) {
            existingAuth.setAuthName(authDto.authName());
        }
        if (authDto.roleName() != null) {
            existingAuth.setRoleName(authDto.roleName());
        }
        if (authDto.activeYn() != null) {
            existingAuth.setActiveYn(authDto.activeYn());
        }
        if (authDto.createdAt() != null) {
            existingAuth.setCreatedAt(authDto.createdAt());
        }
            existingAuth.setUpdatedAt(authDto.updatedAt());
        return authRepository.save(existingAuth);
    }
   /* @Override
    public Optional<Auth> getUserByPk(Long pk){
        return authRepository.findById(pk);
    }

    @Override
    public Optional<Auth> updateUser(Long pk, Auth auth) {
        return authRepository.findById(pk).map(user->{
           user.setName(auth.getName());
           if (auth.getPhoneNum() != null) {
               user.setPhoneNum(auth.getPhoneNum());
           }
           return  authRepository.save(user);
        });
    }

    @Override
    public void deleteUser(Long pk) {
        authRepository.deleteById(pk);
    }*/


}
