package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyAuctionableDurationsRepository extends JpaRepository<WeeklyAuctionableDurations, Long> {
}