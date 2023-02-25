package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "subschitgroupreadings")
public class SubscriberChitGroupReadings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "code")
    private String code;

    @Column(name = "value")
    private String value;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "number")
    private int rownum;

    @Column(name = "psinstallment")
    private int psinstallment;

    @Column(name = "npsinstallment")
    private int npsinstallment;
    @Column(name = "prize")
    private int prize;

    @Column(name = "totaldividend")
    private int totaldDividend;

    @Column(name = "singledividend")
    private int singleDDividend;

    @Column(name = "ticketnumber")
    private int ticketnumber;

    @Column(name="now")
    private LocalDateTime now;

    @Column(name = "mBookingStatus")
    private BookingStatus mBookingStatus;
    @Column(name="updated")
    private LocalDateTime updated;

}
