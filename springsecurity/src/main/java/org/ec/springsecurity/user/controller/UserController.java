package org.ec.springsecurity.user.controller;

import org.ec.springsecurity.user.dto.RegistrationForm;
import org.ec.springsecurity.user.entity.User;
import org.ec.springsecurity.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class UserController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserController(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<User> singUp(@RequestBody RegistrationForm registrationForm) {
        User user = userRepository.save(registrationForm.toUser(passwordEncoder));

        return ResponseEntity.ok(user);
    }
}
