package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiWeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/biweekly")
public class BiWeeklyAuctionableDurationController {
    @Autowired
    BiWeeklyAuctionableDurationsRepository biWeeklyAuctionableDurationsRepository;

    @GetMapping
    public List<BiWeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return biWeeklyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createBiWeeklyChitDurationsList(@RequestBody BiWeeklyAuctionableDurations biWeeklyAuctionableDurations){
        biWeeklyAuctionableDurations.setNow(LocalDateTime.now());
        if(null != biWeeklyAuctionableDurationsRepository.save(biWeeklyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
