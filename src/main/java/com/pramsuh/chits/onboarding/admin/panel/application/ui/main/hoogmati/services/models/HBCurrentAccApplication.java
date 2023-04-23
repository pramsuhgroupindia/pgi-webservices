package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "HBCurrentAccApplication")
public class HBCurrentAccApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "now")
    private LocalDateTime now;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "number")
    private int number;

    @Column(name = "gendor")
    private String gendor;


    @Column(name = "first")
    private String first;


    @Column(name = "middle")
    private String middle;


    @Column(name = "last")
    private String last;


    @Column(name = "pemail")
    private String pemail;


    @Column(name = "oemail")
    private String oemail;


    @Column(name = "mobile")
    private String mobile;


    @Column(name = "aadhar")
    private String aadhar;


    @Column(name = "pan")
    private String pan;
}