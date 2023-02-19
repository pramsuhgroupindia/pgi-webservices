package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "teeklychitgroups")
public class TeeklyChitGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mTitle")
    private String mTitle = "";
    @Column(name = "mVisibility")
    private String mVisibility = "";
    @Column(name = "mTotalNumberOfTickets")
    private String mTotalNumberOfTickets = "";
    @Column(name = "mTotalNumberOfAvailableTickets")
    private String mTotalNumberOfAvailableTickets = "";
    @Column(name = "mTotalNumberOfBookedTickets")
    private String mTotalNumberOfBookedTickets = "";
    @Column(name = "mTotalNumberOfVacantTickets")
    private String mTotalNumberOfVacantTickets = "";
    @Column(name = "mTotalNumberOfAuctions")
    private String mTotalNumberOfAuctions = "";
    @Column(name = "mTotalNumberOfAgreementsSigned")
    private String mTotalNumberOfAgreementsSigned = "";
    @Column(name = "mTotalNumberOfTicketsSold")
    private String mTotalNumberOfTicketsSold = "";
    @Column(name = "mBookingStatus")
    private String mBookingStatus = "";
    @Column(name = "minBidRange")
    private String minBidRange = "";
    @Column(name = "maxBidRange")
    private String maxBidRange = "";
    @Column(name = "minPrizeRange")
    private String minPrizeRange = "";
    @Column(name = "maxPrizeRange")
    private String maxPrizeRange = "";

    @Column(name = "code")
    private String code = "";

    @Column(name = "numberOfTickets")
    private String numberOfTickets = "";

    @Column(name = "amount")
    private String amount = "";

    @Column(name = "value")
    private String value = "";

    @Column(name = "duration")
    private String duration = "";

    @Column(name = "time")
    private String time = "";

    @Column(name = "totalinstallmentsnumber")
    private String totalinstallmentsnumber = "";

    @Column(name = "day")
    private String day = "";

    @Column(name = "noauction")
    private String noauction = "";

    @Column(name = "dueday")
    private String dueday = "";

    @Column(name = "distribution")
    private String distribution = "";

    @Column(name = "frequency")
    private String frequency = "";

    @Column(name = "subscription")
    private String subscription = "";

    @Column(name = "dividend")
    private String dividend = "";

    @Column(name = "method")
    private String method = "";

    @Column(name = "efees")
    private String efees = "";

    @Column(name = "paymentfrequency")
    private String paymentfrequency = "";

    @Column(name = "noofguaranters")
    private String noofguaranters = "";

    @Column(name = "joiningdocs")
    private String joiningdocs = "";

    @Column(name = "prizeclaimdocs")
    private String prizeclaimdocs = "";

    @Column(name = "rollid")
    private String rollid = "";

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;

}


