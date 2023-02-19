package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/daily/amounts")
public class DailyChitGroupsController {
    @Autowired
    DailyChitGroupsRepository dailyChitGroupsRepository;

//    @GetMapping("{duration}")
//    public List<DailyChitGroups> getAllSelectedDailySchemeDurationAmountGroups(@PathVariable String duration) {
//        return dailyChitGroupsRepository.findAllChitGroupsByDuration(duration);
//    }

    @GetMapping("{code}")
    public DailyChitGroups getSelectedDailySchemeDurationAmountGroup(@PathVariable String code) {
        return dailyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<DailyChitGroups> getAllDailySchemeDurationAmountGroups() {
        return dailyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createDailyChitGroup(@RequestBody DailyChitGroups dailyChitGroups){
        dailyChitGroups.setNow(LocalDateTime.now());
        if(dailyChitGroupsRepository.findChitGroupByCode(dailyChitGroups.getCode()) == null) {
            DailyChitGroups dailyChitGroups1 = dailyChitGroupsRepository.save(dailyChitGroups);
            if(dailyChitGroups1 != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
        } else {
            return ResponseEntity.ok("ALREADY GROUP CREATED WITH SAME CODE");
        }
    }
}
