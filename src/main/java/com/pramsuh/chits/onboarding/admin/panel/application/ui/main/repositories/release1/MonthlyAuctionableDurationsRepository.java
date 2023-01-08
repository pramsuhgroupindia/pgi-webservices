package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.MonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.WeeklyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyAuctionableDurationsRepository extends JpaRepository<MonthlyAuctionableDurations, Long> {
}