package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "bw15")
    private String bw15;

    @Column(name = "bw20")
    private String bw20;

    @Column(name = "bw25")
    private String bw25;

    @Column(name = "bw30")
    private String bw30;

    @Column(name = "bw40")
    private String bw40;

    @Column(name = "bw50")
    private String bw50;

    @Column(name = "bw60")
    private String bw60;

    @Column(name = "bw70")
    private String bw70;

    @Column(name = "bw80")
    private String bw80;

    @Column(name = "bw90")
    private String bw90;

    @Column(name = "bw100")
    private String bw100;


}
