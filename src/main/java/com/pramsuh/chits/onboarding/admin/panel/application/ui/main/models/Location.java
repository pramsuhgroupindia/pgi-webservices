package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "customerName")
    private String customerName;
    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "aadharNumber")
    private String aadharNumber;
}
