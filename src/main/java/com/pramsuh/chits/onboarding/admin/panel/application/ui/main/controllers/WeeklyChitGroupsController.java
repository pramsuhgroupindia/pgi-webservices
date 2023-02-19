package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/weekly/amounts")
public class WeeklyChitGroupsController {
    @Autowired
    WeeklyChitGroupsRepository weeklyChitGroupsRepository;

//    @GetMapping("{duration}")
//    public List<WeeklyChitGroups> getAllSelectedWeeklySchemeDurationAmountGroups(@PathVariable String duration) {
//        return weeklyChitGroupsRepository.findAllChitGroupsByDuration(duration);
//    }

    @GetMapping("{code}")
    public WeeklyChitGroups getSelectedWeeklySchemeDurationAmountGroup(@PathVariable String code) {
        return weeklyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<WeeklyChitGroups> getAllWeeklySchemeDurationAmountGroups() {
        return weeklyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createWeeklyChitGroup(@RequestBody WeeklyChitGroups weeklyChitGroups){
        weeklyChitGroups.setNow(LocalDateTime.now());
        if(weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups.getCode()) == null) {
            WeeklyChitGroups weeklyChitGroups1 = weeklyChitGroupsRepository.save(weeklyChitGroups);
            if(weeklyChitGroups1 != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
        } else {
            return ResponseEntity.ok("ALREADY GROUP CREATED WITH SAME CODE");
        }
    }
}
