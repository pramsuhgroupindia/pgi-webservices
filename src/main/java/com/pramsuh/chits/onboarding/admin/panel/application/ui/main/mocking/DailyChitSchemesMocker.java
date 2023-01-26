package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DailyChitGroupsRepository;

public class DailyChitSchemesMocker {

    public void mockDailySchemesTableData(DailyAuctionableDurationsRepository dailyAuctionableDurationsRepository, DailyChitGroupsRepository dailyChitGroupsRepository){
        mockDailyAuctionableDurations(dailyAuctionableDurationsRepository);

        mockDailyChitGroups10(dailyChitGroupsRepository);
        mockDailyChitGroups15(dailyChitGroupsRepository);
        mockDailyChitGroups20(dailyChitGroupsRepository);
        mockDailyChitGroups30(dailyChitGroupsRepository);
        mockDailyChitGroups40(dailyChitGroupsRepository);
        mockDailyChitGroups50(dailyChitGroupsRepository);
        mockDailyChitGroups60(dailyChitGroupsRepository);
        mockDailyChitGroups70(dailyChitGroupsRepository);
        mockDailyChitGroups80(dailyChitGroupsRepository);
        mockDailyChitGroups90(dailyChitGroupsRepository);
        mockDailyChitGroups100(dailyChitGroupsRepository);
        mockDailyChitGroups150(dailyChitGroupsRepository);
        mockDailyChitGroups200(dailyChitGroupsRepository);
        mockDailyChitGroups250(dailyChitGroupsRepository);
        mockDailyChitGroups300(dailyChitGroupsRepository);
        mockDailyChitGroups400(dailyChitGroupsRepository);
        mockDailyChitGroups500(dailyChitGroupsRepository);


    }

