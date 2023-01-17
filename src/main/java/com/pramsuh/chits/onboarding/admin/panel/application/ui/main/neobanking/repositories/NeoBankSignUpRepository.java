package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankSignUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NeoBankSignUpRepository extends JpaRepository<NeoBankSignUp, Long> {
    Optional<NeoBankSignUp> findProfileByMobileNumber(String mobileNumber);
}