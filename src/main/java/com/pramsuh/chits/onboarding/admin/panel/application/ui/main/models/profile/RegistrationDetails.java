package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer_details")
public class RegistrationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "address")
    private String address;

    @Column(name = "aadharNumber")
    private String aadharNumber;

    @Column(name = "panNumber")
    private String panNumber;

    @Column(name = "aadharCardPhoto")
    private String aadharCardPhoto;

    @Column(name = "panCardPhoto")
    private String panCardPhoto;

    @Column(name = "addressPhoto")
    private String addressPhoto;

    @Column(name = "password")
    private String password;
    @Column(name = "confirmPassword")
    private String confirmPassword;


}
