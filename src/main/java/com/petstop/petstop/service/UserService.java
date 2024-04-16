package com.petstop.petstop.service;

import lombok.RequiredArgsConstructor;
import com.petstop.petstop.entity.User;
import com.petstop.petstop.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User postUser(User user){
        return userRepository.save(user);
    }

}
