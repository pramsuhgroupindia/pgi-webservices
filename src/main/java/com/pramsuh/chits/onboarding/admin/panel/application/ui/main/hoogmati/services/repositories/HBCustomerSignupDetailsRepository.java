package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSignupDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HBCustomerSignupDetailsRepository extends JpaRepository<HBSignupDetails, Long> {
    Optional<HBSignupDetails> findProfileByAadharNumber(String aadharNumber);
}