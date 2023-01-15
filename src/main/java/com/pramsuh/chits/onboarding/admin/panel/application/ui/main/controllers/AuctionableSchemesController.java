package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AuctionableSchemes;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AuctionableSchemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes")
public class AuctionableSchemesController {
    @Autowired
    AuctionableSchemesRepository auctionableSchemesRepository;

    @GetMapping
    public List<AuctionableSchemes> getAllSchemes() {
        return auctionableSchemesRepository.findAll();
    }


}
