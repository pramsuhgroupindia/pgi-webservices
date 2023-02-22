package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllClosedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllClosedChitGroupsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllOpenedChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/closed")
public class AllClosedChitGroupsController {
    @Autowired
    AllClosedChitGroupsRepository allClosedChitGroupsRepository;

    @PostMapping
    public ResponseEntity<AllClosedChitGroups> createClosedChitGroup(@RequestBody AllClosedChitGroups allClosedChitGroups){
        allClosedChitGroups.setNow(LocalDateTime.now());
        AllClosedChitGroups group = allClosedChitGroupsRepository.save(allClosedChitGroups);
        return new ResponseEntity<AllClosedChitGroups>(group, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AllClosedChitGroups>> getAllClosedGroups() {
        return new ResponseEntity<List<AllClosedChitGroups>>(allClosedChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllClosedChitGroups> getClosedChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllClosedChitGroups>(allClosedChitGroupsRepository.findClosedChitGroupByCode(code), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<AllClosedChitGroups> updateClosedChitGroup(@RequestBody AllClosedChitGroups allClosedChitGroups){
        String code = allClosedChitGroups.getCode();
        AllClosedChitGroups allClosedChitGroups1 = allClosedChitGroupsRepository.findClosedChitGroupByCode(allClosedChitGroups.getCode());
        allClosedChitGroups1.setMTitle(allClosedChitGroups.getMTitle());
        allClosedChitGroups1.setMVisibility(allClosedChitGroups.isMVisibility());
        allClosedChitGroups1.setMTotalNumberOfTickets(allClosedChitGroups.getMTotalNumberOfTickets());
        allClosedChitGroups1.setMTotalNumberOfAvailableTickets(allClosedChitGroups.getMTotalNumberOfAvailableTickets());
        allClosedChitGroups1.setMTotalNumberOfBookedTickets(allClosedChitGroups.getMTotalNumberOfBookedTickets());
        allClosedChitGroups1.setMTotalNumberOfVacantTickets(allClosedChitGroups.getMTotalNumberOfVacantTickets());
        allClosedChitGroups1.setMTotalNumberOfAuctions(allClosedChitGroups.getMTotalNumberOfAuctions());
        allClosedChitGroups1.setMTotalNumberOfAgreementsSigned(allClosedChitGroups.getMTotalNumberOfAgreementsSigned());
        allClosedChitGroups1.setMTotalNumberOfTicketsSold(allClosedChitGroups.getMTotalNumberOfTicketsSold());
        allClosedChitGroups1.setMBookingStatus(allClosedChitGroups.getMBookingStatus());
        allClosedChitGroups1.setMinBidRange(allClosedChitGroups.getMinBidRange());
        allClosedChitGroups1.setMaxBidRange(allClosedChitGroups.getMaxBidRange());
        allClosedChitGroups1.setMinPrizeRange(allClosedChitGroups.getMinPrizeRange());
        allClosedChitGroups1.setMaxPrizeRange(allClosedChitGroups.getMaxPrizeRange());
        allClosedChitGroups1.setCode(allClosedChitGroups.getCode());
        allClosedChitGroups1.setNumberOfTickets(allClosedChitGroups.getNumberOfTickets());
        allClosedChitGroups1.setAmount(allClosedChitGroups.getAmount());
        allClosedChitGroups1.setValue(allClosedChitGroups.getValue());
        allClosedChitGroups1.setDuration(allClosedChitGroups.getDuration());
        allClosedChitGroups1.setTime(allClosedChitGroups.getTime());
        allClosedChitGroups1.setTotalinstallmentsnumber(allClosedChitGroups.getTotalinstallmentsnumber());
        allClosedChitGroups1.setDay(allClosedChitGroups.getDay());
        allClosedChitGroups1.setNoauction(allClosedChitGroups.getNoauction());
        allClosedChitGroups1.setDueday(allClosedChitGroups.getDueday());
        allClosedChitGroups1.setDistribution(allClosedChitGroups.getDistribution());
        allClosedChitGroups1.setFrequency(allClosedChitGroups.getFrequency());
        allClosedChitGroups1.setSubscription(allClosedChitGroups.getSubscription());
        allClosedChitGroups1.setDividend(allClosedChitGroups.getDividend());
        allClosedChitGroups1.setMethod(allClosedChitGroups.getMethod());
        allClosedChitGroups1.setEfees(allClosedChitGroups.getEfees());
        allClosedChitGroups1.setPaymentfrequency(allClosedChitGroups.getPaymentfrequency());
        allClosedChitGroups1.setNoofguaranters(allClosedChitGroups.getNoofguaranters());
        allClosedChitGroups1.setJoiningdocs(allClosedChitGroups.getJoiningdocs());
        allClosedChitGroups1.setPrizeclaimdocs(allClosedChitGroups.getPrizeclaimdocs());
        allClosedChitGroups1.setRollid(allClosedChitGroups.getRollid());
        return new ResponseEntity<AllClosedChitGroups>(allClosedChitGroupsRepository.save(allClosedChitGroups1), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteClosedChitGroup(@RequestBody AllClosedChitGroups allClosedChitGroups){
        String code = allClosedChitGroups.getCode();
        allClosedChitGroupsRepository.delete(allClosedChitGroups);
        return new ResponseEntity<String>("DELETED "+code+" SUCCESSFULLY...", HttpStatus.OK);
    }

}
