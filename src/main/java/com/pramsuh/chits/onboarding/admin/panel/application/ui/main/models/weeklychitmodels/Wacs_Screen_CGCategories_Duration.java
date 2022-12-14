package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Wacs_Screen_CGCategories_Duration")
public class Wacs_Screen_CGCategories_Duration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Wacs_Screen_10Weeks_Data mWacs_Screen_10Weeks_Data;


}
