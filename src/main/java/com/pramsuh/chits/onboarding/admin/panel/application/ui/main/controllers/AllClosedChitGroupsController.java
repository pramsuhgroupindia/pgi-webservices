package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllClosedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllClosedChitGroupsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllOpenedChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/closed")
public class AllClosedChitGroupsController {
    @Autowired
    AllClosedChitGroupsRepository allClosedChitGroupsRepository;

    @GetMapping("/all")
    public ResponseEntity<List<AllClosedChitGroups>> getAllClosedGroups() {
        return new ResponseEntity<List<AllClosedChitGroups>>(allClosedChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllClosedChitGroups> getClosedChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllClosedChitGroups>(allClosedChitGroupsRepository.findClosedChitGroupByCode(code), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AllClosedChitGroups> createClosedChitGroup(@RequestBody AllClosedChitGroups allClosedChitGroups){
        AllClosedChitGroups group = allClosedChitGroupsRepository.save(allClosedChitGroups);
        return new ResponseEntity<AllClosedChitGroups>(group, HttpStatus.OK);
    }
}
