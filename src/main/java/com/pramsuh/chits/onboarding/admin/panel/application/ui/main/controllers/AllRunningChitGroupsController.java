package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllOpenedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllRunningChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllRunningChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/running")
public class AllRunningChitGroupsController {
    @Autowired
    AllRunningChitGroupsRepository allRunningChitGroupsRepository;

    @PostMapping
    public ResponseEntity<AllRunningChitGroups> createRunningChitGroup(@RequestBody AllRunningChitGroups allRunningChitGroups){
        allRunningChitGroups.setNow(LocalDateTime.now());
        AllRunningChitGroups group = allRunningChitGroupsRepository.save(allRunningChitGroups);
        return new ResponseEntity<AllRunningChitGroups>(group, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AllRunningChitGroups>> getAllRunningGroups() {
        return new ResponseEntity<List<AllRunningChitGroups>>(allRunningChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllRunningChitGroups> getRunningChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllRunningChitGroups>(allRunningChitGroupsRepository.findRunningChitGroupByCode(code), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<AllRunningChitGroups> updateRunningChitGroup(@RequestBody AllRunningChitGroups updatedObject){
        String code = updatedObject.getCode();
        AllRunningChitGroups newObject = allRunningChitGroupsRepository.findRunningChitGroupByCode(updatedObject.getCode());
        newObject.setMTitle(updatedObject.getMTitle());
        newObject.setMVisibility(updatedObject.isMVisibility());
        newObject.setMTotalNumberOfTickets(updatedObject.getMTotalNumberOfTickets());
        newObject.setMTotalNumberOfAvailableTickets(updatedObject.getMTotalNumberOfAvailableTickets());
        newObject.setMTotalNumberOfBookedTickets(updatedObject.getMTotalNumberOfBookedTickets());
        newObject.setMTotalNumberOfVacantTickets(updatedObject.getMTotalNumberOfVacantTickets());
        newObject.setMTotalNumberOfAuctions(updatedObject.getMTotalNumberOfAuctions());
        newObject.setMTotalNumberOfAgreementsSigned(updatedObject.getMTotalNumberOfAgreementsSigned());
        newObject.setMTotalNumberOfTicketsSold(updatedObject.getMTotalNumberOfTicketsSold());
        newObject.setMBookingStatus(updatedObject.getMBookingStatus());
        newObject.setMinBidRange(updatedObject.getMinBidRange());
        newObject.setMaxBidRange(updatedObject.getMaxBidRange());
        newObject.setMinPrizeRange(updatedObject.getMinPrizeRange());
        newObject.setMaxPrizeRange(updatedObject.getMaxPrizeRange());
        newObject.setCode(updatedObject.getCode());
        newObject.setNumberOfTickets(updatedObject.getNumberOfTickets());
        newObject.setAmount(updatedObject.getAmount());
        newObject.setValue(updatedObject.getValue());
        newObject.setDuration(updatedObject.getDuration());
        newObject.setTime(updatedObject.getTime());
        newObject.setTotalinstallmentsnumber(updatedObject.getTotalinstallmentsnumber());
        newObject.setDay(updatedObject.getDay());
        newObject.setNoauction(updatedObject.getNoauction());
        newObject.setDueday(updatedObject.getDueday());
        newObject.setDistribution(updatedObject.getDistribution());
        newObject.setFrequency(updatedObject.getFrequency());
        newObject.setSubscription(updatedObject.getSubscription());
        newObject.setDividend(updatedObject.getDividend());
        newObject.setMethod(updatedObject.getMethod());
        newObject.setEfees(updatedObject.getEfees());
        newObject.setPaymentfrequency(updatedObject.getPaymentfrequency());
        newObject.setNoofguaranters(updatedObject.getNoofguaranters());
        newObject.setJoiningdocs(updatedObject.getJoiningdocs());
        newObject.setPrizeclaimdocs(updatedObject.getPrizeclaimdocs());
        newObject.setRollid(updatedObject.getRollid());
        return new ResponseEntity<AllRunningChitGroups>(allRunningChitGroupsRepository.save(newObject), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteRunningChitGroup(@RequestBody AllRunningChitGroups objectToDelete){
        String code = objectToDelete.getCode();
        allRunningChitGroupsRepository.delete(objectToDelete);
        return new ResponseEntity<String>("DELETED "+code+" SUCCESSFULLY...", HttpStatus.OK);
    }

}
