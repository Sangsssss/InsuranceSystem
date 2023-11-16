package com.example.talk.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "survey")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prototype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    private String description;
    private String feedbacks;
    private String requirements;
    private String status;
    private String name;
    private String risks;
    private String developerID;
    private String detailedCategory;
    private String category;
    private int paymentTerm;
    private String cancelReason;
    private double price;

}