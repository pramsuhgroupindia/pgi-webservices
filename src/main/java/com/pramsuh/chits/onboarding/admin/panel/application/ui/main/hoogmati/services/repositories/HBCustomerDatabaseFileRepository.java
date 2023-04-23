package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HBCustomerDatabaseFileRepository extends JpaRepository<HBCustomerDatabaseFile, Long> {
    List<HBCustomerDatabaseFile> findAllFilesByAadhar(String aadhar);
}