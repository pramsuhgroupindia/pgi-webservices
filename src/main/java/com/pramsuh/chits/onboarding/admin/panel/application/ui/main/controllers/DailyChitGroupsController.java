package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.*;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/daily/amounts")
public class DailyChitGroupsController {
    @Autowired
    DailyChitGroupsRepository dailyChitGroupsRepository;
    @Autowired
    AllScheduledChitGroupsRepository allScheduledChitGroupsRepository;
    @Autowired
    AllOpenedChitGroupsRepository allOpenedChitGroupsRepository;
    @Autowired
    AllRunningChitGroupsRepository allRunningChitGroupsRepository;
    @Autowired
    AllClosedChitGroupsRepository allClosedChitGroupsRepository;
//    @GetMapping("{duration}")
//    public List<DailyChitGroups> getAllSelectedDailySchemeDurationAmountGroups(@PathVariable String duration) {
//        return dailyChitGroupsRepository.findAllChitGroupsByDuration(duration);
//    }

    @GetMapping("{code}")
    public DailyChitGroups getSelectedDailySchemeDurationAmountGroup(@PathVariable String code) {
        return dailyChitGroupsRepository.findChitGroupByCode(code);
    }

    @GetMapping
    public List<DailyChitGroups> getAllDailySchemeDurationAmountGroups() {
        return dailyChitGroupsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<DailyChitGroups> createDailyChitGroup(@RequestBody DailyChitGroups object){
        object.setNow(LocalDateTime.now());
        if(dailyChitGroupsRepository.findChitGroupByCode(object.getCode()) == null) {
            DailyChitGroups dailyChitGroups1 = dailyChitGroupsRepository.save(object);
            if(dailyChitGroups1 != null) {
                switch(object.getMBookingStatus()){
                    case 0:
                        AllScheduledChitGroups allScheduledChitGroups = new AllScheduledChitGroups();
                        allScheduledChitGroups.setMTitle(object.getMTitle());
                        allScheduledChitGroups.setMVisibility(object.isMVisibility());
                        allScheduledChitGroups.setMTotalNumberOfTickets(object.getMTotalNumberOfTickets());
                        allScheduledChitGroups.setMTotalNumberOfAvailableTickets(object.getMTotalNumberOfAvailableTickets());
                        allScheduledChitGroups.setMTotalNumberOfBookedTickets(object.getMTotalNumberOfBookedTickets());
                        allScheduledChitGroups.setMTotalNumberOfVacantTickets(object.getMTotalNumberOfVacantTickets());
                        allScheduledChitGroups.setMTotalNumberOfAuctions(object.getMTotalNumberOfAuctions());
                        allScheduledChitGroups.setMTotalNumberOfAgreementsSigned(object.getMTotalNumberOfAgreementsSigned());
                        allScheduledChitGroups.setMTotalNumberOfTicketsSold(object.getMTotalNumberOfTicketsSold());
                        allScheduledChitGroups.setMBookingStatus(object.getMBookingStatus());
                        allScheduledChitGroups.setMinBidRange(object.getMinBidRange());
                        allScheduledChitGroups.setMaxBidRange(object.getMaxBidRange());
                        allScheduledChitGroups.setMinPrizeRange(object.getMinPrizeRange());
                        allScheduledChitGroups.setMaxPrizeRange(object.getMaxPrizeRange());
                        allScheduledChitGroups.setCode(object.getCode());
                        allScheduledChitGroups.setNumberOfTickets(object.getNumberOfTickets());
                        allScheduledChitGroups.setAmount(object.getAmount());
                        allScheduledChitGroups.setValue(object.getValue());
                        allScheduledChitGroups.setDuration(object.getDuration());
                        allScheduledChitGroups.setTime(object.getTime());
                        allScheduledChitGroups.setTotalinstallmentsnumber(object.getTotalinstallmentsnumber());
                        allScheduledChitGroups.setDay(object.getDay());
                        allScheduledChitGroups.setNoauction(object.getNoauction());
                        allScheduledChitGroups.setDueday(object.getDueday());
                        allScheduledChitGroups.setDistribution(object.getDistribution());
                        allScheduledChitGroups.setFrequency(object.getFrequency());
                        allScheduledChitGroups.setSubscription(object.getSubscription());
                        allScheduledChitGroups.setDividend(object.getDividend());
                        allScheduledChitGroups.setMethod(object.getMethod());
                        allScheduledChitGroups.setEfees(object.getEfees());
                        allScheduledChitGroups.setPaymentfrequency(object.getPaymentfrequency());
                        allScheduledChitGroups.setNoofguaranters(object.getNoofguaranters());
                        allScheduledChitGroups.setJoiningdocs(object.getJoiningdocs());
                        allScheduledChitGroups.setPrizeclaimdocs(object.getPrizeclaimdocs());
                        allScheduledChitGroups.setRollid(object.getRollid());
                        allScheduledChitGroups.setStartDate(object.getStartDate());
                        allScheduledChitGroups.setEndDate(object.getEndDate());
                        allScheduledChitGroups.setNow(LocalDateTime.now());
                        allScheduledChitGroups.setUpdated(allScheduledChitGroups.getNow());
                        allScheduledChitGroupsRepository.save(allScheduledChitGroups);
                        break;
                    case 1:
                        AllOpenedChitGroups allOpenedChitGroups = new AllOpenedChitGroups();
                        allOpenedChitGroups.setMTitle(object.getMTitle());
                        allOpenedChitGroups.setMVisibility(object.isMVisibility());
                        allOpenedChitGroups.setMTotalNumberOfTickets(object.getMTotalNumberOfTickets());
                        allOpenedChitGroups.setMTotalNumberOfAvailableTickets(object.getMTotalNumberOfAvailableTickets());
                        allOpenedChitGroups.setMTotalNumberOfBookedTickets(object.getMTotalNumberOfBookedTickets());
                        allOpenedChitGroups.setMTotalNumberOfVacantTickets(object.getMTotalNumberOfVacantTickets());
                        allOpenedChitGroups.setMTotalNumberOfAuctions(object.getMTotalNumberOfAuctions());
                        allOpenedChitGroups.setMTotalNumberOfAgreementsSigned(object.getMTotalNumberOfAgreementsSigned());
                        allOpenedChitGroups.setMTotalNumberOfTicketsSold(object.getMTotalNumberOfTicketsSold());
                        allOpenedChitGroups.setMBookingStatus(object.getMBookingStatus());
                        allOpenedChitGroups.setMinBidRange(object.getMinBidRange());
                        allOpenedChitGroups.setMaxBidRange(object.getMaxBidRange());
                        allOpenedChitGroups.setMinPrizeRange(object.getMinPrizeRange());
                        allOpenedChitGroups.setMaxPrizeRange(object.getMaxPrizeRange());
                        allOpenedChitGroups.setCode(object.getCode());
                        allOpenedChitGroups.setNumberOfTickets(object.getNumberOfTickets());
                        allOpenedChitGroups.setAmount(object.getAmount());
                        allOpenedChitGroups.setValue(object.getValue());
                        allOpenedChitGroups.setDuration(object.getDuration());
                        allOpenedChitGroups.setTime(object.getTime());
                        allOpenedChitGroups.setTotalinstallmentsnumber(object.getTotalinstallmentsnumber());
                        allOpenedChitGroups.setDay(object.getDay());
                        allOpenedChitGroups.setNoauction(object.getNoauction());
                        allOpenedChitGroups.setDueday(object.getDueday());
                        allOpenedChitGroups.setDistribution(object.getDistribution());
                        allOpenedChitGroups.setFrequency(object.getFrequency());
                        allOpenedChitGroups.setSubscription(object.getSubscription());
                        allOpenedChitGroups.setDividend(object.getDividend());
                        allOpenedChitGroups.setMethod(object.getMethod());
                        allOpenedChitGroups.setEfees(object.getEfees());
                        allOpenedChitGroups.setPaymentfrequency(object.getPaymentfrequency());
                        allOpenedChitGroups.setNoofguaranters(object.getNoofguaranters());
                        allOpenedChitGroups.setJoiningdocs(object.getJoiningdocs());
                        allOpenedChitGroups.setPrizeclaimdocs(object.getPrizeclaimdocs());
                        allOpenedChitGroups.setRollid(object.getRollid());
                        allOpenedChitGroups.setStartDate(object.getStartDate());
                        allOpenedChitGroups.setEndDate(object.getEndDate());
                        allOpenedChitGroups.setNow(LocalDateTime.now());
                        allOpenedChitGroups.setUpdated(allOpenedChitGroups.getNow());
                        allOpenedChitGroupsRepository.save(allOpenedChitGroups);
                        break;
                    case 2:
                        AllRunningChitGroups allRunningChitGroups = new AllRunningChitGroups();
                        allRunningChitGroups.setMTitle(object.getMTitle());
                        allRunningChitGroups.setMVisibility(object.isMVisibility());
                        allRunningChitGroups.setMTotalNumberOfTickets(object.getMTotalNumberOfTickets());
                        allRunningChitGroups.setMTotalNumberOfAvailableTickets(object.getMTotalNumberOfAvailableTickets());
                        allRunningChitGroups.setMTotalNumberOfBookedTickets(object.getMTotalNumberOfBookedTickets());
                        allRunningChitGroups.setMTotalNumberOfVacantTickets(object.getMTotalNumberOfVacantTickets());
                        allRunningChitGroups.setMTotalNumberOfAuctions(object.getMTotalNumberOfAuctions());
                        allRunningChitGroups.setMTotalNumberOfAgreementsSigned(object.getMTotalNumberOfAgreementsSigned());
                        allRunningChitGroups.setMTotalNumberOfTicketsSold(object.getMTotalNumberOfTicketsSold());
                        allRunningChitGroups.setMBookingStatus(object.getMBookingStatus());
                        allRunningChitGroups.setMinBidRange(object.getMinBidRange());
                        allRunningChitGroups.setMaxBidRange(object.getMaxBidRange());
                        allRunningChitGroups.setMinPrizeRange(object.getMinPrizeRange());
                        allRunningChitGroups.setMaxPrizeRange(object.getMaxPrizeRange());
                        allRunningChitGroups.setCode(object.getCode());
                        allRunningChitGroups.setNumberOfTickets(object.getNumberOfTickets());
                        allRunningChitGroups.setAmount(object.getAmount());
                        allRunningChitGroups.setValue(object.getValue());
                        allRunningChitGroups.setDuration(object.getDuration());
                        allRunningChitGroups.setTime(object.getTime());
                        allRunningChitGroups.setTotalinstallmentsnumber(object.getTotalinstallmentsnumber());
                        allRunningChitGroups.setDay(object.getDay());
                        allRunningChitGroups.setNoauction(object.getNoauction());
                        allRunningChitGroups.setDueday(object.getDueday());
                        allRunningChitGroups.setDistribution(object.getDistribution());
                        allRunningChitGroups.setFrequency(object.getFrequency());
                        allRunningChitGroups.setSubscription(object.getSubscription());
                        allRunningChitGroups.setDividend(object.getDividend());
                        allRunningChitGroups.setMethod(object.getMethod());
                        allRunningChitGroups.setEfees(object.getEfees());
                        allRunningChitGroups.setPaymentfrequency(object.getPaymentfrequency());
                        allRunningChitGroups.setNoofguaranters(object.getNoofguaranters());
                        allRunningChitGroups.setJoiningdocs(object.getJoiningdocs());
                        allRunningChitGroups.setPrizeclaimdocs(object.getPrizeclaimdocs());
                        allRunningChitGroups.setRollid(object.getRollid());
                        allRunningChitGroups.setStartDate(object.getStartDate());
                        allRunningChitGroups.setEndDate(object.getEndDate());
                        allRunningChitGroups.setNow(LocalDateTime.now());
                        allRunningChitGroups.setUpdated(allRunningChitGroups.getNow());
                        allRunningChitGroupsRepository.save(allRunningChitGroups);
                        break;
                    case 3:
                        AllClosedChitGroups allClosedChitGroups = new AllClosedChitGroups();
                        allClosedChitGroups.setMTitle(object.getMTitle());
                        allClosedChitGroups.setMVisibility(object.isMVisibility());
                        allClosedChitGroups.setMTotalNumberOfTickets(object.getMTotalNumberOfTickets());
                        allClosedChitGroups.setMTotalNumberOfAvailableTickets(object.getMTotalNumberOfAvailableTickets());
                        allClosedChitGroups.setMTotalNumberOfBookedTickets(object.getMTotalNumberOfBookedTickets());
                        allClosedChitGroups.setMTotalNumberOfVacantTickets(object.getMTotalNumberOfVacantTickets());
                        allClosedChitGroups.setMTotalNumberOfAuctions(object.getMTotalNumberOfAuctions());
                        allClosedChitGroups.setMTotalNumberOfAgreementsSigned(object.getMTotalNumberOfAgreementsSigned());
                        allClosedChitGroups.setMTotalNumberOfTicketsSold(object.getMTotalNumberOfTicketsSold());
                        allClosedChitGroups.setMBookingStatus(object.getMBookingStatus());
                        allClosedChitGroups.setMinBidRange(object.getMinBidRange());
                        allClosedChitGroups.setMaxBidRange(object.getMaxBidRange());
                        allClosedChitGroups.setMinPrizeRange(object.getMinPrizeRange());
                        allClosedChitGroups.setMaxPrizeRange(object.getMaxPrizeRange());
                        allClosedChitGroups.setCode(object.getCode());
                        allClosedChitGroups.setNumberOfTickets(object.getNumberOfTickets());
                        allClosedChitGroups.setAmount(object.getAmount());
                        allClosedChitGroups.setValue(object.getValue());
                        allClosedChitGroups.setDuration(object.getDuration());
                        allClosedChitGroups.setTime(object.getTime());
                        allClosedChitGroups.setTotalinstallmentsnumber(object.getTotalinstallmentsnumber());
                        allClosedChitGroups.setDay(object.getDay());
                        allClosedChitGroups.setNoauction(object.getNoauction());
                        allClosedChitGroups.setDueday(object.getDueday());
                        allClosedChitGroups.setDistribution(object.getDistribution());
                        allClosedChitGroups.setFrequency(object.getFrequency());
                        allClosedChitGroups.setSubscription(object.getSubscription());
                        allClosedChitGroups.setDividend(object.getDividend());
                        allClosedChitGroups.setMethod(object.getMethod());
                        allClosedChitGroups.setEfees(object.getEfees());
                        allClosedChitGroups.setPaymentfrequency(object.getPaymentfrequency());
                        allClosedChitGroups.setNoofguaranters(object.getNoofguaranters());
                        allClosedChitGroups.setJoiningdocs(object.getJoiningdocs());
                        allClosedChitGroups.setPrizeclaimdocs(object.getPrizeclaimdocs());
                        allClosedChitGroups.setRollid(object.getRollid());
                        allClosedChitGroups.setStartDate(object.getStartDate());
                        allClosedChitGroups.setEndDate(object.getEndDate());
                        allClosedChitGroups.setNow(LocalDateTime.now());
                        allClosedChitGroups.setUpdated(allClosedChitGroups.getNow());
                        allClosedChitGroupsRepository.save(allClosedChitGroups);
                        break;
                    default:
                        allScheduledChitGroups = new AllScheduledChitGroups();
                        allScheduledChitGroups.setMTitle(object.getMTitle());
                        allScheduledChitGroups.setMVisibility(object.isMVisibility());
                        allScheduledChitGroups.setMTotalNumberOfTickets(object.getMTotalNumberOfTickets());
                        allScheduledChitGroups.setMTotalNumberOfAvailableTickets(object.getMTotalNumberOfAvailableTickets());
                        allScheduledChitGroups.setMTotalNumberOfBookedTickets(object.getMTotalNumberOfBookedTickets());
                        allScheduledChitGroups.setMTotalNumberOfVacantTickets(object.getMTotalNumberOfVacantTickets());
                        allScheduledChitGroups.setMTotalNumberOfAuctions(object.getMTotalNumberOfAuctions());
                        allScheduledChitGroups.setMTotalNumberOfAgreementsSigned(object.getMTotalNumberOfAgreementsSigned());
                        allScheduledChitGroups.setMTotalNumberOfTicketsSold(object.getMTotalNumberOfTicketsSold());
                        allScheduledChitGroups.setMBookingStatus(object.getMBookingStatus());
                        allScheduledChitGroups.setMinBidRange(object.getMinBidRange());
                        allScheduledChitGroups.setMaxBidRange(object.getMaxBidRange());
                        allScheduledChitGroups.setMinPrizeRange(object.getMinPrizeRange());
                        allScheduledChitGroups.setMaxPrizeRange(object.getMaxPrizeRange());
                        allScheduledChitGroups.setCode(object.getCode());
                        allScheduledChitGroups.setNumberOfTickets(object.getNumberOfTickets());
                        allScheduledChitGroups.setAmount(object.getAmount());
                        allScheduledChitGroups.setValue(object.getValue());
                        allScheduledChitGroups.setDuration(object.getDuration());
                        allScheduledChitGroups.setTime(object.getTime());
                        allScheduledChitGroups.setTotalinstallmentsnumber(object.getTotalinstallmentsnumber());
                        allScheduledChitGroups.setDay(object.getDay());
                        allScheduledChitGroups.setNoauction(object.getNoauction());
                        allScheduledChitGroups.setDueday(object.getDueday());
                        allScheduledChitGroups.setDistribution(object.getDistribution());
                        allScheduledChitGroups.setFrequency(object.getFrequency());
                        allScheduledChitGroups.setSubscription(object.getSubscription());
                        allScheduledChitGroups.setDividend(object.getDividend());
                        allScheduledChitGroups.setMethod(object.getMethod());
                        allScheduledChitGroups.setEfees(object.getEfees());
                        allScheduledChitGroups.setPaymentfrequency(object.getPaymentfrequency());
                        allScheduledChitGroups.setNoofguaranters(object.getNoofguaranters());
                        allScheduledChitGroups.setJoiningdocs(object.getJoiningdocs());
                        allScheduledChitGroups.setPrizeclaimdocs(object.getPrizeclaimdocs());
                        allScheduledChitGroups.setRollid(object.getRollid());
                        allScheduledChitGroups.setStartDate(object.getStartDate());
                        allScheduledChitGroups.setEndDate(object.getEndDate());
                        allScheduledChitGroups.setNow(LocalDateTime.now());
                        allScheduledChitGroups.setUpdated(allScheduledChitGroups.getNow());
                        allScheduledChitGroupsRepository.save(allScheduledChitGroups);
                        break;
                }
                return new ResponseEntity<DailyChitGroups>(object, HttpStatus.OK);
            } else{
                return new ResponseEntity<DailyChitGroups>(object, HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<DailyChitGroups>(object, HttpStatus.ALREADY_REPORTED);
        }
    }
}
