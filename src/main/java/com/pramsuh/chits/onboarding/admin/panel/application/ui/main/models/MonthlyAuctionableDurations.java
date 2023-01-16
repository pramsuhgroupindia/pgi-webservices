package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

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

    @Column(name = "m10dtoggle")
    private String m10dtoggle;

    @Column(name = "m12")
    private String m12;

    @Column(name = "m12dtoggle")
    private String m12dtoggle;

    @Column(name = "m15")
    private String m15;

    @Column(name = "m15dtoggle")
    private String m15dtoggle;

    @Column(name = "m20")
    private String m20;

    @Column(name = "m20dtoggle")
    private String m20dtoggle;

    @Column(name = "m25")
    private String m25;

    @Column(name = "m25dtoggle")
    private String m25dtoggle;

    @Column(name = "m30")
    private String m30;

    @Column(name = "m30dtoggle")
    private String m30dtoggle;

    @Column(name = "m35")
    private String m35;

    @Column(name = "m35dtoggle")
    private String m35dtoggle;

    @Column(name = "m40")
    private String m40;

    @Column(name = "m40dtoggle")
    private String m40dtoggle;

    @Column(name = "m45")
    private String m45;

    @Column(name = "m45dtoggle")
    private String m45dtoggle;

    @Column(name = "m50")
    private String m50;

    @Column(name = "m50dtoggle")
    private String m50dtoggle;

}
