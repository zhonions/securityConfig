package com.security.authy.service;


import com.security.authy.dto.CreateUserDto;
import com.security.authy.entity.User;
import com.security.authy.repository.UserRepository;
import com.security.authy.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User createUser(CreateUserDto createUserDto){
        User user = new User();
        user.setUsername(createUserDto.getUsername());
        user.setPassword(createUserDto.getPassword());
        user.setRole(Role.ADMIN);
        userRepository.save(user);
        return user;
    }


}
