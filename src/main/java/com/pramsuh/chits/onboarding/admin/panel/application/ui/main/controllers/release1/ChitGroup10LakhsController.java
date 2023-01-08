package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup10Lakhs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup50K;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1.ChitGroup10LakhsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/monthly/chitgroup10l")
public class ChitGroup10LakhsController {
    @Autowired
    ChitGroup10LakhsRepository chitGroup10LakhsRepository;

    @GetMapping
    public List<ChitGroup10Lakhs> getAllSelectedSchemeDurationAmountGroups() {
        return chitGroup10LakhsRepository.findAll();
    }
}
