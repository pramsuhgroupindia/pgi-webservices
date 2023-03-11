package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TriDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.TriDailyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/tridaily")
public class TriDailyAuctionableDurationController {
    @Autowired
    TriDailyAuctionableDurationsRepository triDailyAuctionableDurationsRepository;

    @PostMapping
    public ResponseEntity<String> createTriDailyChitDurationsList(@RequestBody TriDailyAuctionableDurations object){
       object.setNow(LocalDateTime.now());
        object.setUpdated(object.getNow());
        if(null != triDailyAuctionableDurationsRepository.save(object)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }

    @GetMapping
    public List<TriDailyAuctionableDurations> getAllSelectedSchemeDurations() {
        return triDailyAuctionableDurationsRepository.findAll();
    }


}
