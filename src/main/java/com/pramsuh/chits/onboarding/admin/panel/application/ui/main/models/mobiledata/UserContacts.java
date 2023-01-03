package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_contacts")
public class UserContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "userNumber")
    private String userNumber;

    @Column(name = "userName")
    private String userName;

    @Column(name = "message")
    private String message;

    @Column(name = "aadharNumber")
    private String aadharNumber;
}
