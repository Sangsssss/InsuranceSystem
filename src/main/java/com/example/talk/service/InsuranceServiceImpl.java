package com.example.talk.service;

import com.example.talk.model.Insurance;
import com.example.talk.repository.InsuranceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {
    private final InsuranceRepository insuranceRepository;


    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean delete(int insuranceID) {
        return false;
    }

    @Override
    public boolean update(int insuranceID) {
        return false;
    }

    @Override
    public ResponseEntity<Insurance> retrieve(long insuranceID) {
        Insurance selectedInsurance = insuranceRepository.findById(insuranceID).orElse(null);
        if (selectedInsurance == null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(selectedInsurance, HttpStatus.OK);
    }

    @Override
    public List<Insurance> retrieveAll(Model model) {
        List<Insurance> insuranceEntityList = insuranceRepository.findAll();
        if (insuranceEntityList.isEmpty()) {
            log.info("보험 상품이 존재 X");
        } else
            model.addAttribute("insuranceList", insuranceEntityList);
        return insuranceEntityList;
    }
}
