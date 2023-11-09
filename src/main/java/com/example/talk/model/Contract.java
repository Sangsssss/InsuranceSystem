package com.example.talk.model;


import jakarta.persistence.*;
import lombok.*;

// 추후 삭제, TEST CLASS
@Entity
@Table(name = "contract")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "contractorId")
    private String contractorId;

    @Column(name = "insuranceId")
    private long insuranceId;

    @Column(name = "insuredCustomerId")
    private String insuredCustomerId;

    @Column(name = "employeeId")
    private String employeeId;

    @Column(name = "fee")
    private double fee;

    @Column(name = "premium")
    private double premium;

    @Column(name = "paymentRate")
    private double paymentRate;

    @Column(name = "numberOfNonPayments")
    private int numberOfNonPayments;

    @Column(name = "period")
    private int period;

    @Column(name = "signedDate")
    private String signedDate;

    @Column(name = "expirationDate")
    private String expirationDate;

    @Column(name = "paymentTerm")
    private int paymentTerm;

    @Column(name = "lossRatio")
    private double lossRatio;

    @Column(name = "underwritingState")
    private String underwritingState;

    @Column(name = "rejectionReasons")
    private String rejectionReasons;
}
