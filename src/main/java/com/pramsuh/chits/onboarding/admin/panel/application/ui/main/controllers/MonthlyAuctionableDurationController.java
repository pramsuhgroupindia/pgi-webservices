package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<String> createMonthlyChitDurationsList(@RequestBody MonthlyAuctionableDurations monthlyAuctionableDurations){
        if(null != monthlyAuctionableDurationsRepository.save(monthlyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
