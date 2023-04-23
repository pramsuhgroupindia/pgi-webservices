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
@Table(name = "HBCustomerDatabaseFile")
public class HBCustomerDatabaseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "aadhar")
    private String aadhar;
    @Column(name = "fileName", columnDefinition = "LONGTEXT")
    private String fileName;
    @Column(name = "fileType", columnDefinition = "LONGTEXT")
    private String fileType;

    @Column(name = "fileUrl", columnDefinition = "LONGTEXT")
    private String fileDownloadUri;
    @Column(name = "size")
    private long size;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name="updated")
    private LocalDateTime updated;
}
