package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/daily")
public class DailyAuctionableDurationController {
    @Autowired
    DailyAuctionableDurationsRepository dailyAuctionableDurationsRepository;

    @GetMapping
    public List<DailyAuctionableDurations> getAllSelectedSchemeDurations() {
        return dailyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createDailyChitDurationsList(@RequestBody DailyAuctionableDurations dailyAuctionableDurations){
       dailyAuctionableDurations.setNow(LocalDateTime.now());
        if(null != dailyAuctionableDurationsRepository.save(dailyAuctionableDurations)){
           return ResponseEntity.ok("SUCCESS");
       }
        return ResponseEntity.ok("FAILURE");
    }
}
