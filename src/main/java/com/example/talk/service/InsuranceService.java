package com.example.talk.service;

import com.example.talk.model.Insurance;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import java.util.List;

public interface InsuranceService {

    public boolean add();

    public boolean delete(int insuranceID);


    public boolean update(int insuranceID);


    public ResponseEntity<Insurance> retrieve(long insuranceID);

    public List<Insurance> retrieveAll(Model model);
}
