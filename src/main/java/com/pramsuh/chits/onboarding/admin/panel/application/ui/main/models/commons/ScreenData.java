package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "screendata")
public class ScreenData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private ScreenDataStatistics screenDataStatistics;
    @OneToOne(cascade = CascadeType.ALL)
    private Screen screen;
    @Column(name = "mData")
    private String mData = "";

}
