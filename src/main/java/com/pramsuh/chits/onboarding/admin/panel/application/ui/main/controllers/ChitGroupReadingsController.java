package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ChitGroupReadings;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.ChitGroupReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/table")
public class ChitGroupReadingsController {
    @Autowired
    ChitGroupReadingsRepository chitGroupReadingsRepository;

    @GetMapping
    public ResponseEntity<List<ChitGroupReadings>> findAllReadingsByCode(@RequestParam String code) {
        return new ResponseEntity<List<ChitGroupReadings>>(chitGroupReadingsRepository.findAllReadingsByCode(code), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createEnrollmentData(@RequestBody ChitGroupReadings chitGroupReadings) {
        ChitGroupReadings readings = chitGroupReadingsRepository.save(chitGroupReadings);
        if(readings == null){
            return ResponseEntity.ok("ERROR");
        }
        return ResponseEntity.ok("SUCCESS");
    }
}
