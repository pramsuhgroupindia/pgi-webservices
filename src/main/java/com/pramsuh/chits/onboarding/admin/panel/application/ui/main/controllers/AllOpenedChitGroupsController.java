package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllOpenedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllOpenedChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/opened")
public class AllOpenedChitGroupsController {
    @Autowired
    AllOpenedChitGroupsRepository allOpenedChitGroupsRepository;

    @GetMapping("/all")
    public ResponseEntity<List<AllOpenedChitGroups>> getAllOpenedGroups() {
        return new ResponseEntity<List<AllOpenedChitGroups>>(allOpenedChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllOpenedChitGroups> getOpenedChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllOpenedChitGroups>(allOpenedChitGroupsRepository.findOpenChitGroupByCode(code), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<AllOpenedChitGroups> createOpenedChitGroup(@RequestBody AllOpenedChitGroups allOpenedChitGroups){
        AllOpenedChitGroups group = allOpenedChitGroupsRepository.save(allOpenedChitGroups);
        return new ResponseEntity<AllOpenedChitGroups>(group, HttpStatus.OK);
    }
}
