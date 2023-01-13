package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyAuctionableDurations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiWeeklyAuctionableDurationsRepository extends JpaRepository<BiWeeklyAuctionableDurations, Long> {

}