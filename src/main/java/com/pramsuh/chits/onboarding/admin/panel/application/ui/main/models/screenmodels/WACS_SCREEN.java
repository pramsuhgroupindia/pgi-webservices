package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.screenmodels;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_CGCategories;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_Statistics;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "WACS_SCREEN")
public class WACS_SCREEN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "mTitle")
    private String mTitle;
    @OneToOne(cascade = CascadeType.ALL)
    private Wacs_Screen_Statistics mWacs_screen_statistics;
    @OneToOne(cascade = CascadeType.ALL)
    private Wacs_Screen_CGCategories mWacs_screen_cgCategories;
}
