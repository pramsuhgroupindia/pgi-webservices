package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.TeeklyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.TeeklyChitGroupsRepository;

public class TeeklyChitSchemesMocker {

    public void mockTeeklySchemesTableData(TeeklyAuctionableDurationsRepository ob1, TeeklyChitGroupsRepository ob2) {
        mockTeeklyAuctionableDurations(ob1);
        mockTeeklyChitGroups10(ob2);
        mockTeeklyChitGroups15(ob2);
        mockTeeklyChitGroups20(ob2);
        mockTeeklyChitGroups25(ob2);
        mockTeeklyChitGroups30(ob2);
        mockTeeklyChitGroups40(ob2);
        mockTeeklyChitGroups50(ob2);
        mockTeeklyChitGroups60(ob2);
        mockTeeklyChitGroups70(ob2);
        mockTeeklyChitGroups80(ob2);
        mockTeeklyChitGroups90(ob2);
        mockTeeklyChitGroups100(ob2);
    }

    private void mockTeeklyAuctionableDurations(TeeklyAuctionableDurationsRepository teeklyAuctionableDurationsRepository) {
        TeeklyAuctionableDurations teeklyAuctionableDurations = new TeeklyAuctionableDurations();

        teeklyAuctionableDurations.setT10("10 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT10dtoggle("0");

        teeklyAuctionableDurations.setT15("15 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT15dtoggle("0");

        teeklyAuctionableDurations.setT20("20 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT20dtoggle("0");

        teeklyAuctionableDurations.setT25("25 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT25dtoggle("0");

        teeklyAuctionableDurations.setT30("30 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT30dtoggle("0");

        teeklyAuctionableDurations.setT40("40 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT40dtoggle("0");

        teeklyAuctionableDurations.setT50("50 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT50dtoggle("0");

        teeklyAuctionableDurations.setT60("60 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT60dtoggle("0");

        teeklyAuctionableDurations.setT70("70 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT70dtoggle("0");

        teeklyAuctionableDurations.setT80("80 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT80dtoggle("0");

        teeklyAuctionableDurations.setT90("90 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT90dtoggle("0");

        teeklyAuctionableDurations.setT100("100 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT100dtoggle("0");

        teeklyAuctionableDurations.setT110("110 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT110dtoggle("0");

        teeklyAuctionableDurations.setT120("120 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT120dtoggle("0");

        teeklyAuctionableDurations.setT130("130 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT130dtoggle("0");

        teeklyAuctionableDurations.setT140("140 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT140dtoggle("0");

        teeklyAuctionableDurations.setT150("150 TEEKS DURATIONS TEEKLY CHIT GROUPS");
        teeklyAuctionableDurations.setT150dtoggle("0");

        if (!(teeklyAuctionableDurationsRepository.findAll().size() > 1)) {
            teeklyAuctionableDurationsRepository.save(teeklyAuctionableDurations);
        }
    }

    private void mockTeeklyChitGroups10(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("10 TEEKS 50,000 INR GROUP (P10T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 10");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 9");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 9");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P10T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("10");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }
    }

    private void mockTeeklyChitGroups15(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("15 TEEKS 50,000 INR GROUP (P15T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 15");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 14");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 14");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P15T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("15");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }


    }

    private void mockTeeklyChitGroups20(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("20 TEEKS 50,000 INR GROUP (P20T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 20");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 15");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 4");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 19");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 4");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P20T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("20");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups25(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("25 TEEKS 50,000 INR GROUP (P25T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 25");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 24");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 24");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P25T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("25");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups30(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("30 TEEKS 50,000 INR GROUP (P30T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 30");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P30T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("30");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups40(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("40 TEEKS 50,000 INR GROUP (P40T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 40");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 39");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 39");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P40T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("40");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups50(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups teeklyChitGroups1 = new TeeklyChitGroups();
        teeklyChitGroups1.setMTitle("50 TEEKS 50,000 INR GROUP (P50T50K01)");
        teeklyChitGroups1.setMVisibility("0");
        teeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 50");
        teeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 49");
        teeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        teeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        teeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 49");
        teeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        teeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        teeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        teeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        teeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        teeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        teeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        teeklyChitGroups1.setCode("P50T50K01");
        teeklyChitGroups1.setNumberOfTickets("50");
        teeklyChitGroups1.setAmount("2500 INR PER TICKET");
        teeklyChitGroups1.setValue("50,000 INR");
        teeklyChitGroups1.setDuration("50 WEEKS");
        teeklyChitGroups1.setTime("08:00 PM");
        teeklyChitGroups1.setTotalinstallmentsnumber("50");
        teeklyChitGroups1.setDay("Every Friday of Week");
        teeklyChitGroups1.setNoauction("First Auction Goes to Company");
        teeklyChitGroups1.setDueday("Every Wednesday of Week");
        teeklyChitGroups1.setDistribution("Every Wednesday of Week");
        teeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        teeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        teeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        teeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        teeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        teeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        teeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        teeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        teeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        teeklyChitGroups1.setRollid("50");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(teeklyChitGroups1.getCode())) {
            teeklyChitGroupsRepository.save(teeklyChitGroups1);
        }

    }

    private void mockTeeklyChitGroups60(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("60 TEEKS 50,000 INR GROUP (P60T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 60");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 59");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 59");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P60T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("60");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups70(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("70 TEEKS 50,000 INR GROUP (P70T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 70");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 69");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 69");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P70T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("70");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups80(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("80 TEEKS  50,000 INR GROUP (P80T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 80");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 79");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 79");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P80T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("80");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups90(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("90 TEEKS 50,000 INR GROUP (P90T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 90");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 89");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 89");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P90T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("90");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups100(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("100 TEEKS 50,000 INR GROUP (P100T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P100T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }

    }

    private void mockTeeklyChitGroups110(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
        TeeklyChitGroups ob1 = new TeeklyChitGroups();
        ob1.setMTitle("110 TEEKS 50,000 INR GROUP (P110T50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        ob1.setCode("P110T50K01");
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
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("110");
        if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            teeklyChitGroupsRepository.save(ob1);
        }
    }

    private void mockTeeklyChitGroups120(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
            TeeklyChitGroups ob1 = new TeeklyChitGroups();
            ob1.setMTitle("120 TEEKS 50,000 INR GROUP (P120T50K01)");
            ob1.setMVisibility("0");
            ob1.setMTotalNumberOfTickets("Total Tickets: 100");
            ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
            ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
            ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
            ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
            ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
            ob1.setMBookingStatus("Booking: SCHEDULED");
            ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
            ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
            ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
            ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
            ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
            ob1.setCode("P120T50K01");
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
            ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
            ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
            ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
            ob1.setRollid("120");
            if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
                    teeklyChitGroupsRepository.save(ob1);
            }
    }

    private void mockTeeklyChitGroups130(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
            TeeklyChitGroups ob1 = new TeeklyChitGroups();
            ob1.setMTitle("130 TEEKS 50,000 INR GROUP (P130T50K01)");
            ob1.setMVisibility("0");
            ob1.setMTotalNumberOfTickets("Total Tickets: 100");
            ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
            ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
            ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
            ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
            ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
            ob1.setMBookingStatus("Booking: SCHEDULED");
            ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
            ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
            ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
            ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
            ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
            ob1.setCode("P130T50K01");
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
            ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
            ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
            ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
            ob1.setRollid("130");
            if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
                    teeklyChitGroupsRepository.save(ob1);
            }
    }

    private void mockTeeklyChitGroups140(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
            TeeklyChitGroups ob1 = new TeeklyChitGroups();
            ob1.setMTitle("140 TEEKS 50,000 INR GROUP (P140T50K01)");
            ob1.setMVisibility("0");
            ob1.setMTotalNumberOfTickets("Total Tickets: 100");
            ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
            ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
            ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
            ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
            ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
            ob1.setMBookingStatus("Booking: SCHEDULED");
            ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
            ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
            ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
            ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
            ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
            ob1.setCode("P140T50K01");
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
            ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
            ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
            ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
            ob1.setRollid("140");
            if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
                    teeklyChitGroupsRepository.save(ob1);
            }
    }

    private void mockTeeklyChitGroups150(TeeklyChitGroupsRepository teeklyChitGroupsRepository) {
            TeeklyChitGroups ob1 = new TeeklyChitGroups();
            ob1.setMTitle("110 TEEKS 50,000 INR GROUP (P150T50K01)");
            ob1.setMVisibility("0");
            ob1.setMTotalNumberOfTickets("Total Tickets: 100");
            ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
            ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
            ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
            ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
            ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
            ob1.setMBookingStatus("Booking: SCHEDULED");
            ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
            ob1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
            ob1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
            ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
            ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
            ob1.setCode("P150T50K01");
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
            ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
            ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
            ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
            ob1.setRollid("150");
            if (null == teeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
                    teeklyChitGroupsRepository.save(ob1);
            }
    }

}
