package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiDailyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/bidaily")
public class BiDailyAuctionableDurationController {
    @Autowired
    BiDailyAuctionableDurationsRepository biDailyAuctionableDurationsRepository;

    @PostMapping
    public ResponseEntity<String> createBiDailyChitDurationsList(@RequestBody BiDailyAuctionableDurations biDailyAuctionableDurations){
       biDailyAuctionableDurations.setNow(LocalDateTime.now());
        biDailyAuctionableDurations.setUpdated(biDailyAuctionableDurations.getNow());
        if(null != biDailyAuctionableDurationsRepository.save(biDailyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }

    @GetMapping
    public List<BiDailyAuctionableDurations> getAllSelectedSchemeDurations() {
        return biDailyAuctionableDurationsRepository.findAll();
    }


}
