package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/daily/amounts")
public class DailyChitGroupsController {
    @Autowired
    DailyChitGroupsRepository dailyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<DailyChitGroups> getAllSelectedDailySchemeDurationAmountGroups(@PathVariable String duration) {
        return dailyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public DailyChitGroups getSelectedDailySchemeDurationAmountGroup(@PathVariable String code) {
        return dailyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<DailyChitGroups> getAllDailySchemeDurationAmountGroups() {
        return dailyChitGroupsRepository.findAll();
    }
}
