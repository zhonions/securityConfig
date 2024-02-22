package com.security.authy.service;


import com.security.authy.dto.CreateUserDto;
import com.security.authy.entity.User;
import com.security.authy.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User createUser(CreateUserDto createUserDto){
        User user = new User(createUserDto.getUsername(), createUserDto.getPassword());
        return user;
    }


}
