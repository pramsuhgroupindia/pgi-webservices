package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "t15")
    private String t15;

    @Column(name = "t20")
    private String t20;

    @Column(name = "t25")
    private String t25;

    @Column(name = "t30")
    private String t30;

    @Column(name = "t40")
    private String t40;

    @Column(name = "t50")
    private String t50;

    @Column(name = "t60")
    private String t60;

    @Column(name = "t70")
    private String t70;

    @Column(name = "t80")
    private String t80;

    @Column(name = "t90")
    private String t90;

    @Column(name = "t100")
    private String t100;


}
