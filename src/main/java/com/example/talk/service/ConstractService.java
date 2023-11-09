package com.example.talk.service;

import com.example.talk.model.Contract;

import java.util.List;

public interface ConstractService {

    public boolean add(int insuranceId, String customerId);

    public boolean delete(int contractID);

    public boolean update(int contractID);

    public Contract retrieve(int contractID);

    public List<Contract> retrieveAll();

}