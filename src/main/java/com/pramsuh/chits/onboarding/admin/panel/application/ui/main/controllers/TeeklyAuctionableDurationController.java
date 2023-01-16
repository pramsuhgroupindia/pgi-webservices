package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.TeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/teekly")
public class TeeklyAuctionableDurationController {
    @Autowired
    TeeklyAuctionableDurationsRepository teeklyAuctionableDurationsRepository;

    @GetMapping
    public List<TeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return teeklyAuctionableDurationsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createTeeklyChitDurationsList(@RequestBody TeeklyAuctionableDurations teeklyAuctionableDurations){
        if(null != teeklyAuctionableDurationsRepository.save(teeklyAuctionableDurations)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
