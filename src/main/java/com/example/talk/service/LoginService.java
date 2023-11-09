package com.example.talk.service;

import com.example.talk.model.Account;
import com.example.talk.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginService implements UserDetailsService {
    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Account> account = customerRepository.findByEmail(email);
        if (!account.isPresent()) {
            log.info("User not found");
            throw new UsernameNotFoundException("User not found");
        }
        System.out.println("success");
        return new User(account.get().getEmail(), account.get().getPassword(), new ArrayList<>());
    }

    ;
}

