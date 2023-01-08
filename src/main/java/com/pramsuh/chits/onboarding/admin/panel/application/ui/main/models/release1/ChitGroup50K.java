package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "50K")
public class ChitGroup50K {
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

    @Column(name = "weeks")
    private String weeks = "";

    @Column(name = "day")
    private String day = "";

    @Column(name = "noauction")
    private String noauction = "";

    @Column(name = "dueday")
    private String dueday = "";

    @Column(name = "distribution")
    private String distribution = "";

}


