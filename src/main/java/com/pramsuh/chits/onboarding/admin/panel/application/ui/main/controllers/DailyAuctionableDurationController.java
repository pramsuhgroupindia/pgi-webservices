package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/daily")
public class DailyAuctionableDurationController {
    @Autowired
    DailyAuctionableDurationsRepository dailyAuctionableDurationsRepository;

    @GetMapping
    public List<DailyAuctionableDurations> getAllSelectedSchemeDurations() {
        return dailyAuctionableDurationsRepository.findAll();
    }
}
