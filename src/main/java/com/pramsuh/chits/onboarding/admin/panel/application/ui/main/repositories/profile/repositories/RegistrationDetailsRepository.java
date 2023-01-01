package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface RegistrationDetailsRepository extends JpaRepository<RegistrationDetails, Long> {
      Optional<RegistrationDetails> findProfileByMobileNumber(String mobile_number);
}