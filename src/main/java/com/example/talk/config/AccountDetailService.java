package com.example.talk.config;

import com.example.talk.model.Account;
import com.example.talk.repository.AccountUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountDetailService implements UserDetailsService {

    private final AccountUserRepository accountUserRepository;

    public User loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Account> account = accountUserRepository.findByEmail(email);

        if (account.isPresent()) {
            // 권한 정보를 가져와서 SimpleGrantedAuthority로 변환
            List<GrantedAuthority> authorities = account.get().getAuthorities().stream()
                    .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                    .collect(Collectors.toList());
            System.out.println("2" + authorities.get(0));
            return new User(account.get().getEmail(), account.get().getPassword(), authorities);
        } else {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
    }

}
