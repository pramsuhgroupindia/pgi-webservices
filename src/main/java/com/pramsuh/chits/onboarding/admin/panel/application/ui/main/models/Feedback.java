package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.FeedbackStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "aadhar")
    private String aadhar;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "message", columnDefinition = "LONGTEXT")
    private String message;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "status")
    private FeedbackStatus status;

    @Column(name = "code")
    private String code;

}
