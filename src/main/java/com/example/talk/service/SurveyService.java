package com.example.talk.service;

import com.example.talk.model.Survey;

import java.util.ArrayList;

public interface SurveyService {

    public boolean add();


    public boolean delete(int surveyNumber);


    public boolean update(int surveyNumber);


    public Survey retrieve(int surveyNumber);

    public ArrayList<Survey> retrieveAll();

}