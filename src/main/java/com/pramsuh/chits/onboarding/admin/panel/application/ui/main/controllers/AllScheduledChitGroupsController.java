package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllScheduledChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllScheduledChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/scheduled")
public class AllScheduledChitGroupsController {
    @Autowired
    AllScheduledChitGroupsRepository allScheduledChitGroupsRepository;

    @GetMapping("/all")
    public ResponseEntity<List<AllScheduledChitGroups>> getAllScheduledGroups() {
        return new ResponseEntity<List<AllScheduledChitGroups>>(allScheduledChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllScheduledChitGroups> getScheduledChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllScheduledChitGroups>(allScheduledChitGroupsRepository.findScheduledChitGroupByCode(code), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AllScheduledChitGroups> createScheduledChitGroup(@RequestBody AllScheduledChitGroups allOpenChitGroups){
        AllScheduledChitGroups group = allScheduledChitGroupsRepository.save(allOpenChitGroups);
        return new ResponseEntity<AllScheduledChitGroups>(group, HttpStatus.OK);
    }
}
