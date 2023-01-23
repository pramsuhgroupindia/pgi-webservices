package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiDailyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.BiDailyChitGroupsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyChitGroupsRepository;

public class BiDailyChitSchemesMocker {

    public void mockBiDailySchemesTableData(BiDailyAuctionableDurationsRepository biDailyAuctionableDurationsRepository,
                                            BiDailyChitGroupsRepository biDailyChitGroupsRepository){
        mockBiDailyAuctionableDurations(biDailyAuctionableDurationsRepository);

        mockBiDailyChitGroups10(biDailyChitGroupsRepository);
        mockBiDailyChitGroups15(biDailyChitGroupsRepository);
        mockBiDailyChitGroups20(biDailyChitGroupsRepository);
        mockBiDailyChitGroups25(biDailyChitGroupsRepository);
        mockBiDailyChitGroups30(biDailyChitGroupsRepository);
        mockBiDailyChitGroups40(biDailyChitGroupsRepository);
        mockBiDailyChitGroups50(biDailyChitGroupsRepository);
        mockBiDailyChitGroups60(biDailyChitGroupsRepository);
        mockBiDailyChitGroups70(biDailyChitGroupsRepository);
        mockBiDailyChitGroups80(biDailyChitGroupsRepository);
        mockBiDailyChitGroups90(biDailyChitGroupsRepository);
        mockBiDailyChitGroups100(biDailyChitGroupsRepository);
        mockBiDailyChitGroups150(biDailyChitGroupsRepository);
        mockBiDailyChitGroups200(biDailyChitGroupsRepository);
        mockBiDailyChitGroups250(biDailyChitGroupsRepository);
        mockBiDailyChitGroups300(biDailyChitGroupsRepository);
        mockBiDailyChitGroups400(biDailyChitGroupsRepository);
        mockBiDailyChitGroups500(biDailyChitGroupsRepository);


    }

