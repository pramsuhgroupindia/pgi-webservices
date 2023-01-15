package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AuctionableSchemes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionableSchemesRepository extends JpaRepository<AuctionableSchemes, Long> {
}