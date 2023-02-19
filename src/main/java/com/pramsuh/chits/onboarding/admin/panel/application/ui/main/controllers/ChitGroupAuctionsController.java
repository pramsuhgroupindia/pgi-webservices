package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ChitGroupAuctions;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.ChitGroupAuctionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/schemes/auctions/entries")
public class ChitGroupAuctionsController {
    @Autowired
    ChitGroupAuctionsRepository chitGroupAuctionsRepository;

    @GetMapping
    public ResponseEntity<List<ChitGroupAuctions>> findAllEntriesByCode(@RequestParam String code) {
        return new ResponseEntity<List<ChitGroupAuctions>>(chitGroupAuctionsRepository.findAllAuctionEntriesByCode(code), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createAuctionsEntry(@RequestBody ChitGroupAuctions chitGroupAuction) {
        chitGroupAuction.setNow(LocalDateTime.now());
        ChitGroupAuctions entry = chitGroupAuctionsRepository.save(chitGroupAuction);
        if(entry == null){
            return ResponseEntity.ok("ERROR");
        }
        return ResponseEntity.ok("SUCCESS");
    }
}
