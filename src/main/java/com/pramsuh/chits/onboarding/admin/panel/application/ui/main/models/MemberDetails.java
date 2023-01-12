package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "member_details")
public class MemberDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "occupation")
    private String occupation;
    @Column(name = "address")
    private String address;

    @Column(name = "aadhar_number")
    private String aadharNumber;

    @Column(name = "pan_number")
    private String panNumber;

    @Column(name = "aadhar_card")
    private String aadharCard;

    @Column(name = "pan_card")
    private String panCard;

    @Column(name = "address_card")
    private String addressCard;

    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;

    @Column(name = "message")
    private String message;

    @Column(name = "nominee_full_name")
    private String nomineeFullName;

    @Column(name = "nominee_age")
    private String nomineeAge;

    @Column(name = "nominee_address")
    private String nomineeAddress;

    @Column(name = "nominee_aadhar_number")
    private String nomineeAadharNumber;

    @Column(name = "nominee_pan_number")
    private String nomineePanNumber;

    @Column(name = "nominee_mob_number")
    private String nomineeMobNumber;

    @Column(name = "nominee_occupation")
    private String nomineeOccupation;

    @Column(name = "nominee_relation")
    private String nomineeRelation;

}
