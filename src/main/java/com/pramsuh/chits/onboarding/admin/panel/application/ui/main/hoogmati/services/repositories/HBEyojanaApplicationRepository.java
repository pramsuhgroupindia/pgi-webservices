package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBEyojanaApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBEyojanaApplicationRepository extends JpaRepository<HBEyojanaApplication, Long> {
    HBEyojanaApplication findProfileByAadhar(String aadhar);

    HBEyojanaApplication findProfileByNumber(int number);
}