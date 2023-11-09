package com.example.talk.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contractor")
@Getter
@Setter
public class Contractor extends Customer {


//    public HashMap<String, String> underwrite(String ffsContact, Contract contract, Insurance insurance, InsuredCustomer insuredCustomer){
//        FFS ffs = new FFS(ffsContact);
//        HashMap<String, String> result = ffs.requestUW(contract, insurance, insuredCustomer);
//        if(result.get("isResult").equals("true")) this.setUnderwritingState("승인");
//        if(result.get("isResult").equals("false")) {
//            this.setUnderwritingState("재심사 가능");
//            this.setRejectionReasons("금융감독원 거절: "+result.get("rejectReason"));
//        }
//        return result;
//    }
//
//
//    public HashMap<String, String> reexamine(String ffsContact, Contract contract, Insurance insurance, InsuredCustomer insuredCustomer, String reUnderwriteReason){
//        FFS ffs = new FFS(ffsContact);
//        HashMap<String, String> result = ffs.requestReUW(contract, insurance, insuredCustomer, reUnderwriteReason);
//        if(result.get("isResult").equals("true")) this.setUnderwritingState("승인");
//        if(result.get("isResult").equals("false")) {
//            this.setUnderwritingState("재심사 거절");
//            this.setRejectionReasons("금융감독원 거절: "+result.get("rejectReason"));
//        }
//        return result;
//    }
//
//    public HashMap<String, String> calculateLossRatio(Insurance insurance, Customer customer){
//        HashMap<String, String> result = new HashMap<>();
//        double estimatedEarning, estimatedPayment;
//        estimatedEarning = (this.period/this.paymentTerm) * this.premium;
//        estimatedPayment = this.paymentRate * insurance.getPrice();
//        double ratio = estimatedPayment/estimatedEarning;
//        this.lossRatio = Math.round(ratio * 100.0) / 100.0;
//        result.put("estimatedEarning", Double.toString(estimatedEarning));
//        result.put("estimatedPayment", Double.toString(estimatedPayment));
//        result.put("lossRatio", (this.lossRatio*100)+"%");
//        result.put("isResult", "true");
//        return result;
//    }
//
//    public double calculatePremium(int insuranceID, double paymentRate){
//        return 0;
//    }
}
