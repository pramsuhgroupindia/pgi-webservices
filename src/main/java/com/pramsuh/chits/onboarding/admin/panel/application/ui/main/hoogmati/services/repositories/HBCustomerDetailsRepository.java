package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBCustomerDetailsRepository extends JpaRepository<HBCustomerDetails, Long> {
    HBCustomerDetails findProfileByAadharNumber(String aadharNumber);
}