package org.example.bookstoremanagement.service;

import lombok.RequiredArgsConstructor;
import org.example.bookstoremanagement.entity.User;
import org.example.bookstoremanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
