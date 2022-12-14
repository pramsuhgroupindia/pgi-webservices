package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "screendatastatistics")
public class ScreenDataStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title = "";
    @Column(name = "mNumofCatPlanned")
    private String mNumofCatPlanned = "";
    @Column(name = "mNumofCatPublished")
    private String mNumofCatPublished = "";
    @Column(name = "mNumOfCatStarted")
    private String mNumOfCatStarted = "";
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
