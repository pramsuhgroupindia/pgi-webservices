package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyAuctionableDurationsRepository extends JpaRepository<DailyAuctionableDurations, Long> {
}