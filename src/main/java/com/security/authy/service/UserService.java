package com.security.authy.service;


import com.security.authy.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.isNull;

@Slf4j
@Service
public class SecurityService {
    @Autowired
    UserRepository userRepository;



}
