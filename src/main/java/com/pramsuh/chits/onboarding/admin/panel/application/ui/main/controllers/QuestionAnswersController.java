package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.QuestionsAnswers;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.QuestionsAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequestMapping("/api/v1/chit/funds/web/services/faq")
public class QuestionAnswersController {
    @Autowired
    QuestionsAnswersRepository questionsAnswersRepository;

    @GetMapping("/all")
    public ResponseEntity<List<QuestionsAnswers>> findAll() {
        return new ResponseEntity<List<QuestionsAnswers>>(questionsAnswersRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{number}")
    public ResponseEntity<QuestionsAnswers> findByNumber(@PathVariable String number) {
        return new ResponseEntity<QuestionsAnswers>(questionsAnswersRepository.findByNumber(number), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createQueAns(@RequestBody QuestionsAnswers questionsAnswers){
        questionsAnswers.setNow(LocalDateTime.now());
            QuestionsAnswers queAns = questionsAnswersRepository.save(questionsAnswers);
            if(queAns != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
    }
}
