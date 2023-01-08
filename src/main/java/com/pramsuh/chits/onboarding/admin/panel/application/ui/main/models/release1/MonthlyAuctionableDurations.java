package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "monthlydurations")
public class MonthlyAuctionableDurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "m10")
    private String m10;

    @Column(name = "m12")
    private String m12;

    @Column(name = "m15")
    private String m15;

    @Column(name = "m20")
    private String m20;

    @Column(name = "m25")
    private String m25;

    @Column(name = "m30")
    private String m30;

    @Column(name = "m35")
    private String m35;

    @Column(name = "m40")
    private String m40;

    @Column(name = "m45")
    private String m45;

    @Column(name = "m50")
    private String m50;

}
