package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "w15")
    private String w15;

    @Column(name = "w20")
    private String w20;

    @Column(name = "w25")
    private String w25;

    @Column(name = "w30")
    private String w30;

    @Column(name = "w40")
    private String w40;

    @Column(name = "w50")
    private String w50;

    @Column(name = "w60")
    private String w60;

    @Column(name = "w70")
    private String w70;

    @Column(name = "w80")
    private String w80;

    @Column(name = "w90")
    private String w90;

    @Column(name = "w100")
    private String w100;


}
