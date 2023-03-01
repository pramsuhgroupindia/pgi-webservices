package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.Frequency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "schemes")
public class AuctionableSchemes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;

    @Column(name = "frequency")
    private Frequency frequency;

    @Column(name = "toggle")
    private boolean toggle;

    @Column(name = "mBookingStatus")
    private int mBookingStatus;

    @Column(name = "auctionFrequency")
    private String auctionFrequency;

    @Column(name = "paymentFrequency")
    private String paymentFrequency;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
