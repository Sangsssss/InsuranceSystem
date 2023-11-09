package com.example.talk.config;

import com.example.talk.model.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.User;

@Getter
@Setter
public class SecurityCustomer extends User {
    private static final String ROLE_PREFIX = "ROLE_";

    public SecurityCustomer(Customer customer) {
        super(customer.getEmail(), customer.getPassword(), null);
    }

//    private static SimpleGrantedAuthority makeGrantedAuthority(String type) {
//        SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(ROLE_PREFIX + type);
//        return grantedAuthority;
//    }
}
