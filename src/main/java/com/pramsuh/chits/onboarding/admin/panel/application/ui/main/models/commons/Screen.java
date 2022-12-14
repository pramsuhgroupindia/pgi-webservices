package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.screenmodels.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "screen")
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mScreenTitle")
    private String mScreenTitle = "";

    @OneToOne(cascade = CascadeType.ALL)
    private WACS_SCREEN mWacsScreen;


    @Column(name = "mDacsScreenTitle")
    private String mDacsScreenTitle = "";

    @Column(name = "mBdacsScreenTitle")
    private String mBdacsScreenTitle = "";

    @Column(name = "mTdacsScreenTitle")
    private String mTdacsScreenTitle = "";

    @Column(name = "mWacsScreenTitle")
    private String mWacsScreenTitle = "";

    @Column(name = "mEtdacsScreenTitle")
    private String mEtdacsScreenTitle = "";

    @Column(name = "mMacsScreenTitle")
    private String mMacsScreenTitle = "";

    @Column(name = "mDacsScreenVisibility")
    private String mDacsScreenVisibility = "";

    @Column(name = "mBdacsScreenVisibility")
    private String mBdacsScreenVisibility = "";

    @Column(name = "mTdacsScreenVisibility")
    private String mTdacsScreenVisibility = "";

    @Column(name = "mWacsScreenVisibility")
    private String mWacsScreenVisibility = "";

    @Column(name = "mEtdacsScreenVisibility")
    private String mEtdacsScreenVisibility = "";

    @Column(name = "mMacsScreenVisibility")
    private String mMacsScreenVisibility = "";

}
