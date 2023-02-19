package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_contacts")
public class UserContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName", columnDefinition = "LONGTEXT")
    private String firstName;

    @Column(name = "lastName", columnDefinition = "LONGTEXT")
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

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
