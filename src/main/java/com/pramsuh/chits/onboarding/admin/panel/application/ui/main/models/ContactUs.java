package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "contactus")
public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "address")
    private String address;

    @Column(name = "type")
    private String type;

    @Column(name = "number1")
    private String number1;

    @Column(name = "number2")
    private String number2;

    @Column(name = "email1")
    private String email1;

    @Column(name = "email2")
    private String email2;

    @Column(name = "hours")
    private String hours;

    @Column(name = "dir1")
    private String dir1;

    @Column(name = "dir2")
    private String dir2;

    @Column(name = "pin")
    private String pin;

    @Column(name="website")
    private String website;



}
