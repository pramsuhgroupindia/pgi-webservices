package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/weekly")
public class WeeklyAuctionableDurationController {
    @Autowired
    WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository;

    @GetMapping
    public List<WeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return weeklyAuctionableDurationsRepository.findAll();
    }
}
