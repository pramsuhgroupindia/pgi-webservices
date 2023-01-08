package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup50K;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1.ChitGroup50KRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/weekly/chitgroup50k")
public class ChitGroup50kController {
    @Autowired
    ChitGroup50KRepository chitGroup50KRepository;

    @GetMapping
    public List<ChitGroup50K> getAllSelectedSchemeDurationAmountGroups() {
        return chitGroup50KRepository.findAll();
    }
}
