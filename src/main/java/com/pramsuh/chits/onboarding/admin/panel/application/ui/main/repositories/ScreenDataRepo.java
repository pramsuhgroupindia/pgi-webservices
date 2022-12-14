package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.ScreenData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenDataRepo extends JpaRepository<ScreenData, Long> {
}
