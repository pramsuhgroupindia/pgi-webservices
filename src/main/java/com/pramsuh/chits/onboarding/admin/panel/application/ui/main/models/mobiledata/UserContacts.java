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

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "mobile_number")
    private String mobile_number;

    @Column(name = "usernumber")
    private String usernumber;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "message")
    private String message;


}
