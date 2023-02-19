package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, Long> {
    List<DatabaseFile> findAllFilesByAadhar(String aadhar);
}