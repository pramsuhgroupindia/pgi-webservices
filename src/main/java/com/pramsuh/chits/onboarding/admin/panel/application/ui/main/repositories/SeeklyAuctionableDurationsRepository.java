package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.FeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SeeklyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeeklyAuctionableDurationsRepository extends JpaRepository<SeeklyAuctionableDurations, Long> {
}