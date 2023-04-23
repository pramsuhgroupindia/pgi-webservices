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
@Table(name = "HBCustomerDetails")
public class HBCustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first")
    private String first;

    @Column(name = "middle")
    private String middle;

    @Column(name = "last")
    private String last;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "aadhar_number")
    private String aadharNumber;

    @Column(name = "pan_number")
    private String panNumber;

    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;

    @Column(name = "message")
    private String message;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
