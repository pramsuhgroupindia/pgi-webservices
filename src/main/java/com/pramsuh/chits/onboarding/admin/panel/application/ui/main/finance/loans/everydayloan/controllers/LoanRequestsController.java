package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanProductsAmounts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanRequests;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories.LoanRequestsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.EnrollRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/micro/finance/web/services/loan/products/amounts/requests")
public class LoanRequestsController {
    @Autowired
    LoanRequestsRepository loanRequestsRepository;

    @PostMapping
    public ResponseEntity<LoanRequests> createLoanProductRequest(@RequestBody LoanRequests loanRequests){
        loanRequests.setNow(LocalDateTime.now());
        LoanRequests req = loanRequestsRepository.save(loanRequests);
        return new ResponseEntity<LoanRequests>(req, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<LoanRequests>> getAllLoanProductRequests() {
        return new ResponseEntity<List<LoanRequests>>(loanRequestsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{loanNumber}")
    public ResponseEntity<LoanRequests> getLoanProductRequestByLoanNumber(@PathVariable int loanNumber) {
        return new ResponseEntity<LoanRequests>(loanRequestsRepository.findLoanProductRequestsByLoanNumber(loanNumber), HttpStatus.OK);
    }

//    @GetMapping("{aadharNumber}")
//    public ResponseEntity<LoanRequests> getLoanProductRequestByAadharNumber(@PathVariable String aadhar_Number) {
//        return new ResponseEntity<LoanRequests>(loanRequestsRepository.findLoanProductRequestsByAadhar_Number(aadhar_Number), HttpStatus.OK);
//    }

//    @GetMapping("/all")
//    public ResponseEntity<List<LoanRequests>> getAllLoanRequestsAadharWise(@RequestParam String aadhar_number) {
//        return new ResponseEntity<List<LoanRequests>>(loanRequestsRepository.findAllLoanRequestsByAadharNumber(aadhar_number));
//    }

    @PutMapping
    public ResponseEntity<LoanRequests> updateLoanProductsRequest(@RequestBody LoanRequests loanRequests){
        int loanRequestNumber = loanRequests.getLoanRequestNumber();
        LoanRequests loanRequest1 = loanRequestsRepository.findLoanProductRequestsByloanRequestNumber(loanRequestNumber);
        loanRequest1.setLoanNumber(loanRequests.getLoanNumber());
        loanRequest1.setLoanRequestNumber(loanRequests.getLoanRequestNumber());
        loanRequest1.setDurationInDays(loanRequests.getLoanNumber());
        loanRequest1.setFrequency(loanRequests.getFrequency());
        loanRequest1.setLoanAmount(loanRequests.getLoanAmount());
        loanRequest1.setPrincipleAmount(loanRequests.getPrincipleAmount());
        loanRequest1.setInterestAmount(loanRequests.getInterestAmount());
        loanRequest1.setTotalAmount(loanRequests.getTotalAmount());
        loanRequest1.setPerDayAmount(loanRequests.getPerDayAmount());
        loanRequest1.setNow(loanRequests.getNow());
        loanRequest1.setUpdated(loanRequests.getUpdated());
        loanRequest1.setDateOfRequest(loanRequests.getDateOfRequest());
        return new ResponseEntity<LoanRequests>(loanRequestsRepository.save(loanRequest1), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteLoanProductRequestByLoanNumber(@RequestBody LoanRequests loanRequests){
        int loanRequestsNumber = loanRequests.getLoanRequestNumber();
        loanRequestsRepository.delete(loanRequests);
        return new ResponseEntity<String>("Deleted Loan Request# "+loanRequestsNumber+" Successfully...", HttpStatus.OK);
    }
}
