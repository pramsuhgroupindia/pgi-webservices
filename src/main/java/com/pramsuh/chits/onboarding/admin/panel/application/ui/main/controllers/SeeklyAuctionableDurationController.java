package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.FeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.FeeklyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.SeeklyAuctionableDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/seekly")
public class SeeklyAuctionableDurationController {
    @Autowired
    SeeklyAuctionableDurationsRepository seeklyAuctionableDurationsRepository
            ;

    @PostMapping
    public ResponseEntity<String> createFeeklyChitDurationsList(@RequestBody SeeklyAuctionableDurations object){
       object.setNow(LocalDateTime.now());
        object.setUpdated(object.getNow());
        if(null != seeklyAuctionableDurationsRepository.save(object)){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }

    @GetMapping
    public List<SeeklyAuctionableDurations> getAllSelectedSchemeDurations() {
        return seeklyAuctionableDurationsRepository.findAll();
    }


}