    private void mockDailyAuctionableDurations(DailyAuctionableDurationsRepository dailyAuctionableDurationsRepository) {
        DailyAuctionableDurations dailyAuctionableDurations = new DailyAuctionableDurations();

        dailyAuctionableDurations.setD10("10 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD10dtoggle("0");

        dailyAuctionableDurations.setD15("15 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD10dtoggle("0");

        dailyAuctionableDurations.setD20("20 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD20dtoggle("0");

        dailyAuctionableDurations.setD25("25 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD25dtoggle("0");

        dailyAuctionableDurations.setD30("30 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD30dtoggle("0");

        dailyAuctionableDurations.setD40("40 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD40dtoggle("0");

        dailyAuctionableDurations.setD50("50 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD50dtoggle("0");

        dailyAuctionableDurations.setD60("60 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD60dtoggle("0");

        dailyAuctionableDurations.setD70("70 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD70dtoggle("0");

        dailyAuctionableDurations.setD80("80 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD80dtoggle("0");

        dailyAuctionableDurations.setD90("90 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD90dtoggle("0");

        dailyAuctionableDurations.setD100("100 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD100dtoggle("0");

        dailyAuctionableDurations.setD150("150 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD150dtoggle("0");

        dailyAuctionableDurations.setD200("200 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD200dtoggle("0");

        dailyAuctionableDurations.setD250("250 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD250dtoggle("0");

        dailyAuctionableDurations.setD300("300 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD300dtoggle("0");

        dailyAuctionableDurations.setD400("400 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD400dtoggle("0");

        dailyAuctionableDurations.setD500("500 DAYS DURATION DAILY CHIT GROUPS");
        dailyAuctionableDurations.setD500dtoggle("0");

        if(!(dailyAuctionableDurationsRepository.findAll().size() > 1) ){
            dailyAuctionableDurationsRepository.save(dailyAuctionableDurations);
        }

    }

    private void mockDailyChitGroups10(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("10 DAYS 10,000 INR GROUP (P10D10K01)");
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
        ob1.setMinPrizeRange("8,000 Rs");
        ob1.setMaxPrizeRange("10,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P10D10K01");
        ob1.setNumberOfTickets("10");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("10,000 INR");
        ob1.setDuration("10 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("10");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("95% OF CHIT VALUE(9500 INR PER TICKET)");
        ob1.setDividend("5% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(100 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("10");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups15(DailyChitGroupsRepository dailyChitGroupsRepository){
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("15 DAYS 15,000 INR GROUP (P15D15K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("15");
        ob1.setMTotalNumberOfAvailableTickets("9");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("9");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("12,000 Rs");
        ob1.setMaxPrizeRange("15,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P15D15K01");
        ob1.setNumberOfTickets("15");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("15,000 INR");
        ob1.setDuration("15 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("15");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("93% OF CHIT VALUE(13,950 INR PER TICKET)");
        ob1.setDividend("7% OF CHIT VALUE(1050 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(150 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("15");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups20(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("20 DAYS 20,000 INR GROUP (P20D20K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("20");
        ob1.setMTotalNumberOfAvailableTickets("19");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("19");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("16,000 Rs");
        ob1.setMaxPrizeRange("20,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P20D20K01");
        ob1.setNumberOfTickets("20");
        ob1.setAmount("1000 INR PER TICKET");
        ob1.setValue("20,000 INR");
        ob1.setDuration("20 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("20");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(18,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("20");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups30(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("30 DAYS 15,000 INR GROUP (P30D15K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("30");
        ob1.setMTotalNumberOfAvailableTickets("29");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("29");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("13,200 Rs");
        ob1.setMaxPrizeRange("15,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P30D15K01");
        ob1.setNumberOfTickets("30");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("15,000 INR");
        ob1.setDuration("30 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("30");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(13,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(1,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(150 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("30");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups40(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("40 DAYS 20,000 INR GROUP (P40D20K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("40");
        ob1.setMTotalNumberOfAvailableTickets("39");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("39");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("16,000 Rs");
        ob1.setMaxPrizeRange("20,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P40D20K01");
        ob1.setNumberOfTickets("40");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("20,000 INR");
        ob1.setDuration("40 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("40");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(18,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("40");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups50(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("50 DAYS 25,000 INR GROUP (P50D25K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("50");
        ob1.setMTotalNumberOfAvailableTickets("49");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("49");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("25,000 Rs");
        ob1.setMaxPrizeRange("25,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P50D25K01");
        ob1.setNumberOfTickets("50");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("25,000 INR");
        ob1.setDuration("50 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("50");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(22,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(2,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("50");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups60(DailyChitGroupsRepository dailyChitGroupsRepository) {
        {
            DailyChitGroups ob1 = new DailyChitGroups();
            ob1.setMTitle("60 DAYS 30,000 INR GROUP (P60D30K01)");
            ob1.setMVisibility("0");
            ob1.setMTotalNumberOfTickets("60");
            ob1.setMTotalNumberOfAvailableTickets("59");
            ob1.setMTotalNumberOfBookedTickets("0");
            ob1.setMTotalNumberOfVacantTickets("0");
            ob1.setMTotalNumberOfAuctions("59");
            ob1.setMTotalNumberOfTicketsSold("0");
            ob1.setMBookingStatus("SCHEDULED");
            ob1.setMinBidRange("0% of Chit Value");
            ob1.setMaxBidRange("20% of Chit Value");
            ob1.setMinPrizeRange("24,000 Rs");
            ob1.setMaxPrizeRange("30,000 Rs");
            ob1.setMTotalNumberOfAgreementsSigned("0");
            ob1.setCode("P60D30K01");
            ob1.setNumberOfTickets("60");
            ob1.setAmount("600 INR PER TICKET");
            ob1.setValue("30,000 INR");
            ob1.setDuration("60 DAYS");
            ob1.setTime("11:00 PM");
            ob1.setTotalinstallmentsnumber("60");
            ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
            ob1.setNoauction("First Auction Goes to Company");
            ob1.setDueday("EVERY SUNDAY OF WEEK");
            ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
            ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
            ob1.setSubscription("90% OF CHIT VALUE(27,000 INR PER TICKET)");
            ob1.setDividend("10% OF CHIT VALUE(3,000 INR PER TICKET)");
            ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
            ob1.setEfees("1% OF CHIT VALUE(200 INR PER TICKET)");
            ob1.setPaymentfrequency("WEEKLY");
            ob1.setNoofguaranters("0");
            ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
            ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
            ob1.setRollid("60");
            if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
                dailyChitGroupsRepository.save(ob1);
            }

        }
    }

    private void mockDailyChitGroups70(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("70 DAYS 35,000 INR GROUP (P70D35K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("70");
        ob1.setMTotalNumberOfAvailableTickets("69");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("69");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("28,000 Rs");
        ob1.setMaxPrizeRange("70,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P70D35K01");
        ob1.setNumberOfTickets("70");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("70,000 INR");
        ob1.setDuration("70 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("70");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(63,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(7,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(350 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("70");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups80(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("80 DAYS 40,000 INR GROUP (P80D40K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("80");
        ob1.setMTotalNumberOfAvailableTickets("79");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("79");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("32,000 Rs");
        ob1.setMaxPrizeRange("40,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P80D40K01");
        ob1.setNumberOfTickets("80");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("40,000 INR");
        ob1.setDuration("80 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("80");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(36,000 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(4,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(400 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("80");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups90(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("90 DAYS 40,000 INR GROUP (P90D45K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("90");
        ob1.setMTotalNumberOfAvailableTickets("89");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("89");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("36,000 Rs");
        ob1.setMaxPrizeRange("45,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P90D45K01");
        ob1.setNumberOfTickets("90");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("45,000 INR");
        ob1.setDuration("90 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("90");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("90% OF CHIT VALUE(40,500 INR PER TICKET)");
        ob1.setDividend("10% OF CHIT VALUE(4,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(450 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("90");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups100(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("100 DAYS 50,000 INR GROUP (P100D50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("100");
        ob1.setMTotalNumberOfAvailableTickets("99");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("99");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("20% of Chit Value");
        ob1.setMinPrizeRange("40,000 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P100D50K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("100 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("100");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("85% OF CHIT VALUE(42,500 INR PER TICKET)");
        ob1.setDividend("15% OF CHIT VALUE(7,500 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("100");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups150(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("150 DAYS 45,000 INR GROUP (P150D45K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("150");
        ob1.setMTotalNumberOfAvailableTickets("149");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("149");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("12,500 Rs");
        ob1.setMaxPrizeRange("45,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P150D45K01");
        ob1.setNumberOfTickets("100");
        ob1.setAmount("450 INR PER TICKET");
        ob1.setValue("45,000 INR");
        ob1.setDuration("150 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("150");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(36,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(9,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(4500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("150");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups200(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("200 DAYS 50,000 INR GROUP (P200D50K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("200");
        ob1.setMTotalNumberOfAvailableTickets("199");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("199");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("25% of Chit Value");
        ob1.setMinPrizeRange("12,500 Rs");
        ob1.setMaxPrizeRange("50,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P200D50K01");
        ob1.setNumberOfTickets("200");
        ob1.setAmount("250 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("200 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("200");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(40,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(10,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("200");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups250(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("250 DAYS 75,000 INR GROUP (P250D75K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("250");
        ob1.setMTotalNumberOfAvailableTickets("249");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("249");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("30% of Chit Value");
        ob1.setMinPrizeRange("56,250 Rs");
        ob1.setMaxPrizeRange("75,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P250D75K01");
        ob1.setNumberOfTickets("250");
        ob1.setAmount("300 INR PER TICKET");
        ob1.setValue("75,000 INR");
        ob1.setDuration("250 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("250");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(60,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(15,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(750 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("250");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups300(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("300 DAYS 60,000 INR GROUP (P300D60K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("300");
        ob1.setMTotalNumberOfAvailableTickets("299");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("299");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("30% of Chit Value");
        ob1.setMinPrizeRange("42,000 Rs");
        ob1.setMaxPrizeRange("60,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P300D60K01");
        ob1.setNumberOfTickets("300");
        ob1.setAmount("200 INR PER TICKET");
        ob1.setValue("60,000 INR");
        ob1.setDuration("300 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("300");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(48,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(12,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(600 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("300");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups400(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("400 DAYS 1,00,000 INR GROUP (P400D100K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("400");
        ob1.setMTotalNumberOfAvailableTickets("399");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("399");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("35% of Chit Value");
        ob1.setMinPrizeRange("65,000 Rs");
        ob1.setMaxPrizeRange("1,00,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P400D100K01");
        ob1.setNumberOfTickets("400");
        ob1.setAmount("250 INR PER TICKET");
        ob1.setValue("1,00,000 INR");
        ob1.setDuration("400 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("400");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(80,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(20,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("400");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

    private void mockDailyChitGroups500(DailyChitGroupsRepository dailyChitGroupsRepository) {
        DailyChitGroups ob1 = new DailyChitGroups();
        ob1.setMTitle("500 DAYS 1,00,000 INR GROUP (P500D100K01)");
        ob1.setMVisibility("0");
        ob1.setMTotalNumberOfTickets("500");
        ob1.setMTotalNumberOfAvailableTickets("499");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("499");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("SCHEDULED");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("40% of Chit Value");
        ob1.setMinPrizeRange("60,000 Rs");
        ob1.setMaxPrizeRange("1,00,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P500D100K01");
        ob1.setNumberOfTickets("500");
        ob1.setAmount("200 INR PER TICKET");
        ob1.setValue("1,00,000 INR");
        ob1.setDuration("500 DAYS");
        ob1.setTime("11:00 PM");
        ob1.setTotalinstallmentsnumber("500");
        ob1.setDay("EVERY WEEK DAY EXCEPT WEEKEND");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("EVERY SUNDAY OF WEEK");
        ob1.setDistribution("WITHIN TWO DAYS OF AUCTION");
        ob1.setFrequency("DAILY 1 AUCTION(EXCEPT WEEKENDS)");
        ob1.setSubscription("80% OF CHIT VALUE(80,000 INR PER TICKET)");
        ob1.setDividend("20% OF CHIT VALUE(20,000 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        ob1.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        ob1.setPaymentfrequency("WEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("500");
        if(null == dailyChitGroupsRepository.findChitGroupByCode(ob1.getCode())){
            dailyChitGroupsRepository.save(ob1);
        }

    }

}
