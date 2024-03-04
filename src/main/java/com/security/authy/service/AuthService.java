package com.security.authy.service;
import com.security.authy.dto.LoginUserDto;
import com.security.authy.entity.User;
import com.security.authy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String login(LoginUserDto loginUserDto) {
        User user = userRepository.findByUsername(loginUserDto.getUsername());
        if(user == null) throw new RuntimeException();
        if(!user.getPassword().equals(loginUserDto.getPassword())) throw new RuntimeException();

        return "Logged in.";
    }
}