package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCurrentAccApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSavingsAccApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBCurrentAccApplicationRepository extends JpaRepository<HBCurrentAccApplication, Long> {
    HBCurrentAccApplication findRecordByAadhar(String aadhar);
    HBCurrentAccApplication findRecordByNumber(int number);

}