package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllScheduledChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AuctionableSchemes;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AuctionableSchemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes")
public class AuctionableSchemesController {
    @Autowired
    AuctionableSchemesRepository auctionableSchemesRepository;

    @PostMapping
    public ResponseEntity<AuctionableSchemes> createScheme(@RequestBody AuctionableSchemes object){
        object.setNow(LocalDateTime.now());
        AuctionableSchemes scheme = auctionableSchemesRepository.save(object);
        return new ResponseEntity<AuctionableSchemes>(scheme, HttpStatus.OK);
    }

    @GetMapping
    public List<AuctionableSchemes> getAllSchemes() {
        return auctionableSchemesRepository.findAll();
    }

    @PutMapping
    public ResponseEntity<AuctionableSchemes> updateScheme(@RequestBody AuctionableSchemes newObject){
        AuctionableSchemes scheme = new AuctionableSchemes();
        scheme.setE1d(newObject.getE1d());
        scheme.setE1dtoggle(newObject.getE1dtoggle());
        scheme.setE2d(newObject.getE2d());
        scheme.setE2dtoggle(newObject.getE2dtoggle());
        scheme.setE7d(newObject.getE7d());
        scheme.setE7dtoggle(newObject.getE7dtoggle());
        scheme.setE10d(newObject.getE10d());
        scheme.setE10dtoggle(newObject.getE10dtoggle());
        scheme.setE14d(newObject.getE14d());
        scheme.setE14dtoggle(newObject.getE14dtoggle());
        scheme.setE30d(newObject.getE30d());
        scheme.setE30dtoggle(newObject.getE30dtoggle());
        return new ResponseEntity<AuctionableSchemes>(auctionableSchemesRepository.save(scheme), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteScheme(@RequestBody AuctionableSchemes objectToDelete){
        auctionableSchemesRepository.delete(objectToDelete);
        return new ResponseEntity<String>("DELETED SUCCESSFULLY...", HttpStatus.OK);
    }
}
