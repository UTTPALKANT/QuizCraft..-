package com.uttpal.QuizMaster.service;


import com.uttpal.QuizMaster.entity.QuizQuestion;
import com.uttpal.QuizMaster.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class QuestionService {

        @Autowired
        QuestionRepo questionRepo;

        public List<QuizQuestion> getAllQuestions()
        {
            List<QuizQuestion> questionRepoAll = questionRepo.findAll();
            return questionRepoAll;
        }


        public QuizQuestion saveQuestion(QuizQuestion question){
            QuizQuestion save = questionRepo.save(question);
            return save;
        }
    }