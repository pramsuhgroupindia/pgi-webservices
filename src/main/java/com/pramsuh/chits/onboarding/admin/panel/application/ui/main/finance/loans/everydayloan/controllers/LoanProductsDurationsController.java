package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanProductsDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories.LoanProductsDurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/micro/finance/web/services/loan/products/durations")
public class LoanProductsDurationsController {
    @Autowired
    LoanProductsDurationsRepository loanProductsDurationsRepository;

    @PostMapping
    public ResponseEntity<LoanProductsDurations> createLoanProductDuration(@RequestBody LoanProductsDurations loanProductsDurations){
        loanProductsDurations.setNow(LocalDateTime.now());
        LoanProductsDurations duration = loanProductsDurationsRepository.save(loanProductsDurations);
        return new ResponseEntity<LoanProductsDurations>(duration, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<LoanProductsDurations>> getAllLoanProductsDurations() {
        return new ResponseEntity<List<LoanProductsDurations>>(loanProductsDurationsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{durationInDays}")
    public ResponseEntity<LoanProductsDurations> getLoanProductByDurationInDays(@PathVariable int durationInDays) {
        return new ResponseEntity<LoanProductsDurations>(loanProductsDurationsRepository.findLoanProductDurationByDurationInDays(durationInDays), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<LoanProductsDurations> updateLoanProductDuration(@RequestBody LoanProductsDurations loanProductsDurations){
        int durationInDays = loanProductsDurations.getDurationInDays();
        LoanProductsDurations loanProductsDurations1 = loanProductsDurationsRepository.findLoanProductDurationByDurationInDays(durationInDays);
        loanProductsDurations1.setDurationInDays(loanProductsDurations.getDurationInDays());
        loanProductsDurations1.setToggle(loanProductsDurations.isToggle());
        loanProductsDurations1.setFrequency(loanProductsDurations.getFrequency());
        loanProductsDurations1.setUpdated(loanProductsDurations.getUpdated());
        return new ResponseEntity<LoanProductsDurations>(loanProductsDurationsRepository.save(loanProductsDurations1), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteLoanProductsDurationByDurationInDays(@RequestBody LoanProductsDurations loanProductsDurations){
        int durationInDays = loanProductsDurations.getDurationInDays();
        loanProductsDurationsRepository.delete(loanProductsDurations);
        return new ResponseEntity<String>("DELETED "+durationInDays+" Loan Product Duration Successfully...", HttpStatus.OK);
    }
}
