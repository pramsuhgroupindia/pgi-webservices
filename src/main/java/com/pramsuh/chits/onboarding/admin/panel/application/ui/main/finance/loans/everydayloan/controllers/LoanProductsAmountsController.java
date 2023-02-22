package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanProductsAmounts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories.LoanProductsAmountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/micro/finance/web/services/loan/products/amounts")
public class LoanProductsAmountsController {
    @Autowired
    LoanProductsAmountsRepository loanProductsAmountsRepository;

    @PostMapping
    public ResponseEntity<LoanProductsAmounts> createLoanProduct(@RequestBody LoanProductsAmounts loanProductsAmounts){
        loanProductsAmounts.setNow(LocalDateTime.now());
        LoanProductsAmounts product = loanProductsAmountsRepository.save(loanProductsAmounts);
        return new ResponseEntity<LoanProductsAmounts>(product, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<LoanProductsAmounts>> getAllLoanProducts() {
        return new ResponseEntity<List<LoanProductsAmounts>>(loanProductsAmountsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{loanNumber}")
    public ResponseEntity<LoanProductsAmounts> getLoanProductByLoanNumber(@PathVariable int loanNumber) {
        return new ResponseEntity<LoanProductsAmounts>(loanProductsAmountsRepository.findLoanProductByLoanNumber(loanNumber), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<LoanProductsAmounts> updateLoanProduct(@RequestBody LoanProductsAmounts loanProductsAmounts){
        int loanNumber = loanProductsAmounts.getLoanNumber();
        LoanProductsAmounts loanProductsAmounts1 = loanProductsAmountsRepository.findLoanProductByLoanNumber(loanNumber);
        loanProductsAmounts1.setLoanNumber(loanProductsAmounts.getLoanNumber());
        loanProductsAmounts1.setDurationInDays(loanProductsAmounts.getLoanNumber());
        loanProductsAmounts1.setFrequency(loanProductsAmounts.getFrequency());
        loanProductsAmounts1.setLoanAmount(loanProductsAmounts.getLoanAmount());
        loanProductsAmounts1.setPrincipleAmount(loanProductsAmounts.getPrincipleAmount());
        loanProductsAmounts1.setInterestAmount(loanProductsAmounts.getInterestAmount());
        loanProductsAmounts1.setTotalAmount(loanProductsAmounts.getTotalAmount());
        loanProductsAmounts1.setPerDayAmount(loanProductsAmounts.getPerDayAmount());
        loanProductsAmounts1.setUpdated(loanProductsAmounts.getUpdated());
        return new ResponseEntity<LoanProductsAmounts>(loanProductsAmountsRepository.save(loanProductsAmounts1), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteLoanProductByLoanNumber(@RequestBody LoanProductsAmounts loanProductsAmounts){
        int loanNumber = loanProductsAmounts.getLoanNumber();
        loanProductsAmountsRepository.delete(loanProductsAmounts);
        return new ResponseEntity<String>("DELETED "+loanNumber+" SUCCESSFULLY...", HttpStatus.OK);
    }
}
