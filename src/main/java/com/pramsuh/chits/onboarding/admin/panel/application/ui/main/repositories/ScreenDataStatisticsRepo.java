package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.ScreenDataStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenDataStatisticsRepo extends JpaRepository<ScreenDataStatistics, Long> {
}
