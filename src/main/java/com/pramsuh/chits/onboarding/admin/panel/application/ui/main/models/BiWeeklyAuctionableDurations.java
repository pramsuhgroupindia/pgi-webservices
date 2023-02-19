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
@Table(name = "biweeklydurations")
public class BiWeeklyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bw10")
    private String bw10;

    @Column(name = "bw10toggle")
    private String bw10toggle;

    @Column(name = "bw15")
    private String bw15;

    @Column(name = "bw15toggle")
    private String bw15toggle;

    @Column(name = "bw20")
    private String bw20;

    @Column(name = "bw20toggle")
    private String bw20toggle;

    @Column(name = "bw25")
    private String bw25;

    @Column(name = "bw25toggle")
    private String bw25toggle;

    @Column(name = "bw30")
    private String bw30;

    @Column(name = "bw30toggle")
    private String bw30toggle;

    @Column(name = "bw40")
    private String bw40;

    @Column(name = "bw40toggle")
    private String bw40toggle;

    @Column(name = "bw50")
    private String bw50;

    @Column(name = "bw50toggle")
    private String bw50toggle;

    @Column(name = "bw60")
    private String bw60;

    @Column(name = "bw60toggle")
    private String bw60toggle;

    @Column(name = "bw70")
    private String bw70;

    @Column(name = "bw70toggle")
    private String bw70toggle;

    @Column(name = "bw80")
    private String bw80;

    @Column(name = "bw80toggle")
    private String bw80toggle;

    @Column(name = "bw90")
    private String bw90;

    @Column(name = "bw90toggle")
    private String bw90toggle;

    @Column(name = "bw100")
    private String bw100;

    @Column(name = "bw100dtoggle")
    private String bw100toggle;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
