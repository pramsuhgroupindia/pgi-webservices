package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSavingsAccApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBSavingsAccApplicationRepository extends JpaRepository<HBSavingsAccApplication, Long> {
    HBSavingsAccApplication findRecordByAadhar(String aadhar);
    HBSavingsAccApplication findRecordByNumber(int number);

}