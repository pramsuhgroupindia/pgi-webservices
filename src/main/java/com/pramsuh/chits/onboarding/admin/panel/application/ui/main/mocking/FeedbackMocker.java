package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Feedback;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.FeedbackRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.FeedbackStatus;

public class FeedbackMocker {
    public void mockFeedback(FeedbackRepository feedbackRepository){
        Feedback feedback1 = new Feedback();
        feedback1.setAadhar("597961516428");
        feedback1.setDate("23 Jan 2023");
        feedback1.setCode("FEED0001");
        feedback1.setMessage("Please add account copy");
        feedback1.setMobile("9581286452");
        feedback1.setTime("5PM");
        feedback1.setStatus(FeedbackStatus.SENT);
        feedback1.setName("PRAMSUH WAWDHANE");
        feedbackRepository.save(feedback1);
    }
}
