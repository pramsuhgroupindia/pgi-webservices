package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.SubData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Wacs_Screen_10Weeks_Data")
public class Wacs_Screen_10Weeks_Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private SubData mSubData;

    @OneToOne(cascade = CascadeType.ALL)
    private ChitGroup50000Rs mChitGroup50000Rs;

    @OneToOne(cascade = CascadeType.ALL)
    private ChitGroup40000Rs mChitGroup40000Rs;
}

