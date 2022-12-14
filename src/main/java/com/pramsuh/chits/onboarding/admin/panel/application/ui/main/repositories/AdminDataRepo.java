package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.AdminData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDataRepo extends JpaRepository<AdminData, Long> {
}
