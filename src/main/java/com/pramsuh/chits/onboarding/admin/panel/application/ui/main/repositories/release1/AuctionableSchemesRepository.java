package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.AuctionableSchemes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionableSchemesRepository extends JpaRepository<AuctionableSchemes, Long> {
}