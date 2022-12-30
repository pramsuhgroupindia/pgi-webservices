package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "files")
@NoArgsConstructor

public class FileDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Lob
    @Column(name = "image")
    private byte[] image;

}
