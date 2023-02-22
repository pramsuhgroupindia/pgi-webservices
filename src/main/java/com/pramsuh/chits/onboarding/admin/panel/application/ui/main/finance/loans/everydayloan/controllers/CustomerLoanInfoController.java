package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.CustomerLoanInfo;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories.CustomerLoanInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/micro/finance/web/services/loan/products/amounts/customer/info")
public class CustomerLoanInfoController {
    @Autowired
    CustomerLoanInfoRepository customerLoanInfoRepository;

    @PostMapping
    public ResponseEntity<CustomerLoanInfo> createCustomerLoanInfo(@RequestBody CustomerLoanInfo customerLoanInfo){
        customerLoanInfo.setNow(LocalDateTime.now());
        CustomerLoanInfo info = customerLoanInfoRepository.save(customerLoanInfo);
        return new ResponseEntity<CustomerLoanInfo>(info, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerLoanInfo>> getAllInfo() {
        return new ResponseEntity<List<CustomerLoanInfo>>(customerLoanInfoRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{loanNumber}")
    public ResponseEntity<CustomerLoanInfo> getInfoByLoanNumber(@PathVariable int loanNumber) {
        return new ResponseEntity<CustomerLoanInfo>(customerLoanInfoRepository.findInfoByLoanNumber(loanNumber), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<CustomerLoanInfo> updateLoanProduct(@RequestBody CustomerLoanInfo customerLoanInfo){
        int loanNumber = customerLoanInfo.getLoanNumber();
        CustomerLoanInfo info = customerLoanInfoRepository.findInfoByLoanNumber(loanNumber);
        info.setLoanNumber(customerLoanInfo.getLoanNumber());
        info.setDurationInDays(customerLoanInfo.getLoanNumber());
        info.setFrequency(customerLoanInfo.getFrequency());
        info.setLoanAmount(customerLoanInfo.getLoanAmount());
        info.setPrincipleAmount(customerLoanInfo.getPrincipleAmount());
        info.setInterestAmount(customerLoanInfo.getInterestAmount());
        info.setTotalAmount(customerLoanInfo.getTotalAmount());
        info.setPerDayAmount(customerLoanInfo.getPerDayAmount());
        info.setUpdated(customerLoanInfo.getUpdated());
        return new ResponseEntity<CustomerLoanInfo>(customerLoanInfoRepository.save(info), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteLoanInfoByLoanNumber(@RequestBody CustomerLoanInfo customerLoanInfo){
        int loanNumber = customerLoanInfo.getLoanNumber();
        customerLoanInfoRepository.delete(customerLoanInfo);
        return new ResponseEntity<String>("DELETED "+loanNumber+" SUCCESSFULLY...", HttpStatus.OK);
    }
}
