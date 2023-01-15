package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.TeeklyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/teekly/amounts")
public class TeeklyChitGroupsController {
    @Autowired
    TeeklyChitGroupsRepository teeklyChitGroupsRepository;

    @GetMapping("{duration}")
    public List<TeeklyChitGroups> getAllSelectedTeeklySchemeDurationAmountGroups(@PathVariable String duration) {
        return teeklyChitGroupsRepository.findAllChitGroupsByDuration(duration);
    }

    @GetMapping("{code}")
    public TeeklyChitGroups getSelectedTeeklySchemeDurationAmountGroup(@PathVariable String code) {
        return teeklyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<TeeklyChitGroups> getAllTeeklySchemeDurationAmountGroups() {
        return teeklyChitGroupsRepository.findAll();
    }
}
