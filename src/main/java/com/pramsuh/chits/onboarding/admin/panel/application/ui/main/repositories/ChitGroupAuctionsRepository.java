package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ChitGroupAuctions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChitGroupAuctionsRepository extends JpaRepository<ChitGroupAuctions, Long> {
    List<ChitGroupAuctions> findAllAuctionEntriesByCode(String code);


}