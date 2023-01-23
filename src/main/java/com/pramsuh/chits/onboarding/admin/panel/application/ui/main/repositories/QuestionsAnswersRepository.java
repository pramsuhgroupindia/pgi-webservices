package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.QuestionsAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsAnswersRepository extends JpaRepository<QuestionsAnswers, Long> {
    public QuestionsAnswers findByNumber(String number);
}