package org.example.service;

import org.example.dto.UserDTO;
import org.example.dto.UserSignupDTO;
import org.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface UserService {

 User signup(UserSignupDTO serSignupDto)throws Exception;

 Optional<User> updateUser(Long pk, User user);

}
