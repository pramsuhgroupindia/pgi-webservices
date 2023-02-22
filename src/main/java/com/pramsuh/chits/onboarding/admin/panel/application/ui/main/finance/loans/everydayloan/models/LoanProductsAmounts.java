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
@Table(name = "loanproductsamount")
public class LoanProductsAmounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loanNumber")
    private int loanNumber;
    @Column(name = "durationInDays)")
    private int durationInDays;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "loanAmount")
    private int loanAmount;

    @Column(name = "principleAmount")
    private int principleAmount;

    @Column(name="interestAmount")
    private int interestAmount;

    @Column(name="totalAmount")
    private int totalAmount;

    @Column(name="perDayAmount")
    private int perDayAmount;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;


}
