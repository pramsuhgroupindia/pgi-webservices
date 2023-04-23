package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "HBEyojanaApplication")
public class HBEyojanaApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "now")
    private LocalDateTime now;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "number")
    private int number;

    @Column(name = "amount")
    private int amount;


    @Column(name = "typeOfApplicant")
    private String typeOfApplicant;


    @Column(name = "typeOfActivity")
    private String typeOfActivity;

    @Column(name = "altMobile")
    private String altMobile;


    @Column(name = "marStatus")
    private String marStatus;


    @Column(name = "noOfKids")
    private String noOfKids;


    @Column(name = "purpose")
    private String purpose;


    @Column(name = "brief")
    private String brief;


    @Column(name = "typeOfLoan")
    private String typeOfLoan;


    @Column(name = "busSince")
    private String busSince;


    @Column(name = "ExpInBus")
    private int ExpInBus;


    @Column(name = "typeOfResPro")
    private String typeOfResPro;


    @Column(name = "stayInResPro")
    private int stayInResPro;


    @Column(name = "typeOfOffPro")
    private String typeOfOffPro;


    @Column(name = "itrFlag")
    private boolean itrFlag;


    @Column(name = "itrPwd")
    private String itrPwd;


    @Column(name = "gstFlag")
    private boolean gstFlag;


    @Column(name = "gstNumber")
    private String gstNumber;


    @Column(name = "gstPwd")
    private String gstPwd;


    @Column(name = "olrq")
    private String olrq;


    @Column(name = "olrqDetails")
    private String olrqDetails;


    @Column(name = "caste")
    private String caste;


    @Column(name = "bank")
    private String bank;


    @Column(name = "accountNumber")
    private String accountNumber;


    @Column(name = "ifsc")
    private String ifsc;


    @Column(name = "obank")
    private String obank;


    @Column(name = "oaccountNumber")
    private String oaccountNumber;


    @Column(name = "oifsc")
    private String oifsc;


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


    @Column(name = "pemail")
    private String pemail;


    @Column(name = "oemail")
    private String oemail;


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


    @Column(name = "cclimit")
    private int cclimit;


    @Column(name = "noOfCards")
    private int noOfCards;


    @Column(name = "noOfMonthsInCard")
    private int noOfMonthsInCard;

}