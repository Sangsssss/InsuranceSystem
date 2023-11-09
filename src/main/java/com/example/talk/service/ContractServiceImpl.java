package com.example.talk.service;

import com.example.talk.model.Contract;
import com.example.talk.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ConstractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public boolean add(int insuranceId, String customerId) {
        Contract contract = new Contract();

        contract.setInsuranceId(insuranceId);
        contract.setContractorId(customerId);
//        SalesTeam salesTeamDao = new SalesTeam();
//        int randomIndex = ThreadLocalRandom.current().nextInt(0, salesTeamDao.retrieveAll().size());
//        String salesEmployee = salesTeamDao.retrieveAll().get(randomIndex).getId();
//        contract.setEmployeeID(salesEmployee);
//        contract.setPremium(selectedInsurance.getPrice());
        contract.setUnderwritingState("가입신청");
        contractRepository.save(contract);
        if (contract == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int contractID) {
        return false;
    }

    @Override
    public boolean update(int contractID) {
        return false;
    }

    @Override
    public Contract retrieve(int contractID) {
        return null;
    }

    @Override
    public List<Contract> retrieveAll() {
        return contractRepository.findAll();
    }

    public List<Contract> showContractState(Model model, String customerId) {
        List<Contract> contractEntityList = retrieveAll();
        List<Contract> customerContractList = new ArrayList<>();
        if (!contractEntityList.isEmpty()) {
            for (Contract contract : contractEntityList) {
                log.info("Contract ID : " + contract.getContractorId() + "CustomerID : " + customerId);
                if (contract.getContractorId().equals(customerId)) {
                    log.info("아이디 일치");
                    customerContractList.add(contract);
                }
            }
            System.out.println();
            if (!customerContractList.isEmpty()) {
                model.addAttribute("customerContractList", customerContractList);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return customerContractList;
    }
}
