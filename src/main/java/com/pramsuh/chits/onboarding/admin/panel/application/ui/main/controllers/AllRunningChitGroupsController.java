package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllRunningChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllRunningChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/running")
public class AllRunningChitGroupsController {
    @Autowired
    AllRunningChitGroupsRepository allRunningChitGroupsRepository;


    @GetMapping("/all")
    public ResponseEntity<List<AllRunningChitGroups>> getAllRunningGroups() {
        return new ResponseEntity<List<AllRunningChitGroups>>(allRunningChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllRunningChitGroups> getRunningChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllRunningChitGroups>(allRunningChitGroupsRepository.findRunningChitGroupByCode(code), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AllRunningChitGroups> createRunningChitGroup(@RequestBody AllRunningChitGroups allRunningChitGroups){
        AllRunningChitGroups group = allRunningChitGroupsRepository.save(allRunningChitGroups);
        return new ResponseEntity<AllRunningChitGroups>(group, HttpStatus.OK);
    }
}
