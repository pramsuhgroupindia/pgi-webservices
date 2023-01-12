package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/weekly/amounts")
public class WeeklyChitGroupsController {
    @Autowired
    WeeklyChitGroupsRepository weeklyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<WeeklyChitGroups> getAllSelectedWeeklySchemeDurationAmountGroups(@PathVariable String duration) {
        return weeklyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public WeeklyChitGroups getSelectedWeeklySchemeDurationAmountGroup(@PathVariable String code) {
        return weeklyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<WeeklyChitGroups> getAllWeeklySchemeDurationAmountGroups() {
        return weeklyChitGroupsRepository.findAll();
    }
}