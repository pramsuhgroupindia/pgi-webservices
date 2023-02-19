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
@Table(name = "teeklydurations")
public class TeeklyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "t10")
    private String t10;
    @Column(name = "t10dtoggle")
    private String t10dtoggle;

    @Column(name = "t15")
    private String t15;
    @Column(name = "t15dtoggle")
    private String t15dtoggle;

    @Column(name = "t20")
    private String t20;
    @Column(name = "t20dtoggle")
    private String t20dtoggle;

    @Column(name = "t25")
    private String t25;
    @Column(name = "t25dtoggle")
    private String t25dtoggle;

    @Column(name = "t30")
    private String t30;
    @Column(name = "t30dtoggle")
    private String t30dtoggle;

    @Column(name = "t40")
    private String t40;
    @Column(name = "t40dtoggle")
    private String t40dtoggle;

    @Column(name = "t50")
    private String t50;
    @Column(name = "t50dtoggle")
    private String t50dtoggle;

    @Column(name = "t60")
    private String t60;
    @Column(name = "t60dtoggle")
    private String t60dtoggle;

    @Column(name = "t70")
    private String t70;
    @Column(name = "t70dtoggle")
    private String t70dtoggle;

    @Column(name = "t80")
    private String t80;
    @Column(name = "t80dtoggle")
    private String t80dtoggle;

    @Column(name = "t90")
    private String t90;
    @Column(name = "t90dtoggle")
    private String t90dtoggle;

    @Column(name = "t100")
    private String t100;
    @Column(name = "t100dtoggle")
    private String t100dtoggle;

    @Column(name = "t110")
    private String t110;
    @Column(name = "t110dtoggle")
    private String t110dtoggle;

    @Column(name = "t120")
    private String t120;
    @Column(name = "t120dtoggle")
    private String t120dtoggle;

    @Column(name = "t130")
    private String t130;
    @Column(name = "t130dtoggle")
    private String t130dtoggle;

    @Column(name = "t140")
    private String t140;
    @Column(name = "t140dtoggle")
    private String t140dtoggle;

    @Column(name = "t1150")
    private String t150;
    @Column(name = "t150dtoggle")
    private String t150dtoggle;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
