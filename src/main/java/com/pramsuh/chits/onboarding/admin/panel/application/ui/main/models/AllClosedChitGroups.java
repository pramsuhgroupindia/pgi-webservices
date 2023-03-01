package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.Frequency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ClosedChitGroups")
public class AllClosedChitGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mTitle")
    private String mTitle = "";
    @Column(name = "mVisibility")
    private boolean mVisibility;
    @Column(name = "mTotalNumberOfTickets")
    private int mTotalNumberOfTickets ;
    @Column(name = "mTotalNumberOfAvailableTickets")
    private int mTotalNumberOfAvailableTickets ;
    @Column(name = "mTotalNumberOfBookedTickets")
    private int mTotalNumberOfBookedTickets ;
    @Column(name = "mTotalNumberOfVacantTickets")
    private int mTotalNumberOfVacantTickets;
    @Column(name = "mTotalNumberOfAuctions")
    private int mTotalNumberOfAuctions;
    @Column(name = "mTotalNumberOfAgreementsSigned")
    private int mTotalNumberOfAgreementsSigned;
    @Column(name = "mTotalNumberOfTicketsSold")
    private int mTotalNumberOfTicketsSold;
    @Column(name = "mBookingStatus")
    private int mBookingStatus;
    @Column(name = "minBidRange")
    private int minBidRange;
    @Column(name = "maxBidRange")
    private int maxBidRange;
    @Column(name = "minPrizeRange")
    private int minPrizeRange;
    @Column(name = "maxPrizeRange")
    private int maxPrizeRange;

    @Column(name = "code")
    private String code = "";

    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "amount")
    private int amount;

    @Column(name = "value")
    private int value;

    @Column(name = "duration")
    private String duration = "";

    @Column(name = "time")
    private String time = "";

    @Column(name = "totalinstallmentsnumber")
    private int totalinstallmentsnumber ;

    @Column(name = "day")
    private String day = "";

    @Column(name = "noauction")
    private String noauction = "";

    @Column(name = "dueday")
    private String dueday = "";

    @Column(name = "distribution")
    private String distribution = "";

    @Column(name = "frequency")
    private Frequency frequency ;

    @Column(name = "subscription")
    private int subscription;

    @Column(name = "dividend")
    private int dividend;

    @Column(name = "method")
    private String method = "";

    @Column(name = "efees")
    private int efees;

    @Column(name = "paymentfrequency")
    private String paymentfrequency = "";

    @Column(name = "noofguaranters")
    private int noofguaranters;

    @Column(name = "joiningdocs")
    private String joiningdocs = "";

    @Column(name = "prizeclaimdocs")
    private String prizeclaimdocs = "";

    @Column(name = "rollid")
    private int rollid;

    @Column(name = "start")
    private String startDate = "";

    @Column(name = "end")
    private String endDate = "";

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;

}


