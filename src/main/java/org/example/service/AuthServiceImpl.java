package org.example.service;

import org.example.dto.AuthDTO;
import org.example.entity.Auth;
import org.example.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service("testService")
public class AuthServiceImpl implements AuthService {
    @Autowired AuthRepository authRepository;

    @Override

    public Auth createUser(AuthDTO authDTO) {
        Auth setAuth = Auth.builder()
                .pk(authDTO.pk())
                .id(authDTO.id())
                .password(authDTO.password())
                .name(authDTO.name())
                .phoneNum(authDTO.phoneNum())
                .build();

         return authRepository.save(setAuth);
    }

    /*
    * public Auth createUser(AuthDTO authDTO) {
        Auth auth = new Auth();
        auth.setPk(authDTO.pk());
        auth.setId(authDTO.id());
        auth.setPassword(authDTO.password());
        auth.setName(authDTO.name());
        auth.setBirthday(authDTO.birthday());
        auth.setDate(authDTO.date());
        auth.setPhoneNum(authDTO.phoneNum());
        return authRepository.save(auth);
    }
    * */
    @Override
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
    }


}
