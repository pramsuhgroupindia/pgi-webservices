package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bidailydurations")
public class BiDailyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bd10")
    private String bd10;

    @Column(name = "bd15")
    private String bd15;

    @Column(name = "bd20")
    private String bd20;

    @Column(name = "bd25")
    private String bd25;

    @Column(name = "bd30")
    private String bd30;

    @Column(name = "bd40")
    private String bd40;

    @Column(name = "bd50")
    private String bd50;

    @Column(name = "bd60")
    private String bd60;

    @Column(name = "bd70")
    private String bd70;

    @Column(name = "bd80")
    private String bd80;

    @Column(name = "bd90")
    private String bd90;

    @Column(name = "bd100")
    private String bd100;


}
