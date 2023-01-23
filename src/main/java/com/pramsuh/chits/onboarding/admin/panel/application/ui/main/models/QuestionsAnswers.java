package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "faq")
public class QuestionsAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private String number;

    @Column(name = "question", columnDefinition = "LONGTEXT")
    private String question;

    @Column(name = "answer", columnDefinition = "LONGTEXT")
    private String answer;


}
