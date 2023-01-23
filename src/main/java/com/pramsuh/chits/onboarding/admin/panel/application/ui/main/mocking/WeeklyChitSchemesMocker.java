package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.WeeklyChitGroupsRepository;

public class WeeklyChitSchemesMocker {

    public void mockWeeklySchemesTableData(WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository, WeeklyChitGroupsRepository weeklyChitGroupsRepository ){
        mockWeeklyAuctionableDurations(weeklyAuctionableDurationsRepository);

        mockWeeklyChitGroups10(weeklyChitGroupsRepository);
        mockWeeklyChitGroups15(weeklyChitGroupsRepository);
        mockWeeklyChitGroups20(weeklyChitGroupsRepository);
        mockWeeklyChitGroups25(weeklyChitGroupsRepository);
        mockWeeklyChitGroups30(weeklyChitGroupsRepository);
        mockWeeklyChitGroups40(weeklyChitGroupsRepository);
        mockWeeklyChitGroups50(weeklyChitGroupsRepository);
        mockWeeklyChitGroups60(weeklyChitGroupsRepository);
        mockWeeklyChitGroups70(weeklyChitGroupsRepository);
        mockWeeklyChitGroups80(weeklyChitGroupsRepository);
        mockWeeklyChitGroups90(weeklyChitGroupsRepository);
        mockWeeklyChitGroups100(weeklyChitGroupsRepository);

    }

