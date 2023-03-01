package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.Frequency;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.PrizeDeliveryStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "chitgroupauctions")
public class ChitGroupAuctions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "branch")
    private int branch;
    @Column(name = "auction#")
    private int auctionNumber;

    @Column(name = "winner")
    private String winner;
    @Column(name = "code")
    private String code;

    @Column(name = "date")
    private Date date;

    @Column(name = "nadate")
    private Date naDate;

    @Column(name = "time")
    private long time;

    @Column(name = "netprize")
    private int netPrize;

    @Column(name = "bid")
    private int bid;

    @Column(name = "dividend")
    private int div;

    @Column(name = "nextinstallment")
    private int nextInstallment;


    @Column(name = "status")
    private PrizeDeliveryStatus status;

    @Column(name = "deliverydate")
    private Date prizeDate;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "mBookingStatus")
    private int mBookingStatus;

    @Column(name = "frequency")
    private Frequency frequency ;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}