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
@Table(name = "HBCustomerLocation")
public class HBCustomerLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first")
    private String first;

    @Column(name = "middle")
    private String middle;

    @Column(name = "last")
    private String last;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "aadharNumber")
    private String aadharNumber;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
