package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1;

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

    @Column(name = "e2d")
    private String e2d;

    @Column(name = "e7d")
    private String e7d;

    @Column(name = "e10d")
    private String e10d;

    @Column(name = "e14d")
    private String e14d;

    @Column(name = "e30d")
    private String e30d;


}
