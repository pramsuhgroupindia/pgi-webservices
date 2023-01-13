package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiWeeklyChitGroupsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/biweekly/amounts")
public class BiWeeklyChitGroupsController {
    @Autowired
    BiWeeklyChitGroupsRepository biWeeklyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<BiWeeklyChitGroups> getAllSelectedBiWeeklySchemeDurationAmountGroups(@PathVariable String duration) {
        return biWeeklyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public BiWeeklyChitGroups getSelectedBiWeeklySchemeDurationAmountGroup(@PathVariable String code) {
        return biWeeklyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<BiWeeklyChitGroups> getAllBiWeeklySchemeDurationAmountGroups() {
        return biWeeklyChitGroupsRepository.findAll();
    }
}
