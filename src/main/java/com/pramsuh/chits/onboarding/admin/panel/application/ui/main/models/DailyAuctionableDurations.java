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

    @Column(name = "d10dtoggle")
    private String d10dtoggle;

    @Column(name = "d15")
    private String d15;

    @Column(name = "d15dtoggle")
    private String d15dtoggle;

    @Column(name = "d20")
    private String d20;

    @Column(name = "d20dtoggle")
    private String d20dtoggle;

    @Column(name = "d25")
    private String d25;

    @Column(name = "d25dtoggle")
    private String d25dtoggle;

    @Column(name = "d30")
    private String d30;

    @Column(name = "d30dtoggle")
    private String d30dtoggle;

    @Column(name = "d40")
    private String d40;

    @Column(name = "d40dtoggle")
    private String d40dtoggle;

    @Column(name = "d50")
    private String d50;

    @Column(name = "d50dtoggle")
    private String d50dtoggle;

    @Column(name = "d60")
    private String d60;

    @Column(name = "d60dtoggle")
    private String d60dtoggle;

    @Column(name = "d70")
    private String d70;

    @Column(name = "d70dtoggle")
    private String d70dtoggle;

    @Column(name = "d80")
    private String d80;

    @Column(name = "d80dtoggle")
    private String d80dtoggle;

    @Column(name = "d90")
    private String d90;

    @Column(name = "d90dtoggle")
    private String d90dtoggle;

    @Column(name = "d100")
    private String d100;

    @Column(name = "d100dtoggle")
    private String d100dtoggle;

    @Column(name = "d150")
    private String d150;

    @Column(name = "d150dtoggle")
    private String d150dtoggle;

    @Column(name = "d200")
    private String d200;

    @Column(name = "d200dtoggle")
    private String d200dtoggle;

    @Column(name = "d250")
    private String d250;

    @Column(name = "d250dtoggle")
    private String d250dtoggle;

    @Column(name = "d300")
    private String d300;

    @Column(name = "d300dtoggle")
    private String d300dtoggle;

    @Column(name = "d400")
    private String d400;

    @Column(name = "d400dtoggle")
    private String d400dtoggle;

    @Column(name = "d500")
    private String d500;

    @Column(name = "d500dtoggle")
    private String d500dtoggle;

}
