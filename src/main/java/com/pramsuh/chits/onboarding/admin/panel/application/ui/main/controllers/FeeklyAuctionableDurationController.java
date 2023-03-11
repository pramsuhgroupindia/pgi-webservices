package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.FeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TriDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.FeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/feekly")
public class FeeklyAuctionableDurationController {
    @Autowired
    FeeklyAuctionableDurationsRepository feeklyAuctionableDurationsRepository
            ;

    @PostMapping
    public ResponseEntity<String> createFeeklyChitDurationsList(@RequestBody FeeklyAuctionableDurations object){
       object.setNow(LocalDateTime.now());
        object.setUpdated(object.getNow());
        if(null != feeklyAuctionableDurationsRepository.save(object)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }

    @GetMapping
    public List<FeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return feeklyAuctionableDurationsRepository.findAll();
    }


}
