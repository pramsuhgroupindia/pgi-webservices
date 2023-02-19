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
@Table(name = "weeklydurations")
public class WeeklyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "w10")
    private String w10;

    @Column(name = "w10dtoggle")
    private String w10dtoggle;

    @Column(name = "w15")
    private String w15;

    @Column(name = "w15dtoggle")
    private String w15dtoggle;

    @Column(name = "w20")
    private String w20;

    @Column(name = "w20dtoggle")
    private String w20dtoggle;

    @Column(name = "w25")
    private String w25;

    @Column(name = "w25dtoggle")
    private String w25dtoggle;

    @Column(name = "w30")
    private String w30;

    @Column(name = "w30dtoggle")
    private String w30dtoggle;

    @Column(name = "w40")
    private String w40;

    @Column(name = "w40dtoggle")
    private String w40dtoggle;

    @Column(name = "w50")
    private String w50;

    @Column(name = "w50dtoggle")
    private String w50dtoggle;

    @Column(name = "w60")
    private String w60;

    @Column(name = "w60dtoggle")
    private String w60dtoggle;

    @Column(name = "w70")
    private String w70;

    @Column(name = "w70dtoggle")
    private String w70dtoggle;

    @Column(name = "w80")
    private String w80;

    @Column(name = "w80dtoggle")
    private String w80dtoggle;

    @Column(name = "w90")
    private String w90;

    @Column(name = "w90dtoggle")
    private String w90dtoggle;

    @Column(name = "w100")
    private String w100;

    @Column(name = "w100dtoggle")
    private String w100dtoggle;

    @Column(name = "w120")
    private String w120;

    @Column(name = "w120dtoggle")
    private String w120dtoggle;

    @Column(name = "w140")
    private String w140;

    @Column(name = "w140dtoggle")
    private String w140dtoggle;

    @Column(name = "w160")
    private String w160;

    @Column(name = "w160dtoggle")
    private String w160dtoggle;

    @Column(name = "w180")
    private String w180;

    @Column(name = "w180dtoggle")
    private String w180dtoggle;

    @Column(name = "w200")
    private String w200;

    @Column(name = "w200dtoggle")
    private String w200dtoggle;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