    private void mockWeeklyAuctionableDurations(WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository){
        WeeklyAuctionableDurations weeklyAuctionableDurations = new WeeklyAuctionableDurations();

        weeklyAuctionableDurations.setW10("10 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW10dtoggle("0");

        weeklyAuctionableDurations.setW15("15 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW15dtoggle("0");

        weeklyAuctionableDurations.setW20("20 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW20dtoggle("1");

        weeklyAuctionableDurations.setW25("25 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW25dtoggle("0");

        weeklyAuctionableDurations.setW30("30 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW30dtoggle("0");

        weeklyAuctionableDurations.setW40("40 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW40dtoggle("0");

        weeklyAuctionableDurations.setW50("50 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW50dtoggle("0");

        weeklyAuctionableDurations.setW60("60 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW60dtoggle("0");

        weeklyAuctionableDurations.setW70("70 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW70dtoggle("0");

        weeklyAuctionableDurations.setW80("80 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW80dtoggle("0");

        weeklyAuctionableDurations.setW90("90 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW90dtoggle("0");

        weeklyAuctionableDurations.setW100("100 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW100dtoggle("0");

        weeklyAuctionableDurations.setW120("120 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW120dtoggle("0");

        weeklyAuctionableDurations.setW140("140 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW140dtoggle("0");

        weeklyAuctionableDurations.setW160("160 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW160dtoggle("0");

        weeklyAuctionableDurations.setW180("180 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW180dtoggle("0");

        weeklyAuctionableDurations.setW200("200 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW200dtoggle("0");

        if(!weeklyAuctionableDurationsRepository.existsById(Integer.toUnsignedLong(1))) {
            weeklyAuctionableDurationsRepository.save(weeklyAuctionableDurations);
        }
    }

    private void mockWeeklyChitGroups10(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("10 WEEKS 50,000 INR GROUP (P10W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 10");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 9");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 9");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups1.setCode("P10W50K01");
        weeklyChitGroups1.setNumberOfTickets("10");
        weeklyChitGroups1.setAmount("5000 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("10 WEEKS");
        weeklyChitGroups1.setTime("04:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("10");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("94.174% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("5.826% OF CHIT VALUE(2913 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("10");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups15(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups ob1 = new WeeklyChitGroups();
        ob1.setMTitle("15 WEEKS 50,000 INR GROUP (P15W50K01)");
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
        ob1.setCode("P15W50K01");
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
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            weeklyChitGroupsRepository.save(ob1);
        }


    }

    private void mockWeeklyChitGroups20(WeeklyChitGroupsRepository weeklyChitGroupsRepository ){
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("20 WEEKS 50,000 INR GROUP (P20W50K01)");
        weeklyChitGroups1.setMVisibility("1");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 20");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 12");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 7");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 19");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 7");
        weeklyChitGroups1.setMBookingStatus("Booking: OPEN");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 7");
        weeklyChitGroups1.setCode("P20W50K01");
        weeklyChitGroups1.setNumberOfTickets("20");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("20 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("20");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44,049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5,951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("20");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }
        WeeklyChitGroups weeklyChitGroups2 = new WeeklyChitGroups();
        weeklyChitGroups2.setMTitle("20 WEEKS 50,000 INR GROUP (P20W50K02)");
        weeklyChitGroups2.setMVisibility("0");
        weeklyChitGroups2.setMTotalNumberOfTickets("Total Tickets: 20");
        weeklyChitGroups2.setMTotalNumberOfAvailableTickets("Total Available Tickets: 19");
        weeklyChitGroups2.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups2.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups2.setMTotalNumberOfAuctions("Total  Auctions: 19");
        weeklyChitGroups2.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups2.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups2.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups2.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups2.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups2.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups2.setCode("P20W50K02");
        weeklyChitGroups2.setNumberOfTickets("20");
        weeklyChitGroups2.setAmount("2500 INR PER TICKET");
        weeklyChitGroups2.setValue("50,000 INR");
        weeklyChitGroups2.setDuration("20 WEEKS");
        weeklyChitGroups2.setTime("08:05 PM");
        weeklyChitGroups2.setTotalinstallmentsnumber("20");
        weeklyChitGroups2.setDay("Every Friday of Week");
        weeklyChitGroups2.setNoauction("First Auction Goes to Company");
        weeklyChitGroups2.setDueday("Every Wednesday of Week");
        weeklyChitGroups2.setDistribution("Every Wednesday of Week");
        weeklyChitGroups2.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups2.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups2.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups2.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups2.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups2.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups2.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups2.setRollid("20");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups2.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups2);
        }

    }

    private void mockWeeklyChitGroups25(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("25 WEEKS 50,000 INR GROUP (P25W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 25");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 24");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 24");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P25W50K01");
        weeklyChitGroups1.setNumberOfTickets("25");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("25 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("25");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("25");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups30(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("30 WEEKS 50,000 INR GROUP (P30W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 30");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P30W50K01");
        weeklyChitGroups1.setNumberOfTickets("30");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("30 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("30");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("30");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups40(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("40 WEEKS 50,000 INR GROUP (P40W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 40");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 39");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 39");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P40W50K01");
        weeklyChitGroups1.setNumberOfTickets("40");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("40 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("40");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("40");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups50(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("50 WEEKS 50,000 INR GROUP (P50W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 50");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 49");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 49");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P50W50K01");
        weeklyChitGroups1.setNumberOfTickets("50");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("50 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("50");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("50");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups60(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("60 WEEKS 50,000 INR GROUP (P60W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 60");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 59");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 59");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P60W50K01");
        weeklyChitGroups1.setNumberOfTickets("60");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("60 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("60");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("60");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups70(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("70 WEEKS 50,000 INR GROUP (P70W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 70");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 69");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 69");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P70W50K01");
        weeklyChitGroups1.setNumberOfTickets("70");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("70 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("70");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("70");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups80(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("80 WEEKS 50,000 INR GROUP (P80W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 80");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 79");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 79");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P80W50K01");
        weeklyChitGroups1.setNumberOfTickets("80");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("80 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("80");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("80");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups90(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("90 WEEKS 50,000 INR GROUP (P90W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 90");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 89");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 89");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P90W50K01");
        weeklyChitGroups1.setNumberOfTickets("90");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("90 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("90");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("90");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups100(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("100 WEEKS 50,000 INR GROUP (P100W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 100");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P100W50K01");
        weeklyChitGroups1.setNumberOfTickets("100");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("100 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("100");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("100");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }
    }

    private void mockWeeklyChitGroups120(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("120 WEEKS 50,000 INR GROUP (P120W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 120");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 119");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 119");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups1.setCode("P120W50K01");
        weeklyChitGroups1.setNumberOfTickets("120");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("120 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("100");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("120");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }
    }

    private void mockWeeklyChitGroups140(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("140 WEEKS 50,000 INR GROUP (P140W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 140");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 139");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 139");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        weeklyChitGroups1.setCode("P140W50K01");
        weeklyChitGroups1.setNumberOfTickets("140");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("140 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("140");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("140");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups160(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("160 WEEKS 50,000 INR GROUP (P160W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 160");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 159");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 159");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups1.setCode("P160W50K01");
        weeklyChitGroups1.setNumberOfTickets("160");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("160 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("160");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("160");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups180(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("180 WEEKS 50,000 INR GROUP (P180W50K01)");
        weeklyChitGroups1.setMVisibility("1");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 180");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 179");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 179");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups1.setCode("P180W50K01");
        weeklyChitGroups1.setNumberOfTickets("180");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("180 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("180");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("180");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

    private void mockWeeklyChitGroups200(WeeklyChitGroupsRepository weeklyChitGroupsRepository ) {
        WeeklyChitGroups weeklyChitGroups1 = new WeeklyChitGroups();
        weeklyChitGroups1.setMTitle("200 WEEKS 50,000 INR GROUP (P200W50K01)");
        weeklyChitGroups1.setMVisibility("0");
        weeklyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 200");
        weeklyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 199");
        weeklyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        weeklyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 199");
        weeklyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        weeklyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        weeklyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        weeklyChitGroups1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        weeklyChitGroups1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        weeklyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        weeklyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        weeklyChitGroups1.setCode("P200W50K01");
        weeklyChitGroups1.setNumberOfTickets("200");
        weeklyChitGroups1.setAmount("2500 INR PER TICKET");
        weeklyChitGroups1.setValue("50,000 INR");
        weeklyChitGroups1.setDuration("200 WEEKS");
        weeklyChitGroups1.setTime("08:00 PM");
        weeklyChitGroups1.setTotalinstallmentsnumber("200");
        weeklyChitGroups1.setDay("Every Friday of Week");
        weeklyChitGroups1.setNoauction("First Auction Goes to Company");
        weeklyChitGroups1.setDueday("Every Wednesday of Week");
        weeklyChitGroups1.setDistribution("Every Wednesday of Week");
        weeklyChitGroups1.setFrequency("WEEKLY 1 AUCTION");
        weeklyChitGroups1.setSubscription("88.09% OF CHIT VALUE(44049 INR PER TICKET)");
        weeklyChitGroups1.setDividend("11.90% OF CHIT VALUE(5951 INR PER TICKET)");
        weeklyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        weeklyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        weeklyChitGroups1.setPaymentfrequency("DAILY, WEEKLY, BIWEEKLY");
        weeklyChitGroups1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        weeklyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        weeklyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        weeklyChitGroups1.setRollid("200");
        if(null == weeklyChitGroupsRepository.findChitGroupByCode(weeklyChitGroups1.getCode())){
            weeklyChitGroupsRepository.save(weeklyChitGroups1);
        }

    }

}
