package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "loanproductsdurations")
public class LoanProductsDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "durationInDays)")
    private int durationInDays;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "toggle")
    private boolean toggle;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;


}
