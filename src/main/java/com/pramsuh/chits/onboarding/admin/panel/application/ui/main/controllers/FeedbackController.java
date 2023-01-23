package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ContactUs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Feedback;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/feedback")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping("{code}")
    public ResponseEntity<Feedback> getFeedbackByCode(@PathVariable String code) {
        return new ResponseEntity<Feedback>(feedbackRepository.getFeedbackByCode(code), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Feedback>> getListOfAllFeedbacks() {
        return new ResponseEntity<List<Feedback>>(feedbackRepository.findAll(), HttpStatus.OK);
    }
}