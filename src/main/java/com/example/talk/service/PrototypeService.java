package com.example.talk.service;

import com.example.talk.model.Prototype;

import java.util.ArrayList;

public interface PrototypeService {
    public boolean add();

    public boolean delete(int prototypeID);

    public Prototype retrieve(int prototypeID);

    public ArrayList<Prototype> retrieveAll();

    public boolean update(int prototypeID);
}