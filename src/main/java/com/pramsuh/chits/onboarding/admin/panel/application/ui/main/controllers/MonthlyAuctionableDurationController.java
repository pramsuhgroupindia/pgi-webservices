package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/monthly")
public class MonthlyAuctionableDurationController {
    @Autowired
    MonthlyAuctionableDurationsRepository monthlyAuctionableDurationsRepository;

    @GetMapping
    public List<MonthlyAuctionableDurations> getAllSelectedSchemeDurations() {
        return monthlyAuctionableDurationsRepository.findAll();
    }
}
