package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "password")
    private String password;
}
