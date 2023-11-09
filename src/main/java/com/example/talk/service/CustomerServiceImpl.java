package com.example.talk.service;

import com.example.talk.model.Account;
import com.example.talk.model.Customer;
import com.example.talk.model.dto.SignUpForm;
import com.example.talk.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(String customerID) {
        return false;
    }

    @Override
    public Account retrieve(String id) {
        return customerRepository.findByEmail(id).orElse(null);
        // id에 해당하는 사용자를 찾아 반환하거나, 찾을 수 없는 경우 null을 반환합니다.
    }

    @Override
    public boolean update(String customerID) {
        return false;
    }

    @Override
    public ArrayList<Customer> retrieveAll() {
        return null;
    }

    @Override
    public ArrayList<Customer> retrieveAllCustomer() {
        return null;
    }

//    public void create(SignUpForm signUpForm) {
//        Customer customer = signUpForm.toEntity();
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
//        customer.setType("CONTRACTOR");
//        customerRepository.save(customer);
//    }

    public Account create(SignUpForm signUpForm) {
        System.out.println(signUpForm.getName() + " " + signUpForm.getEmail() + " " + signUpForm.getPassword());
        Account account = signUpForm.toEntity();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        customerRepository.save(account);
        return account;
    }
}
