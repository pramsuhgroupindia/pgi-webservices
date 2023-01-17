package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/weekly")
public class WeeklyAuctionableDurationController {
    @Autowired
    WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository;

    @GetMapping
    public List<WeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return weeklyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createWeeklyChitDurationsList(@RequestBody WeeklyAuctionableDurations weeklyAuctionableDurations){
        if(null != weeklyAuctionableDurationsRepository.save(weeklyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
