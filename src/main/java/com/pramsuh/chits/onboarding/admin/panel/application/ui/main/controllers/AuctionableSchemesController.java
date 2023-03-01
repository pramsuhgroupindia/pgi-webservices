package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

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
        object.setUpdated(object.getNow());
        return new ResponseEntity<AuctionableSchemes>(auctionableSchemesRepository.save(object), HttpStatus.OK);
    }

    @GetMapping
    public List<AuctionableSchemes> getAllSchemes() {
        return auctionableSchemesRepository.findAll();
    }

//    @PutMapping
//    public ResponseEntity<AuctionableSchemes> updateScheme(@RequestBody AuctionableSchemes newObject){
//        AuctionableSchemes scheme = new AuctionableSchemes();
//        scheme.setTitle(newObject.getTitle());
//        scheme.setToggle(newObject.isToggle());
//
//        return new ResponseEntity<AuctionableSchemes>(auctionableSchemesRepository.save(scheme), HttpStatus.OK);
//    }

    @DeleteMapping
    public ResponseEntity<String> deleteScheme(@RequestBody AuctionableSchemes objectToDelete){
        auctionableSchemesRepository.delete(objectToDelete);
        return new ResponseEntity<String>("DELETED SUCCESSFULLY...", HttpStatus.OK);
    }
}
