package org.example.service;

import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.example.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired AuthRepository authRepository;

    @Override

    public void set(Long pk , String id, String password, String name, LocalDate birthday, LocalDateTime date,String phoneNum) {
        Auth setAuth = Auth.builder()
                .pk(pk)
                .id(id)
                .password(password)
                .name(name)
                .birthday(birthday)
                .date(date)
                .phoneNum(phoneNum)
                .build();

         authRepository.save(setAuth);
    }
}
