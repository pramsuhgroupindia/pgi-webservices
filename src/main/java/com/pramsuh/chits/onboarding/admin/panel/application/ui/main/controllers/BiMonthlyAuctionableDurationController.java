package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiMonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiMonthlyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/bimonthly")
public class BiMonthlyAuctionableDurationController {
    @Autowired
    BiMonthlyAuctionableDurationsRepository biMonthlyAuctionableDurationsRepository;

    @GetMapping
    public List<BiMonthlyAuctionableDurations> getAllSelectedSchemeDurations() {
        return biMonthlyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createBiMonthlyChitDurationsList(@RequestBody BiMonthlyAuctionableDurations biMonthlyAuctionableDurations){
        biMonthlyAuctionableDurations.setNow(LocalDateTime.now());
        if(null != biMonthlyAuctionableDurationsRepository.save(biMonthlyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
