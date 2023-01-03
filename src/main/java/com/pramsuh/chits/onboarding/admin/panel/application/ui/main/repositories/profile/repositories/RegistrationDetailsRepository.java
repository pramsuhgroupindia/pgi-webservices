package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationDetailsRepository extends JpaRepository<RegistrationDetails, Long> {
      Optional<RegistrationDetails> findProfileByaadharNumber(String aadharNumber);
}