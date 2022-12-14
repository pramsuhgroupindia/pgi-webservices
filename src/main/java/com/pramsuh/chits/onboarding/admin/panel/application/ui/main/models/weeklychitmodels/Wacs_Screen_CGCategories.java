package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels;


import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Wacs_Screen_CGCategories")
public class Wacs_Screen_CGCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Wacs_Screen_CGCategories_Duration mWacs_screen_cgCategories_duration;

}
