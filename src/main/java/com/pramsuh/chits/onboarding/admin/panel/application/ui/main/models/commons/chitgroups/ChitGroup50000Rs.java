package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.SubData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ChitGroup50000Rs")
public class ChitGroup50000Rs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private SubData mSubData;
}


