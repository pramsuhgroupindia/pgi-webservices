package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerSignInData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBCustomerSignInDataRepository extends JpaRepository<HBCustomerSignInData, Long> {
}