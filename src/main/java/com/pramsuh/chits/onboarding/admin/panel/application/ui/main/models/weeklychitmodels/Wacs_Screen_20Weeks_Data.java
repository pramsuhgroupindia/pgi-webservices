package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.SubData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups.ChitGroup40000Rs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups.ChitGroup50000Rs;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Wacs_Screen_20Weeks_Data")
public class Wacs_Screen_20Weeks_Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private SubData mSubData;

    @OneToOne(cascade = CascadeType.ALL)
    private ChitGroup50000Rs mChitGroup50000Rs;

}

