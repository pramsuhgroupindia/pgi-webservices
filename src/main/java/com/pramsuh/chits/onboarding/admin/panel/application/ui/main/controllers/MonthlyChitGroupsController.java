package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/monthly/amounts")
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
}