    private void mockBiDailyAuctionableDurations(BiDailyAuctionableDurationsRepository biDailyAuctionableDurationsRepository) {
        BiDailyAuctionableDurations biDailyAuctionableDurations = new BiDailyAuctionableDurations();
        biDailyAuctionableDurations.setBd10("10 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd10dtoggle("0");

        biDailyAuctionableDurations.setBd15("15 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd15dtoggle("0");

        biDailyAuctionableDurations.setBd20("20 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd20dtoggle("0");

        biDailyAuctionableDurations.setBd25("25 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd25dtoggle("0");

        biDailyAuctionableDurations.setBd30("30 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd30dtoggle("0");

        biDailyAuctionableDurations.setBd40("40 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd40dtoggle("0");

        biDailyAuctionableDurations.setBd50("50 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd50dtoggle("0");

        biDailyAuctionableDurations.setBd60("60 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd60dtoggle("0");

        biDailyAuctionableDurations.setBd70("70 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd70dtoggle("1");

        biDailyAuctionableDurations.setBd80("80 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd80dtoggle("0");

        biDailyAuctionableDurations.setBd90("90 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd90dtoggle("0");

        biDailyAuctionableDurations.setBd100("100 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd100dtoggle("0");

        biDailyAuctionableDurations.setBd150("150 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd150dtoggle("0");

        biDailyAuctionableDurations.setBd200("200 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd200dtoggle("0");

        biDailyAuctionableDurations.setBd250("250 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd250dtoggle("0");

        biDailyAuctionableDurations.setBd300("300 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd300dtoggle("0");

        biDailyAuctionableDurations.setBd400("400 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd400dtoggle("0");

        biDailyAuctionableDurations.setBd500("500 BI_DAYS DURATION DAILY CHIT GROUPS");
        biDailyAuctionableDurations.setBd500dtoggle("0");


        if(!(biDailyAuctionableDurationsRepository.findAll().size() > 1)){
            biDailyAuctionableDurationsRepository.save(biDailyAuctionableDurations);
        }
    }

    private void mockBiDailyChitGroups10(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("10 BI-DAYS 10,000 INR GROUP (P10BD10K01)");
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
        ob1.setMinPrizeRange("Minimum Prize: 8,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 10,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P10BD10K01");
        ob1.setNumberOfTickets("10");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("10,000 INR");
        ob1.setDuration("10 BI-DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("10");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("95% OF CHIT VALUE(9500 INR PER TICKET)");
        ob1.setDividend("5% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(100 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("10");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups15(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("15 BI-DAYS 15,000 INR GROUP (P15BD15K01)");
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
        ob1.setMinPrizeRange("Minimum Prize: 12,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 15,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P15BD15K01");
        ob1.setNumberOfTickets("15");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("15,000 INR");
        ob1.setDuration("15 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("15");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("93% OF CHIT VALUE(13,950 INR PER TICKET)");
        ob1.setDividend("7% OF CHIT VALUE(1050 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(150 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("15");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups20(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("20 BI-DAYS 20,000 INR GROUP (P20BD20K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 20");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 19");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 19");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 16,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 20,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P20BD20K01");
        ob1.setNumberOfTickets("20");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("20,000 INR");
        ob1.setDuration("20 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("20");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(18,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("20");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups25(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("30 BI-DAYS 15,000 INR GROUP (P30BD15K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 30");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 13,200 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 15,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P30BD15K01");
        ob1.setNumberOfTickets("30");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("15,000 INR");
        ob1.setDuration("30 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("30");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(13,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(1,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(150 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("30");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups30(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("30 BI-DAYS 15,000 INR GROUP (P30BD15K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 30");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 13,200 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 15,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P30BD15K01");
        ob1.setNumberOfTickets("30");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("15,000 INR");
        ob1.setDuration("30 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("30");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(13,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(1,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(150 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("30");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups40(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("40 BI-DAYS 20,000 INR GROUP (P40BD20K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 40");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 39");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 39");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 16,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 20,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P40BD20K01");
        ob1.setNumberOfTickets("40");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("20,000 INR");
        ob1.setDuration("40 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("40");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(18,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("40");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups50(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("50 BI-DAYS 25,000 INR GROUP (P50BD25K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 50");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 49");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 49");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 25,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 25,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P50BD25K01");
        ob1.setNumberOfTickets("50");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("25,000 INR");
        ob1.setDuration("50 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("50");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(22,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("50");


        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups60(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("60 BI-DAYS 30,000 INR GROUP (P60BD30K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 60");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 59");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 59");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 24,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 30,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P60BD30K01");
        ob1.setNumberOfTickets("60");
        ob1.setAmount("600 INR PER TICKET");
        ob1.setValue("30,000 INR");
        ob1.setDuration("60 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("60");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(27,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(3,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("60");


        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups70(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("70 BI-DAYS 35,000 INR GROUP (P70BD35K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 70");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 69");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 69");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 28,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 70,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P70BD35K01");
        ob1.setNumberOfTickets("70");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("70,000 INR");
        ob1.setDuration("70 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("70");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(63,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(7,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(350 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("70");


        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups80(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("80 BI-DAYS 40,000 INR GROUP (P80BD40K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 80");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 79");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 79");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 32,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 40,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P80BD40K01");
        ob1.setNumberOfTickets("80");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("40,000 INR");
        ob1.setDuration("80 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("80");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(36,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(4,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(400 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("80");


        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups90(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("90 BI-DAYS 40,000 INR GROUP (P90BD45K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 90");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 89");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 89");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 36,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 45,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P90BD45K01");
        ob1.setNumberOfTickets("90");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("45,000 INR");
        ob1.setDuration("90 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("90");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(40,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(4,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(450 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("90");


        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups100(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockBiDailyChitGroups150(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("150 BI-DAYS 1,50,000 INR GROUP (P150BD150K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 150");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 149");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 149");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 1,05,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 1,50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P150BD150K01");
        ob1.setNumberOfTickets("150");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("150 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("150");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(1,20,000 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(30,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(1,500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("150");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

    private void mockBiDailyChitGroups200(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

    private void mockBiDailyChitGroups250(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

    private void mockBiDailyChitGroups300(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

    private void mockBiDailyChitGroups400(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");

        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

    private void mockBiDailyChitGroups500(BiDailyChitGroupsRepository biDailyChitGroupsRepository) {
        BiDailyChitGroups ob1 = new BiDailyChitGroups();
        ob1.setMTitle("100 BI-DAYS 50,000 INR GROUP (P100BD50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("Total Tickets: 100");
        ob1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 99");
        ob1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        ob1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        ob1.setMTotalNumberOfAuctions("Total  Auctions: 99");
        ob1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        ob1.setMBookingStatus("Booking: SCHEDULED");
        ob1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        ob1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        ob1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        ob1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        ob1.setCode("P100BD50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF Week");
        ob1.setDistribution("WITHIN TWO BI-DAYSOF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("ZERO GUARANTORS ARE REQUIRED");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if(null == biDailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            biDailyChitGroupsRepository.save(ob1);
        }
    }

}
