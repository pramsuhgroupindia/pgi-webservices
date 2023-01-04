package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignupDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SignupDetailsRepository extends JpaRepository<SignupDetails, Long> {
      Optional<SignupDetails> findProfileByAadharNumber(String aadhar_number);
}