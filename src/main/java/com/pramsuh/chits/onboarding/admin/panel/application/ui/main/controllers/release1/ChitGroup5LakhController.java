package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup10Lakhs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup5Lakhs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1.ChitGroup5LakhsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/monthly/chitgroup5l")
public class ChitGroup5LakhController {
    @Autowired
    ChitGroup5LakhsRepository chitGroup5LakhsRepository;

    @GetMapping
    public List<ChitGroup5Lakhs> getAllSelectedSchemeDurationAmountGroups() {
        return chitGroup5LakhsRepository.findAll();
    }
}
