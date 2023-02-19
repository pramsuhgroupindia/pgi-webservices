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
@Table(name = "bidailydurations")
public class BiDailyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bd10")
    private String bd10;

    @Column(name = "bd10dtoggle")
    private String bd10dtoggle;

    @Column(name = "bd15")
    private String bd15;

    @Column(name = "bd15dtoggle")
    private String bd15dtoggle;

    @Column(name = "bd20")
    private String bd20;

    @Column(name = "bd20dtoggle")
    private String bd20dtoggle;

    @Column(name = "bd25")
    private String bd25;

    @Column(name = "bd25dtoggle")
    private String bd25dtoggle;

    @Column(name = "bd30")
    private String bd30;

    @Column(name = "bd30dtoggle")
    private String bd30dtoggle;

    @Column(name = "bd40")
    private String bd40;

    @Column(name = "bd40dtoggle")
    private String bd40dtoggle;

    @Column(name = "bd50")
    private String bd50;

    @Column(name = "bd50dtoggle")
    private String bd50dtoggle;

    @Column(name = "bd60")
    private String bd60;

    @Column(name = "bd60dtoggle")
    private String bd60dtoggle;

    @Column(name = "bd70")
    private String bd70;

    @Column(name = "bd70dtoggle")
    private String bd70dtoggle;

    @Column(name = "bd80")
    private String bd80;

    @Column(name = "bd80dtoggle")
    private String bd80dtoggle;

    @Column(name = "bd90")
    private String bd90;

    @Column(name = "bd90dtoggle")
    private String bd90dtoggle;

    @Column(name = "bd100")
    private String bd100;

    @Column(name = "bd100dtoggle")
    private String bd100dtoggle;

    @Column(name = "bd150")
    private String bd150;

    @Column(name = "bd150dtoggle")
    private String bd150dtoggle;

    @Column(name = "bd200")
    private String bd200;

    @Column(name = "bd200dtoggle")
    private String bd200dtoggle;

    @Column(name = "bd250")
    private String bd250;

    @Column(name = "bd250dtoggle")
    private String bd250dtoggle;

    @Column(name = "bd300")
    private String bd300;

    @Column(name = "bd300dtoggle")
    private String bd300dtoggle;

    @Column(name = "bd400")
    private String bd400;

    @Column(name = "bd400dtoggle")
    private String bd400dtoggle;

    @Column(name = "bd500")
    private String bd500;

    @Column(name = "bd500dtoggle")
    private String bd500dtoggle;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
