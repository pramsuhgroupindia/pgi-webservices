package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiDailyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/bidaily")
public class BiDailyAuctionableDurationController {
    @Autowired
    BiDailyAuctionableDurationsRepository biDailyAuctionableDurationsRepository;

    @GetMapping
    public List<BiDailyAuctionableDurations> getAllSelectedSchemeDurations() {
        return biDailyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createBiDailyChitDurationsList(@RequestBody BiDailyAuctionableDurations biDailyAuctionableDurations){
        if(null != biDailyAuctionableDurationsRepository.save(biDailyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
