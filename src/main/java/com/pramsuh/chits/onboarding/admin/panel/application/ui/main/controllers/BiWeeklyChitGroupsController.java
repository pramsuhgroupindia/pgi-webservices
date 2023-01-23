package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiWeeklyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/biweekly/amounts")
public class BiWeeklyChitGroupsController {
    @Autowired
    BiWeeklyChitGroupsRepository biWeeklyChitGroupsRepository;

//    @GetMapping("{duration}")
//    public List<BiWeeklyChitGroups> getAllSelectedBiWeeklySchemeDurationAmountGroups(@PathVariable String duration) {
//        return biWeeklyChitGroupsRepository.findAllChitGroupsByDuration(duration);
//    }

    @GetMapping("{code}")
    public BiWeeklyChitGroups getSelectedBiWeeklySchemeDurationAmountGroup(@PathVariable String code) {
        return biWeeklyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<BiWeeklyChitGroups> getAllBiWeeklySchemeDurationAmountGroups() {
        return biWeeklyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createBiWeeklyChitGroup(@RequestBody BiWeeklyChitGroups biWeeklyChitGroups){
        if(biWeeklyChitGroupsRepository.findChitGroupByCode(biWeeklyChitGroups.getCode()) == null) {
            BiWeeklyChitGroups biWeeklyChitGroups1 = biWeeklyChitGroupsRepository.save(biWeeklyChitGroups);
            if(biWeeklyChitGroups1 != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
        } else {
            return ResponseEntity.ok("ALREADY GROUP CREATED WITH SAME CODE");
        }
    }
}
