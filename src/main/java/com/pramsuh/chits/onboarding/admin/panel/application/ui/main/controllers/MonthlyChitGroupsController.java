package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/monthly/amounts")
public class MonthlyChitGroupsController {
    @Autowired
    MonthlyChitGroupsRepository monthlyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<MonthlyChitGroups> getAllSelectedMonthlySchemeDurationAmountGroups(@PathVariable String duration) {
        return monthlyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public MonthlyChitGroups getSelectedMonthlySchemeDurationAmountGroup(@PathVariable String code) {
        return monthlyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<MonthlyChitGroups> getAllMonthlySchemeDurationAmountGroups() {
        return monthlyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createMonthlyChitGroup(@RequestBody MonthlyChitGroups monthlyChitGroups){
        if(monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups.getCode()) == null) {
            MonthlyChitGroups monthlyChitGroups1 = monthlyChitGroupsRepository.save(monthlyChitGroups);
            if(monthlyChitGroups1 != null) {
                return ResponseEntity.ok("SUCCESS");
            } else{
                return ResponseEntity.ok("FAILURE");
            }
        } else {
            return ResponseEntity.ok("ALREADY GROUP CREATED WITH SAME CODE");
        }
    }
}
