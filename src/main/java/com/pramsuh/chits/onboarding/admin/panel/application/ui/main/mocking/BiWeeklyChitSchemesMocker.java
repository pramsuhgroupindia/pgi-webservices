package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiWeeklyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiWeeklyChitGroupsRepository;

public class BiWeeklyChitSchemesMocker {



    public void mockBiWeeklySchemesTableData(BiWeeklyAuctionableDurationsRepository biWeeklyAuctionableDurationsRepository,
                                             BiWeeklyChitGroupsRepository biWeeklyChitGroupsRepository){
        mockBiWeeklyAuctionableDurations(biWeeklyAuctionableDurationsRepository);
        mockBiWeeklyChitGroups10(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups15(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups20(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups25(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups30(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups40(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups50(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups60(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups70(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups80(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups90(biWeeklyChitGroupsRepository);
        mockBiWeeklyChitGroups100(biWeeklyChitGroupsRepository);
    }

    private void mockBiWeeklyAuctionableDurations(BiWeeklyAuctionableDurationsRepository biWeeklyAuctionableDurationsRepository){
        BiWeeklyAuctionableDurations biWeeklyAuctionableDurations = new BiWeeklyAuctionableDurations();

        biWeeklyAuctionableDurations.setBw10("10 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw10toggle("0");

        biWeeklyAuctionableDurations.setBw15("15 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw15toggle("0");

        biWeeklyAuctionableDurations.setBw20("20 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw20toggle("0");

        biWeeklyAuctionableDurations.setBw25("25 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw25toggle("0");

        biWeeklyAuctionableDurations.setBw30("30 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw30toggle("0");

        biWeeklyAuctionableDurations.setBw40("40 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw40toggle("0");

        biWeeklyAuctionableDurations.setBw50("50 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw50toggle("0");

        biWeeklyAuctionableDurations.setBw60("60 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw60toggle("0");

        biWeeklyAuctionableDurations.setBw70("70 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw70toggle("0");

        biWeeklyAuctionableDurations.setBw80("80 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw80toggle("0");

        biWeeklyAuctionableDurations.setBw90("90 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw90toggle("0");

        biWeeklyAuctionableDurations.setBw100("100 BIWEEKS DURATIONS BIWEEKLY CHIT GROUPS");
        biWeeklyAuctionableDurations.setBw100toggle("0");

        if (!biWeeklyAuctionableDurationsRepository.existsById(Integer.toUnsignedLong(1))) {
            biWeeklyAuctionableDurationsRepository.save(biWeeklyAuctionableDurations);
        }
    }

    private void mockBiWeeklyChitGroups10(BiWeeklyChitGroupsRepository repository){
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("10 BI-WEEKS 50,000 INR GROUP (P10BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("10");
        ob1.setMTotalNumberOfAvailableTickets("9");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("9");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("40,000 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P10BW50K01");
        ob1.setNumberOfTickets("10");
        ob1.setAmount("5000 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("10 WEEKS");
        ob1.setTime("04:00 PM");
        ob1.setTotalinstallmentsnumber("10");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("94.174% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("5.826% OF CHIT VALUE(2913 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("10");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups15(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("15 BI-WEEKS 50,000 INR GROUP (P15BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("15");
        ob1.setMTotalNumberOfAvailableTickets("14");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("14");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("40,000 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P15BW50K01");
        ob1.setNumberOfTickets("15");
        ob1.setAmount("5000 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("15 WEEKS");
        ob1.setTime("04:00 PM");
        ob1.setTotalinstallmentsnumber("15");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("94.174% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("5.826% OF CHIT VALUE(2913 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("15");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups20(BiWeeklyChitGroupsRepository repository){
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("20 WEEKS 50,000 INR GROUP (P20W50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("20");
        ob1.setMTotalNumberOfAvailableTickets("15");
        ob1.setMTotalNumberOfBookedTickets("4");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("19");
        ob1.setMTotalNumberOfTicketsSold("4");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P20W50K01");
        ob1.setNumberOfTickets("20");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("20 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("20");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("20");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups25(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("25 BI-WEEKS 50,000 INR GROUP (P25BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("25");
        ob1.setMTotalNumberOfAvailableTickets("24");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("24");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P25BW50K01");
        ob1.setNumberOfTickets("25");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("25 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("25");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("25");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups30(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("30 BI-WEEKS 50,000 INR GROUP (P30BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("30");
        ob1.setMTotalNumberOfAvailableTickets("29");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("29");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P30BW50K01");
        ob1.setNumberOfTickets("30");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("30 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("30");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("30");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups40(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("40 BI_WEEKS 50,000 INR GROUP (P40BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("40");
        ob1.setMTotalNumberOfAvailableTickets("39");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("39");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P40BW50K01");
        ob1.setNumberOfTickets("40");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("40 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("40");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("40");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups50(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("50 BI-WEEKS 50,000 INR GROUP (P50BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("50");
        ob1.setMTotalNumberOfAvailableTickets("49");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("49");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P50BW50K01");
        ob1.setNumberOfTickets("50");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("50 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("50");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("50");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups60(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("60 BI-WEEKS 50,000 INR GROUP (P60BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("60");
        ob1.setMTotalNumberOfAvailableTickets("59");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("59");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P60BW50K01");
        ob1.setNumberOfTickets("60");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("60 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("60");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("60");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups70(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("70 BI-WEEKS 50,000 INR GROUP (P70BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("70");
        ob1.setMTotalNumberOfAvailableTickets("69");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("69");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P70BW50K01");
        ob1.setNumberOfTickets("70");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("70 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("70");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("70");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups80(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("80 BI-WEEKS 50,000 INR GROUP (P80BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("80");
        ob1.setMTotalNumberOfAvailableTickets("79");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("79");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P80BW50K01");
        ob1.setNumberOfTickets("80");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("80 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("80");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("80");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups90(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("90 BI-WEEKS 50,000 INR GROUP (P90BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("90");
        ob1.setMTotalNumberOfAvailableTickets("89");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("89");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P90BW50K01");
        ob1.setNumberOfTickets("90");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("90 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("90");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("90");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

    private void mockBiWeeklyChitGroups100(BiWeeklyChitGroupsRepository repository) {
        BiWeeklyChitGroups ob1 = new BiWeeklyChitGroups();
        ob1.setMTitle("100 BI-WEEKS 50,000 INR GROUP (P100BW50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("100");
        ob1.setMTotalNumberOfAvailableTickets("99");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("99");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("37,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("4");
        ob1.setCode("P100BW50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("2500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 WEEKS");
        ob1.setTime("08:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("Every Friday of Week");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every Wednesday of Week");
        ob1.setDistribution("Every Wednesday of Week");
        ob1.setFrequency("WEEKLY 1 AUCTION");
        ob1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        ob1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if(null == repository.findChitGroupByCode(ob1.getCode())){
            repository.save(ob1);
        }

    }

}
