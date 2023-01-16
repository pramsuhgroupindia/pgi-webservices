package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "schemes")
public class AuctionableSchemes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "e1d")
    private String e1d;

    @Column(name = "e1dtoggle")
    private String e1dtoggle;

    @Column(name = "e2d")
    private String e2d;

    @Column(name = "e2dtoggle")
    private String e2dtoggle;

    @Column(name = "e7d")
    private String e7d;

    @Column(name = "e7dtoggle")
    private String e7dtoggle;

    @Column(name = "e10d")
    private String e10d;

    @Column(name = "e10dtoggle")
    private String e10dtoggle;

    @Column(name = "e14d")
    private String e14d;

    @Column(name = "e14dtoggle")
    private String e14dtoggle;

    @Column(name = "e30d")
    private String e30d;

    @Column(name = "e30dtoggle")
    private String e30dtoggle;

}
