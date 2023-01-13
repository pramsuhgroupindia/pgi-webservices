package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeeklyAuctionableDurationsRepository extends JpaRepository<TeeklyAuctionableDurations, Long> {

}