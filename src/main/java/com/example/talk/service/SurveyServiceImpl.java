package com.example.talk.service;

import com.example.talk.model.Survey;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService {

    public Survey m_Survey;
    private ArrayList<Survey> surveyList;
	

    public boolean add() {
        return false;
    }


    public boolean delete(int surveyNumber) {
        return false;
    }

    public boolean update(int surveyNumber) {
        return false;
    }

    public Survey retrieve(int surveyNumber) {
        return null;
    }

    public ArrayList<Survey> retrieveAll() {
        return null;
    }

}