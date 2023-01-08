package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.MemberDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberDetailsRepository extends JpaRepository<MemberDetails, Long> {
    Optional<MemberDetails> findProfileByAadharNumber(String aadharNumber);
}