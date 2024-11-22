package org.example.service;

import org.example.dto.AuthDTO;
import org.example.dto.UserDTO;
import org.example.dto.UserSignupDTO;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User signup(UserSignupDTO userSignupDto){
      User setUser = User.builder()
              .userId(userSignupDto.userId())
              .password(userSignupDto.password())
              .name(userSignupDto.name())
              .phone(userSignupDto.phone())
              .build();

        return userRepository.save(setUser);
    }

   @Override
    public Optional<User> updateUser(Long pk, User user){
        return userRepository.findById(pk).map(item->{
            if(user.getName() != null) {
                item.setName(user.getName());
            }
            if (user.getPhone() !=null){
                item.setPhone(user.getPhone());
            }
            if (user.getLv() != null) {
                item.setLv(user.getLv());
            }
            if (user.getRoleName() != null) {
                item.setRoleName(user.getRoleName());
            }
            if (user.getCreatedAt() != null) {
                item.setCreatedAt(user.getCreatedAt());
            }
            user.setUpdatedAt(user.getUpdatedAt());
            return  userRepository.save(user);
        });
    }

}
