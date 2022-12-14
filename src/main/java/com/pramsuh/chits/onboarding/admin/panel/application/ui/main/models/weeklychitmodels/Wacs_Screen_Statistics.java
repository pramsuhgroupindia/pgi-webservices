package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Wacs_Screen_Statistics")
public class Wacs_Screen_Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "mTitle")
    private String mTitle;
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

}
