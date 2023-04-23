package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "HBLoanApplication")
public class HBLoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "now")
    private LocalDateTime now;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "number")
    private int number;
    @Column(name = "category")
    private String category;

    @Column(name = "type")
    private String type;

    @Column(name = "tenure")
    private int tenure;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gendor")
    private String gendor;

    @Column(name = "first")
    private String first;

    @Column(name = "middle")
    private String middle;

    @Column(name = "last")
    private String last;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "aadhar")
    private String aadhar;

    @Column(name = "pan")
    private String pan;

    @Column(name = "etype")
    private String etype;

    @Column(name = "bname")
    private String bname;

    @Column(name = "income")
    private int income;

    @Column(name = "rpin")
    private String rpin;

    @Column(name = "wpin")
    private String wpin;

    @Column(name = "qual")
    private String qual;

    @Column(name = "pro")
    private String pro;

    @Column(name = "ccq")
    private String ccq;

    @Column(name = "mpq")
    private String mpq;

    @Column(name = "amount")
    private String amount;
    @Column(name = "cclimit")
    private int cclimit;

    @Column(name = "noOfCards")
    private int noOfCards;

    @Column(name = "noOfMonthsInCard")
    private int noOfMonthsInCard;

}