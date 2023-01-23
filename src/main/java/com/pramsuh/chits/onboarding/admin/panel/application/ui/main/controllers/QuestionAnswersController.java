package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.QuestionsAnswers;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.QuestionsAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/chit/funds/web/services/faq")
public class QuestionAnswersController {
    @Autowired
    QuestionsAnswersRepository questionsAnswersRepository;

    @GetMapping()
    public ResponseEntity<List<QuestionsAnswers>> findAll() {
        return new ResponseEntity<List<QuestionsAnswers>>(questionsAnswersRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{number}")
    public ResponseEntity<QuestionsAnswers> findByNumber(@PathVariable String number) {
        return new ResponseEntity<QuestionsAnswers>(questionsAnswersRepository.findByNumber(number), HttpStatus.OK);
    }

}
