package com.example.talk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "insurance")
@Getter
@Setter
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected long id;
    @Column(name = "description")
    protected String description;
    @Column(name = "type")
    protected String type;
    @Column(name = "name")
    protected String name;
    @Column(name = "price")
    protected double price;
}
