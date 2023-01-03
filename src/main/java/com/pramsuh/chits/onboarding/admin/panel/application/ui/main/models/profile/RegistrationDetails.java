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
    @Column(name = "fullName")
    private String fullName;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "occupation")
    private String occupation;
    @Column(name = "address")
    private String address;

    @Column(name = "aadharNumber")
    private String aadharNumber;

    @Column(name = "panNumber")
    private String panNumber;

    @Column(name = "aadharCard")
    private String aadharCard;

    @Column(name = "panCard")
    private String panCard;

    @Column(name = "addressCard")
    private String addressCard;

    @Column(name = "password")
    private String password;
    @Column(name = "confirmPassword")
    private String confirmPassword;

    @Column(name = "message")
    private String message;

    @Column(name = "nomineeFullName")
    private String nomineeFullName;

    @Column(name = "nomineeAge")
    private String nomineeAge;

    @Column(name = "nomineeAddress")
    private String nomineeAddress;

    @Column(name = "nomineeAadharNumber")
    private String nomineeAadharNumber;

    @Column(name = "nomineePanNumber")
    private String nomineePanNumber;

    @Column(name = "nomineeMobNumber")
    private String nomineeMobNumber;

    @Column(name = "nomineeOccupation")
    private String nomineeOccupation;

    @Column(name = "nomineeRelation")
    private String nomineeRelation;

}
