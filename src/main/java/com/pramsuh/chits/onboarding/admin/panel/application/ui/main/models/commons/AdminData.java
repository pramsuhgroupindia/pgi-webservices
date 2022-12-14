package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "admindata")
public class AdminData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private ScreenData screenData;
    @Column(name = "data")
    private String mData = "";

}
