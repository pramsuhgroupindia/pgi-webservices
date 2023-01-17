package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NeoBankMemberRepository extends JpaRepository<NeoBankMember, Long> {
    Optional<NeoBankMember> findProfileByMobileNumber(String mobileNumber);
}