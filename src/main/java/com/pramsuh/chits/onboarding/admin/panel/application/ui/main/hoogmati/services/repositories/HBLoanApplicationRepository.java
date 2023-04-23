package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBLoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBLoanApplicationRepository extends JpaRepository<HBLoanApplication, Long> {
    HBLoanApplication findProfileByAadhar(String aadhar);

    HBLoanApplication findProfileByNumber(int number);
}