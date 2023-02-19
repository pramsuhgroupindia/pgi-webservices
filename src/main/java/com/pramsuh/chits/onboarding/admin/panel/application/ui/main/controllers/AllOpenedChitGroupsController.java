package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllClosedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllOpenedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllOpenedChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/groups/opened")
public class AllOpenedChitGroupsController {
    @Autowired
    AllOpenedChitGroupsRepository allOpenedChitGroupsRepository;

    @PostMapping
    public ResponseEntity<AllOpenedChitGroups> createOpenedChitGroup(@RequestBody AllOpenedChitGroups allOpenedChitGroups){
        allOpenedChitGroups.setNow(LocalDateTime.now());
        AllOpenedChitGroups group = allOpenedChitGroupsRepository.save(allOpenedChitGroups);
        return new ResponseEntity<AllOpenedChitGroups>(group, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AllOpenedChitGroups>> getAllOpenedGroups() {
        return new ResponseEntity<List<AllOpenedChitGroups>>(allOpenedChitGroupsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    public ResponseEntity<AllOpenedChitGroups> getOpenedChitGroupByCode(@PathVariable String code) {
        return new ResponseEntity<AllOpenedChitGroups>(allOpenedChitGroupsRepository.findOpenChitGroupByCode(code), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<AllOpenedChitGroups> updateOpenedChitGroup(@RequestBody AllOpenedChitGroups updatedObject){
        String code = updatedObject.getCode();
        AllOpenedChitGroups newObject = allOpenedChitGroupsRepository.findOpenChitGroupByCode(updatedObject.getCode());
        newObject.setMTitle(updatedObject.getMTitle());
        newObject.setMVisibility(updatedObject.getMVisibility());
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
        return new ResponseEntity<AllOpenedChitGroups>(allOpenedChitGroupsRepository.save(newObject), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteOpenedChitGroup(@RequestBody AllOpenedChitGroups objectToDelete){
        String code = objectToDelete.getCode();
        allOpenedChitGroupsRepository.delete(objectToDelete);
        return new ResponseEntity<String>("DELETED "+code+" SUCCESSFULLY...", HttpStatus.OK);
    }

}
