package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignInData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignInDataRepository extends JpaRepository<SignInData, Long> {
}