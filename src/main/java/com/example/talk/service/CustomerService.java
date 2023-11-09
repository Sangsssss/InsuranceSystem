package com.example.talk.service;

import com.example.talk.model.Account;
import com.example.talk.model.Customer;

import java.util.ArrayList;

public interface CustomerService {

    public boolean add(Customer customer);

    public boolean delete(String customerID);


    // 추후 Customer 타입으로
    public Account retrieve(String customerID);

    public boolean update(String customerID);

    public ArrayList<Customer> retrieveAll();

    public ArrayList<Customer> retrieveAllCustomer();

}