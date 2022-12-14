package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.Screen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenRepo extends JpaRepository<Screen, Long> {
}
