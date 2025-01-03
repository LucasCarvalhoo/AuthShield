package com.lucas.AuthShield.services;

import com.lucas.AuthShield.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



}
