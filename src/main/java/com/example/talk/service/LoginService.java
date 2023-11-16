package com.example.talk.service;

import com.example.talk.model.Account;
import com.example.talk.model.dto.SignUpForm;
import com.example.talk.repository.AccountUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginService {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AccountUserRepository accountUserRepository;


    public Long save(SignUpForm dto) {
        return accountUserRepository.save(Account.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}


