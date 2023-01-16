package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiDailyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/bidaily/amounts")
public class BiDailyChitGroupsController {
    @Autowired
    BiDailyChitGroupsRepository biDailyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<BiDailyChitGroups> getAllSelectedBiDailySchemeDurationAmountGroups(@PathVariable String duration) {
        return biDailyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public BiDailyChitGroups getSelectedBiDailySchemeDurationAmountGroup(@PathVariable String code) {
        return biDailyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<BiDailyChitGroups> getAllBiDailySchemeDurationAmountGroups() {
        return biDailyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createBiDailyChitGroup(@RequestBody BiDailyChitGroups biDailyChitGroups){
        if(biDailyChitGroupsRepository.findChitGroupByCode(biDailyChitGroups.getCode()) == null) {
            BiDailyChitGroups biDailyChitGroups1 = biDailyChitGroupsRepository.save(biDailyChitGroups);
            if(biDailyChitGroups1 != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
        } else {
            return ResponseEntity.ok("ALREADY GROUP CREATED WITH SAME CODE");
        }
    }
}
