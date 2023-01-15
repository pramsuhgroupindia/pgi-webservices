package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "smsinbox")
public class SMSInbox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "custName")
    private String custName;
    @Column(name = "mobNumber")
    private String mobNumber;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "address")
    private String address;

    @Column(name = "message")
    private String message;

    @Column(name = "readstate")
    private String readstate;

    @Column(name = "time")
    private String time;

    @Column(name = "foldername")
    private String foldername;

    @Column(name = "customerName")
    private String customerName;
    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "aadharNumber")
    private String aadharNumber;
}
