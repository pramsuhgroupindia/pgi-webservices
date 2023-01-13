package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "dailydurations")
public class DailyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "d10")
    private String d10;

    @Column(name = "d15")
    private String d15;

    @Column(name = "d20")
    private String d20;

    @Column(name = "d25")
    private String d25;

    @Column(name = "d30")
    private String d30;

    @Column(name = "d40")
    private String d40;

    @Column(name = "d50")
    private String d50;

    @Column(name = "d60")
    private String d60;

    @Column(name = "d70")
    private String d70;

    @Column(name = "d80")
    private String d80;

    @Column(name = "d90")
    private String d90;

    @Column(name = "d100")
    private String d100;

    @Column(name = "d110")
    private String d110;

    @Column(name = "d120")
    private String d120;

    @Column(name = "d130")
    private String d130;

    @Column(name = "d140")
    private String d140;

    @Column(name = "d150")
    private String d150;

    @Column(name = "d160")
    private String d160;

    @Column(name = "d170")
    private String d170;

    @Column(name = "d180")
    private String d180;

    @Column(name = "d190")
    private String d190;

    @Column(name = "d200")
    private String d200;

    @Column(name = "d210")
    private String d210;

    @Column(name = "d220")
    private String d220;

    @Column(name = "d230")
    private String d230;

    @Column(name = "d240")
    private String d240;

    @Column(name = "d250")
    private String d250;

    @Column(name = "d260")
    private String d260;

    @Column(name = "d270")
    private String d270;

    @Column(name = "d280")
    private String d280;

    @Column(name = "d290")
    private String d290;

    @Column(name = "d300")
    private String d300;

}
