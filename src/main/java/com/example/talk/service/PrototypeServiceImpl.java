package com.example.talk.service;

import com.example.talk.model.Prototype;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrototypeServiceImpl implements PrototypeService {
    public Prototype m_Prototype;
    private ArrayList<Prototype> prototypeList;

    public boolean add() {
        return false;
    }

    public boolean delete(int prototypeID) {
        return false;
    }

    public Prototype retrieve(int prototypeID) {
	/*	for(Prototype prototype : prototypeList){
			if(prototype.getId()==prototypeID){
				return prototype;
			}
		}*/
        return null;
    }

    public ArrayList<Prototype> retrieveAll() {
        return this.prototypeList;
    }

    public boolean update(int prototypeID) {
        return false;
    }

}