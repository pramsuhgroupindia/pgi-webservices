package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyAuctionableDurations;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MonthlyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyAuctionableDurationsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MonthlyChitGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MonthlyChitSchemesMocker {

    public void mockMonthlySchemesTableData(MonthlyAuctionableDurationsRepository monthlyAuctionableDurationsRepository,
                                            MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        mockMonthlyAuctionableDurations(monthlyAuctionableDurationsRepository);
        mockMonthlyChitGroups10(monthlyChitGroupsRepository);
        mockMonthlyChitGroups12(monthlyChitGroupsRepository);
        mockMonthlyChitGroups15(monthlyChitGroupsRepository);
        mockMonthlyChitGroups20(monthlyChitGroupsRepository);
        mockMonthlyChitGroups25(monthlyChitGroupsRepository);
        mockMonthlyChitGroups30(monthlyChitGroupsRepository);
        mockMonthlyChitGroups35(monthlyChitGroupsRepository);
        mockMonthlyChitGroups40(monthlyChitGroupsRepository);
        mockMonthlyChitGroups45(monthlyChitGroupsRepository);
        mockMonthlyChitGroups50(monthlyChitGroupsRepository);

    }

    private void mockMonthlyAuctionableDurations(MonthlyAuctionableDurationsRepository monthlyAuctionableDurationsRepository) {
        MonthlyAuctionableDurations monthlyAuctionableDurations = new MonthlyAuctionableDurations();

        monthlyAuctionableDurations.setM10("10 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM10dtoggle("1");

        monthlyAuctionableDurations.setM12("12 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM12dtoggle("0");

        monthlyAuctionableDurations.setM15("15 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM15dtoggle("1");

        monthlyAuctionableDurations.setM20("20 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM20dtoggle("1");

        monthlyAuctionableDurations.setM25("25 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM25dtoggle("1");

        monthlyAuctionableDurations.setM30("30 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM30dtoggle("0");

        monthlyAuctionableDurations.setM35("35 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM35dtoggle("0");

        monthlyAuctionableDurations.setM40("40 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM40dtoggle("0");

        monthlyAuctionableDurations.setM45("45 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM45dtoggle("0");

        monthlyAuctionableDurations.setM50("50 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM50dtoggle("0");

        if (!monthlyAuctionableDurationsRepository.existsById(Integer.toUnsignedLong(1))) {
            monthlyAuctionableDurationsRepository.save(monthlyAuctionableDurations);
        }
    }

    private void mockMonthlyChitGroups10(MonthlyChitGroupsRepository monthlyChitGroupsRepository){
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("10 MONTHS 50,000 INR GROUP (P10M05L01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("10");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("9");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("9");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("OPEN");
        monthlyChitGroups1.setMinBidRange("0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("20% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("40,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("50,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P10M50K01");
        monthlyChitGroups1.setNumberOfTickets("10");
        monthlyChitGroups1.setAmount("5000 INR PER TICKET");
        monthlyChitGroups1.setValue("50,000 INR");
        monthlyChitGroups1.setDuration("10 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("10");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("94.30% OF CHIT VALUE()(47,435 INR PER TICKET)");
        monthlyChitGroups1.setDividend("5.70% OF CHIT VALUE(2,565 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("ZERO GUARANTOR REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }

        MonthlyChitGroups monthlyChitGroups3 = new MonthlyChitGroups();
        monthlyChitGroups3.setMTitle("10 MONTHS 75,000 INR GROUP (P10M01L01)");
        monthlyChitGroups3.setMVisibility("1");
        monthlyChitGroups3.setMTotalNumberOfTickets("10");
        monthlyChitGroups3.setMTotalNumberOfAvailableTickets("9");
        monthlyChitGroups3.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups3.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups3.setMTotalNumberOfAuctions("9");
        monthlyChitGroups3.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups3.setMBookingStatus("OPEN");
        monthlyChitGroups3.setMinBidRange("0% of Chit Value");
        monthlyChitGroups3.setMaxBidRange("20% of Chit Value");
        monthlyChitGroups3.setMinPrizeRange("57,500 Rs");
        monthlyChitGroups3.setMaxPrizeRange("75,000 Rs");
        monthlyChitGroups3.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups3.setCode("P10M75K01");
        monthlyChitGroups3.setNumberOfTickets("10");
        monthlyChitGroups3.setAmount("7,500 INR PER TICKET");
        monthlyChitGroups3.setValue("75,000 INR");
        monthlyChitGroups3.setDuration("10 MONTHS");
        monthlyChitGroups3.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups3.setTotalinstallmentsnumber("10");
        monthlyChitGroups3.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups3.setNoauction("First Auction Goes to Company");
        monthlyChitGroups3.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups3.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups3.setSubscription("94.30% OF CHIT VALUE(70,725 INR PER TICKET)");
        monthlyChitGroups3.setDividend("5.70% OF CHIT VALUE(4,275 INR PER TICKET)");
        monthlyChitGroups3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups3.setEfees("1% OF CHIT VALUE(750 INR PER TICKET)");
        monthlyChitGroups3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups3.setNoofguaranters("ZERO GUARANTOR REQUIRED");
        monthlyChitGroups3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups3.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups3.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups3);
        }

        MonthlyChitGroups monthlyChitGroups2 = new MonthlyChitGroups();
        monthlyChitGroups2.setMTitle("10 MONTHS 1,00,000 INR GROUP (P10M01L01)");
        monthlyChitGroups2.setMVisibility("1");
        monthlyChitGroups2.setMTotalNumberOfTickets("10");
        monthlyChitGroups2.setMTotalNumberOfAvailableTickets("9");
        monthlyChitGroups2.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups2.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups2.setMTotalNumberOfAuctions("9");
        monthlyChitGroups2.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups2.setMBookingStatus("OPEN");
        monthlyChitGroups2.setMinBidRange("0% of Chit Value");
        monthlyChitGroups2.setMaxBidRange("20% of Chit Value");
        monthlyChitGroups2.setMinPrizeRange("80,000 Rs");
        monthlyChitGroups2.setMaxPrizeRange("1,00,000 Rs");
        monthlyChitGroups2.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups2.setCode("P10M01L01");
        monthlyChitGroups2.setNumberOfTickets("10");
        monthlyChitGroups2.setAmount("10,000 INR PER TICKET");
        monthlyChitGroups2.setValue("1,00,000 INR");
        monthlyChitGroups2.setDuration("10 MONTHS");
        monthlyChitGroups2.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups2.setTotalinstallmentsnumber("10");
        monthlyChitGroups2.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups2.setNoauction("First Auction Goes to Company");
        monthlyChitGroups2.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups2.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups2.setSubscription("94.30% OF CHIT VALUE()(94,870 INR PER TICKET)");
        monthlyChitGroups2.setDividend("5.70% OF CHIT VALUE(5,130 INR PER TICKET)");
        monthlyChitGroups2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups2.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        monthlyChitGroups2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups2.setNoofguaranters("ZERO GUARANTOR REQUIRED");
        monthlyChitGroups2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups2.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups2.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups2);
        }
    }

    private void mockMonthlyChitGroups12(MonthlyChitGroupsRepository monthlyChitGroupsRepository){
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("12 MONTHS 60,000 INR GROUP (P12M60K01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("12");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("11");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("11");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("OPEN");
        monthlyChitGroups1.setMinBidRange("0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("42,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("60,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P12M60K01");
        monthlyChitGroups1.setNumberOfTickets("12");
        monthlyChitGroups1.setAmount("5,000 INR PER TICKET");
        monthlyChitGroups1.setValue("60,000 INR");
        monthlyChitGroups1.setDuration("12 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("12");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("90.00% OF CHIT VALUE(54,000 INR PER TICKET)");
        monthlyChitGroups1.setDividend("10.00% OF CHIT VALUE(6,000 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(600 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("12");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
    }

    private void mockMonthlyChitGroups15(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("15 MONTHS 50,000 INR GROUP (P15M50K01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("15");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("14");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("14");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("OPEN");
        monthlyChitGroups1.setMinBidRange("0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("35,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("50,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P15M50K01");
        monthlyChitGroups1.setNumberOfTickets("15");
        monthlyChitGroups1.setAmount("3,334 INR PER TICKET");
        monthlyChitGroups1.setValue("50,000 INR");
        monthlyChitGroups1.setDuration("15 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("15");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.80% OF CHIT VALUE(42,400 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.20% OF CHIT VALUE(7,600 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
        MonthlyChitGroups monthlyChitGroups2 = new MonthlyChitGroups();
        monthlyChitGroups2.setMTitle("15 MONTHS 75,000 INR GROUP (P15M75K01)");
        monthlyChitGroups2.setMVisibility("1");
        monthlyChitGroups2.setMTotalNumberOfTickets("15");
        monthlyChitGroups2.setMTotalNumberOfAvailableTickets("14");
        monthlyChitGroups2.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups2.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups2.setMTotalNumberOfAuctions("14");
        monthlyChitGroups2.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups2.setMBookingStatus("OPEN");
        monthlyChitGroups2.setMinBidRange("0% of Chit Value");
        monthlyChitGroups2.setMaxBidRange("30% of Chit Value");
        monthlyChitGroups2.setMinPrizeRange("52,500 Rs");
        monthlyChitGroups2.setMaxPrizeRange("75,000 Rs");
        monthlyChitGroups2.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups2.setCode("P15M75K01");
        monthlyChitGroups2.setNumberOfTickets("15");
        monthlyChitGroups2.setAmount("5,000 INR PER TICKET");
        monthlyChitGroups2.setValue("75,000 INR");
        monthlyChitGroups2.setDuration("15 MONTHS");
        monthlyChitGroups2.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups2.setTotalinstallmentsnumber("15");
        monthlyChitGroups2.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups2.setNoauction("First Auction Goes to Company");
        monthlyChitGroups2.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups2.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups2.setSubscription("84.80% OF CHIT VALUE(63,600 INR PER TICKET)");
        monthlyChitGroups2.setDividend("15.20% OF CHIT VALUE(11,400 INR PER TICKET)");
        monthlyChitGroups2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups2.setEfees("1% OF CHIT VALUE(750 INR PER TICKET)");
        monthlyChitGroups2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups2.setNoofguaranters("0");
        monthlyChitGroups2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups2.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups2.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups2);
        }
        MonthlyChitGroups monthlyChitGroups3 = new MonthlyChitGroups();
        monthlyChitGroups3.setMTitle("15 MONTHS 1,00,000 INR GROUP (P15M01L01)");
        monthlyChitGroups3.setMVisibility("1");
        monthlyChitGroups3.setMTotalNumberOfTickets("15");
        monthlyChitGroups3.setMTotalNumberOfAvailableTickets("14");
        monthlyChitGroups3.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups3.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups3.setMTotalNumberOfAuctions("14");
        monthlyChitGroups3.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups3.setMBookingStatus("OPEN");
        monthlyChitGroups3.setMinBidRange("0% of Chit Value");
        monthlyChitGroups3.setMaxBidRange("30% of Chit Value");
        monthlyChitGroups3.setMinPrizeRange("70,000 Rs");
        monthlyChitGroups3.setMaxPrizeRange("1,00,000 Rs");
        monthlyChitGroups3.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups3.setCode("P15M01L01");
        monthlyChitGroups3.setNumberOfTickets("15");
        monthlyChitGroups3.setAmount("6,667 INR PER TICKET");
        monthlyChitGroups3.setValue("1,00,000 INR");
        monthlyChitGroups3.setDuration("15 MONTHS");
        monthlyChitGroups3.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups3.setTotalinstallmentsnumber("15");
        monthlyChitGroups3.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups3.setNoauction("First Auction Goes to Company");
        monthlyChitGroups3.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups3.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups3.setSubscription("84.80% OF CHIT VALUE()(84,800 INR PER TICKET)");
        monthlyChitGroups3.setDividend("15.20% OF CHIT VALUE(15,200 INR PER TICKET)");
        monthlyChitGroups3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups3.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        monthlyChitGroups3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups3.setNoofguaranters("0");
        monthlyChitGroups3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups3.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups3.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups3);
        }

    }

    private void mockMonthlyChitGroups20(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        MonthlyChitGroups ob1 = new MonthlyChitGroups();
        ob1.setMTitle("20 MONTHS 50,000 INR GROUP (P20M50K01)");
        ob1.setMVisibility("1");
        ob1.setMTotalNumberOfTickets("20");
        ob1.setMTotalNumberOfAvailableTickets("19");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("19");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("OPEN");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("30% of Chit Value");
        ob1.setMinPrizeRange("35,000 Rs");
        ob1.setMaxPrizeRange("52,500 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P20M50K01");
        ob1.setNumberOfTickets("20");
        ob1.setAmount("2,500 INR PER TICKET");
        ob1.setValue("50,000 INR");
        ob1.setDuration("20 MONTHS");
        ob1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob1.setTotalinstallmentsnumber("20");
        ob1.setDay("Every 4th SUNDAY OF THE MONTH");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every 20th DAY OF MONTH");
        ob1.setDistribution("Every 25th DAY OF MONTH");
        ob1.setFrequency("MONTHLY 1 AUCTION");
        ob1.setSubscription("84.80% OF CHIT VALUE(42,400 INR PER TICKET)");
        ob1.setDividend("15.20% OF CHIT VALUE(7,600 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        ob1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            monthlyChitGroupsRepository.save(ob1);
        }

        MonthlyChitGroups ob2 = new MonthlyChitGroups();
        ob2.setMTitle("20 MONTHS 1,00,000 INR GROUP (P20M01L01)");
        ob2.setMVisibility("1");
        ob2.setMTotalNumberOfTickets("20");
        ob2.setMTotalNumberOfAvailableTickets("19");
        ob2.setMTotalNumberOfBookedTickets("0");
        ob2.setMTotalNumberOfVacantTickets("0");
        ob2.setMTotalNumberOfAuctions("19");
        ob2.setMTotalNumberOfTicketsSold("0");
        ob2.setMBookingStatus("OPEN");
        ob2.setMinBidRange("0% of Chit Value");
        ob2.setMaxBidRange("30% of Chit Value");
        ob2.setMinPrizeRange("70,000 Rs");
        ob2.setMaxPrizeRange("1,05,000 Rs");
        ob2.setMTotalNumberOfAgreementsSigned("0");
        ob2.setCode("P20M01L01");
        ob2.setNumberOfTickets("20");
        ob2.setAmount("5,000 INR PER TICKET");
        ob2.setValue("1,00,000 INR");
        ob2.setDuration("20 MONTHS");
        ob2.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob2.setTotalinstallmentsnumber("20");
        ob2.setDay("Every 4th SUNDAY OF THE MONTH");
        ob2.setNoauction("First Auction Goes to Company");
        ob2.setDueday("Every 20th DAY OF MONTH");
        ob2.setDistribution("Every 25th DAY OF MONTH");
        ob2.setFrequency("MONTHLY 1 AUCTION");
        ob2.setSubscription("84.80% OF CHIT VALUE(84,800 INR PER TICKET)");
        ob2.setDividend("15.20% OF CHIT VALUE(15,200 INR PER TICKET)");
        ob2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob2.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        ob2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob2.setNoofguaranters("0");
        ob2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob2.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob2.getCode())) {
            monthlyChitGroupsRepository.save(ob2);
        }

        MonthlyChitGroups ob3 = new MonthlyChitGroups();
        ob3.setMTitle("20 MONTHS 1,50,000 INR GROUP (P20M1.5L01)");
        ob3.setMVisibility("1");
        ob3.setMTotalNumberOfTickets("20");
        ob3.setMTotalNumberOfAvailableTickets("19");
        ob3.setMTotalNumberOfBookedTickets("0");
        ob3.setMTotalNumberOfVacantTickets("0");
        ob3.setMTotalNumberOfAuctions("19");
        ob3.setMTotalNumberOfTicketsSold("0");
        ob3.setMBookingStatus("OPEN");
        ob3.setMinBidRange("0% of Chit Value");
        ob3.setMaxBidRange("30% of Chit Value");
        ob3.setMinPrizeRange("1,05,000 Rs");
        ob3.setMaxPrizeRange("1,57,500 Rs");
        ob3.setMTotalNumberOfAgreementsSigned("0");
        ob3.setCode("P20M1.5L01");
        ob3.setNumberOfTickets("20");
        ob3.setAmount("7,500 INR PER TICKET");
        ob3.setValue("1,50,000 INR");
        ob3.setDuration("20 MONTHS");
        ob3.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob3.setTotalinstallmentsnumber("20");
        ob3.setDay("Every 4th SUNDAY OF THE MONTH");
        ob3.setNoauction("First Auction Goes to Company");
        ob3.setDueday("Every 20th DAY OF MONTH");
        ob3.setDistribution("Every 25th DAY OF MONTH");
        ob3.setFrequency("MONTHLY 1 AUCTION");
        ob3.setSubscription("84.80% OF CHIT VALUE(1,27,200 INR PER TICKET)");
        ob3.setDividend("15.20% OF CHIT VALUE(22,800 INR PER TICKET)");
        ob3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob3.setEfees("1% OF CHIT VALUE(1,500 INR PER TICKET)");
        ob3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob3.setNoofguaranters("0");
        ob3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob3.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob3.getCode())) {
            monthlyChitGroupsRepository.save(ob3);
        }

        MonthlyChitGroups ob4 = new MonthlyChitGroups();
        ob4.setMTitle("20 MONTHS 2,00,000 INR GROUP (P20M02L01)");
        ob4.setMVisibility("1");
        ob4.setMTotalNumberOfTickets("20");
        ob4.setMTotalNumberOfAvailableTickets("19");
        ob4.setMTotalNumberOfBookedTickets("0");
        ob4.setMTotalNumberOfVacantTickets("0");
        ob4.setMTotalNumberOfAuctions("19");
        ob4.setMTotalNumberOfTicketsSold("0");
        ob4.setMBookingStatus("OPEN");
        ob4.setMinBidRange("0% of Chit Value");
        ob4.setMaxBidRange("30% of Chit Value");
        ob4.setMinPrizeRange("1,40,000 Rs");
        ob4.setMaxPrizeRange("2,10,000 Rs");
        ob4.setMTotalNumberOfAgreementsSigned("0");
        ob4.setCode("P20M02L01");
        ob4.setNumberOfTickets("20");
        ob4.setAmount("10,000 INR PER TICKET");
        ob4.setValue("2,00,000 INR");
        ob4.setDuration("20 MONTHS");
        ob4.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob4.setTotalinstallmentsnumber("20");
        ob4.setDay("Every 4th SUNDAY OF THE MONTH");
        ob4.setNoauction("First Auction Goes to Company");
        ob4.setDueday("Every 20th DAY OF MONTH");
        ob4.setDistribution("Every 25th DAY OF MONTH");
        ob4.setFrequency("MONTHLY 1 AUCTION");
        ob4.setSubscription("84.80% OF CHIT VALUE(1,69,600 INR PER TICKET)");
        ob4.setDividend("15.20% OF CHIT VALUE(30,400 INR PER TICKET)");
        ob4.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob4.setEfees("1% OF CHIT VALUE(2,000 INR PER TICKET)");
        ob4.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob4.setNoofguaranters("0");
        ob4.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob4.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob4.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob4.getCode())) {
            monthlyChitGroupsRepository.save(ob4);
        }

        MonthlyChitGroups ob5 = new MonthlyChitGroups();
        ob5.setMTitle("20 MONTHS 2,50,000 INR GROUP (P20M2.5L01)");
        ob5.setMVisibility("1");
        ob5.setMTotalNumberOfTickets("20");
        ob5.setMTotalNumberOfAvailableTickets("19");
        ob5.setMTotalNumberOfBookedTickets("0");
        ob5.setMTotalNumberOfVacantTickets("0");
        ob5.setMTotalNumberOfAuctions("19");
        ob5.setMTotalNumberOfTicketsSold("0");
        ob5.setMBookingStatus("OPEN");
        ob5.setMinBidRange("0% of Chit Value");
        ob5.setMaxBidRange("30% of Chit Value");
        ob5.setMinPrizeRange("1,75,000 Rs");
        ob5.setMaxPrizeRange("2,62,500 Rs");
        ob5.setMTotalNumberOfAgreementsSigned("0");
        ob5.setCode("P20M2.5L01");
        ob5.setNumberOfTickets("20");
        ob5.setAmount("12,500 INR PER TICKET");
        ob5.setValue("2,50,000 INR");
        ob5.setDuration("20 MONTHS");
        ob5.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob5.setTotalinstallmentsnumber("20");
        ob5.setDay("Every 4th SUNDAY OF THE MONTH");
        ob5.setNoauction("First Auction Goes to Company");
        ob5.setDueday("Every 20th DAY OF MONTH");
        ob5.setDistribution("Every 25th DAY OF MONTH");
        ob5.setFrequency("MONTHLY 1 AUCTION");
        ob5.setSubscription("84.80% OF CHIT VALUE(2,12,000 INR PER TICKET)");
        ob5.setDividend("15.20% OF CHIT VALUE(38,000 INR PER TICKET)");
        ob5.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob5.setEfees("1% OF CHIT VALUE(2,500 INR PER TICKET)");
        ob5.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob5.setNoofguaranters("0");
        ob5.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob5.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob5.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob5.getCode())) {
            monthlyChitGroupsRepository.save(ob5);
        }

        MonthlyChitGroups ob6 = new MonthlyChitGroups();
        ob6.setMTitle("20 MONTHS 3,00,000 INR GROUP (P20M3L01)");
        ob6.setMVisibility("1");
        ob6.setMTotalNumberOfTickets("20");
        ob6.setMTotalNumberOfAvailableTickets("19");
        ob6.setMTotalNumberOfBookedTickets("0");
        ob6.setMTotalNumberOfVacantTickets("0");
        ob6.setMTotalNumberOfAuctions("19");
        ob6.setMTotalNumberOfTicketsSold("0");
        ob6.setMBookingStatus("OPEN");
        ob6.setMinBidRange("0% of Chit Value");
        ob6.setMaxBidRange("30% of Chit Value");
        ob6.setMinPrizeRange("2,10,000 Rs");
        ob6.setMaxPrizeRange("3,15,000 Rs");
        ob6.setMTotalNumberOfAgreementsSigned("0");
        ob6.setCode("P20M03L01");
        ob6.setNumberOfTickets("20");
        ob6.setAmount("15,000 INR PER TICKET");
        ob6.setValue("3,00,000 INR");
        ob6.setDuration("20 MONTHS");
        ob6.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob6.setTotalinstallmentsnumber("20");
        ob6.setDay("Every 4th SUNDAY OF THE MONTH");
        ob6.setNoauction("First Auction Goes to Company");
        ob6.setDueday("Every 20th DAY OF MONTH");
        ob6.setDistribution("Every 25th DAY OF MONTH");
        ob6.setFrequency("MONTHLY 1 AUCTION");
        ob6.setSubscription("84.80% OF CHIT VALUE(2,54,400 INR PER TICKET)");
        ob6.setDividend("15.20% OF CHIT VALUE(45,600 INR PER TICKET)");
        ob6.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob6.setEfees("1% OF CHIT VALUE(3,000 INR PER TICKET)");
        ob6.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob6.setNoofguaranters("0");
        ob6.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob6.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob6.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob6.getCode())) {
            monthlyChitGroupsRepository.save(ob6);
        }

        MonthlyChitGroups ob7 = new MonthlyChitGroups();
        ob7.setMTitle("20 MONTHS 3,50,000 INR GROUP (P20M3.5L01)");
        ob7.setMVisibility("1");
        ob7.setMTotalNumberOfTickets("20");
        ob7.setMTotalNumberOfAvailableTickets("19");
        ob7.setMTotalNumberOfBookedTickets("0");
        ob7.setMTotalNumberOfVacantTickets("0");
        ob7.setMTotalNumberOfAuctions("19");
        ob7.setMTotalNumberOfTicketsSold("0");
        ob7.setMBookingStatus("OPEN");
        ob7.setMinBidRange("0% of Chit Value");
        ob7.setMaxBidRange("30% of Chit Value");
        ob7.setMinPrizeRange("2,45,000 Rs");
        ob7.setMaxPrizeRange("3,62,500 Rs");
        ob7.setMTotalNumberOfAgreementsSigned("0");
        ob7.setCode("P20M3.5L01");
        ob7.setNumberOfTickets("20");
        ob7.setAmount("17,500 INR PER TICKET");
        ob7.setValue("3,50,000 INR");
        ob7.setDuration("20 MONTHS");
        ob7.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob7.setTotalinstallmentsnumber("20");
        ob7.setDay("Every 4th SUNDAY OF THE MONTH");
        ob7.setNoauction("First Auction Goes to Company");
        ob7.setDueday("Every 20th DAY OF MONTH");
        ob7.setDistribution("Every 25th DAY OF MONTH");
        ob7.setFrequency("MONTHLY 1 AUCTION");
        ob7.setSubscription("84.80% OF CHIT VALUE(2,96,800 INR PER TICKET)");
        ob7.setDividend("15.20% OF CHIT VALUE(53,200 INR PER TICKET)");
        ob7.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob7.setEfees("1% OF CHIT VALUE(3,500 INR PER TICKET)");
        ob7.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob7.setNoofguaranters("0");
        ob7.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob7.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob7.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob7.getCode())) {
            monthlyChitGroupsRepository.save(ob7);
        }

        MonthlyChitGroups ob8 = new MonthlyChitGroups();
        ob8.setMTitle("20 MONTHS 4,00,000 INR GROUP (P20M04L01)");
        ob8.setMVisibility("1");
        ob8.setMTotalNumberOfTickets("20");
        ob8.setMTotalNumberOfAvailableTickets("19");
        ob8.setMTotalNumberOfBookedTickets("0");
        ob8.setMTotalNumberOfVacantTickets("0");
        ob8.setMTotalNumberOfAuctions("19");
        ob8.setMTotalNumberOfTicketsSold("0");
        ob8.setMBookingStatus("OPEN");
        ob8.setMinBidRange("0% of Chit Value");
        ob8.setMaxBidRange("30% of Chit Value");
        ob8.setMinPrizeRange("2,80,000 Rs");
        ob8.setMaxPrizeRange("4,20,000 Rs");
        ob8.setMTotalNumberOfAgreementsSigned("0");
        ob8.setCode("P20M04L01");
        ob8.setNumberOfTickets("20");
        ob8.setAmount("20,000 INR PER TICKET");
        ob8.setValue("4,00,000 INR");
        ob8.setDuration("20 MONTHS");
        ob8.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob8.setTotalinstallmentsnumber("20");
        ob8.setDay("Every 4th SUNDAY OF THE MONTH");
        ob8.setNoauction("First Auction Goes to Company");
        ob8.setDueday("Every 20th DAY OF MONTH");
        ob8.setDistribution("Every 25th DAY OF MONTH");
        ob8.setFrequency("MONTHLY 1 AUCTION");
        ob8.setSubscription("84.80% OF CHIT VALUE(3,39,200 INR PER TICKET)");
        ob8.setDividend("15.20% OF CHIT VALUE(60,800 INR PER TICKET)");
        ob8.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob8.setEfees("1% OF CHIT VALUE(4,000 INR PER TICKET)");
        ob8.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob8.setNoofguaranters("0");
        ob8.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob8.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob8.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob8.getCode())) {
            monthlyChitGroupsRepository.save(ob8);
        }

        MonthlyChitGroups ob9 = new MonthlyChitGroups();
        ob9.setMTitle("20 MONTHS 4,50,000 INR GROUP (P20M4.5L01)");
        ob9.setMVisibility("1");
        ob9.setMTotalNumberOfTickets("20");
        ob9.setMTotalNumberOfAvailableTickets("19");
        ob9.setMTotalNumberOfBookedTickets("0");
        ob9.setMTotalNumberOfVacantTickets("0");
        ob9.setMTotalNumberOfAuctions("19");
        ob9.setMTotalNumberOfTicketsSold("0");
        ob9.setMBookingStatus("OPEN");
        ob9.setMinBidRange("0% of Chit Value");
        ob9.setMaxBidRange("30% of Chit Value");
        ob9.setMinPrizeRange("3,15,000 Rs");
        ob9.setMaxPrizeRange("4,72,500 Rs");
        ob9.setMTotalNumberOfAgreementsSigned("0");
        ob9.setCode("P20M4.5L01");
        ob9.setNumberOfTickets("20");
        ob9.setAmount("20,000 INR PER TICKET");
        ob9.setValue("4,50,000 INR");
        ob9.setDuration("20 MONTHS");
        ob9.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob9.setTotalinstallmentsnumber("20");
        ob9.setDay("Every 4th SUNDAY OF THE MONTH");
        ob9.setNoauction("First Auction Goes to Company");
        ob9.setDueday("Every 20th DAY OF MONTH");
        ob9.setDistribution("Every 25th DAY OF MONTH");
        ob9.setFrequency("MONTHLY 1 AUCTION");
        ob9.setSubscription("84.80% OF CHIT VALUE(3,81,600 INR PER TICKET)");
        ob9.setDividend("15.20% OF CHIT VALUE(68,400 INR PER TICKET)");
        ob9.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob9.setEfees("1% OF CHIT VALUE(4,500 INR PER TICKET)");
        ob9.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob9.setNoofguaranters("0");
        ob9.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob9.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob9.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob9.getCode())) {
            monthlyChitGroupsRepository.save(ob9);
        }
        MonthlyChitGroups ob10 = new MonthlyChitGroups();
        ob10.setMTitle("20 MONTHS 5,00,000 INR GROUP (P20M05L01)");
        ob10.setMVisibility("1");
        ob10.setMTotalNumberOfTickets("20");
        ob10.setMTotalNumberOfAvailableTickets("10");
        ob10.setMTotalNumberOfBookedTickets("9");
        ob10.setMTotalNumberOfVacantTickets("0");
        ob10.setMTotalNumberOfAuctions("19");
        ob10.setMTotalNumberOfTicketsSold("9");
        ob10.setMBookingStatus("OPEN");
        ob10.setMinBidRange("0% of Chit Value");
        ob10.setMaxBidRange("30% of Chit Value");
        ob10.setMinPrizeRange("3,50,000 Rs");
        ob10.setMaxPrizeRange("5,25,000 Rs");
        ob10.setMTotalNumberOfAgreementsSigned("9");
        ob10.setCode("P20M05L01");
        ob10.setNumberOfTickets("20");
        ob10.setAmount("25000 INR PER TICKET");
        ob10.setValue("5,00,000 INR");
        ob10.setDuration("20 MONTHS");
        ob10.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob10.setTotalinstallmentsnumber("20");
        ob10.setDay("Every 4th SUNDAY OF THE MONTH");
        ob10.setNoauction("First Auction Goes to Company");
        ob10.setDueday("Every 20th DAY OF MONTH");
        ob10.setDistribution("Every 25th DAY OF MONTH");
        ob10.setFrequency("MONTHLY 1 AUCTION");
        ob10.setSubscription("84.80% OF CHIT VALUE()(4,24,000 INR PER TICKET)");
        ob10.setDividend("15.20% OF CHIT VALUE(76,000 INR PER TICKET)");
        ob10.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob10.setEfees("1% OF CHIT VALUE(5000 INR PER TICKET)");
        ob10.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob10.setNoofguaranters("0");
        ob10.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob10.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob10.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob10.getCode())) {
            monthlyChitGroupsRepository.save(ob10);
        }
    }

    private void mockMonthlyChitGroups25(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups ob1 = new MonthlyChitGroups();
        ob1.setMTitle("25 MONTHS 1,00,000 INR GROUP (P25M01L01)");
        ob1.setMVisibility("1");
        ob1.setMTotalNumberOfTickets("25");
        ob1.setMTotalNumberOfAvailableTickets("24");
        ob1.setMTotalNumberOfBookedTickets("0");
        ob1.setMTotalNumberOfVacantTickets("0");
        ob1.setMTotalNumberOfAuctions("24");
        ob1.setMTotalNumberOfTicketsSold("0");
        ob1.setMBookingStatus("OPEN");
        ob1.setMinBidRange("0% of Chit Value");
        ob1.setMaxBidRange("30% of Chit Value");
        ob1.setMinPrizeRange("70,000 Rs");
        ob1.setMaxPrizeRange("1,00,000 Rs");
        ob1.setMTotalNumberOfAgreementsSigned("0");
        ob1.setCode("P25M01L01");
        ob1.setNumberOfTickets("25");
        ob1.setAmount("4000 INR PER TICKET");
        ob1.setValue("1,00,000 INR");
        ob1.setDuration("25 MONTHS");
        ob1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob1.setTotalinstallmentsnumber("25");
        ob1.setDay("Every 4th SUNDAY OF THE MONTH");
        ob1.setNoauction("First Auction Goes to Company");
        ob1.setDueday("Every 20th DAY OF MONTH");
        ob1.setDistribution("Every 25th DAY OF MONTH");
        ob1.setFrequency("MONTHLY 1 AUCTION");
        ob1.setSubscription("84.52% OF CHIT VALUE(84,520 INR PER TICKET)");
        ob1.setDividend("15.48% OF CHIT VALUE(15,480 INR PER TICKET)");
        ob1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob1.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        ob1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob1.setNoofguaranters("0");
        ob1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob1.setRollid("25");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob1.getCode())) {
            monthlyChitGroupsRepository.save(ob1);
        }

        MonthlyChitGroups ob2 = new MonthlyChitGroups();
        ob2.setMTitle("25 MONTHS 3,00,000 INR GROUP (P25M03L01)");
        ob2.setMVisibility("1");
        ob2.setMTotalNumberOfTickets("25");
        ob2.setMTotalNumberOfAvailableTickets("24");
        ob2.setMTotalNumberOfBookedTickets("0");
        ob2.setMTotalNumberOfVacantTickets("0");
        ob2.setMTotalNumberOfAuctions("24");
        ob2.setMTotalNumberOfTicketsSold("0");
        ob2.setMBookingStatus("OPEN");
        ob2.setMinBidRange("0% of Chit Value");
        ob2.setMaxBidRange("30% of Chit Value");
        ob2.setMinPrizeRange("2,10,000 Rs");
        ob2.setMaxPrizeRange("3,00,000 Rs");
        ob2.setMTotalNumberOfAgreementsSigned("0");
        ob2.setCode("P25M03L01");
        ob2.setNumberOfTickets("25");
        ob2.setAmount("12,500 INR PER TICKET");
        ob2.setValue("3,00,000 INR");
        ob2.setDuration("25 MONTHS");
        ob2.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob2.setTotalinstallmentsnumber("25");
        ob2.setDay("Every 4th SUNDAY OF THE MONTH");
        ob2.setNoauction("First Auction Goes to Company");
        ob2.setDueday("Every 20th DAY OF MONTH");
        ob2.setDistribution("Every 25th DAY OF MONTH");
        ob2.setFrequency("MONTHLY 1 AUCTION");
        ob2.setSubscription("84.52% OF CHIT VALUE(2,53,560 INR PER TICKET)");
        ob2.setDividend("15.48% OF CHIT VALUE(46,440 INR PER TICKET)");
        ob2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob2.setEfees("1% OF CHIT VALUE(3,000 INR PER TICKET)");
        ob2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob2.setNoofguaranters("0");
        ob2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob2.setRollid("25");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob2.getCode())) {
            monthlyChitGroupsRepository.save(ob2);
        }

        MonthlyChitGroups ob3 = new MonthlyChitGroups();
        ob3.setMTitle("25 MONTHS 5,00,000 INR GROUP (P25M05L01)");
        ob3.setMVisibility("1");
        ob3.setMTotalNumberOfTickets("25");
        ob3.setMTotalNumberOfAvailableTickets("24");
        ob3.setMTotalNumberOfBookedTickets("0");
        ob3.setMTotalNumberOfVacantTickets("0");
        ob3.setMTotalNumberOfAuctions("24");
        ob3.setMTotalNumberOfTicketsSold("0");
        ob3.setMBookingStatus("OPEN");
        ob3.setMinBidRange("0% of Chit Value");
        ob3.setMaxBidRange("30% of Chit Value");
        ob3.setMinPrizeRange("3,50,000 Rs");
        ob3.setMaxPrizeRange("5,12,500 Rs");
        ob3.setMTotalNumberOfAgreementsSigned("0");
        ob3.setCode("P25M05L01");
        ob3.setNumberOfTickets("25");
        ob3.setAmount("20,000 INR PER TICKET");
        ob3.setValue("5,00,000 INR");
        ob3.setDuration("25 MONTHS");
        ob3.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob3.setTotalinstallmentsnumber("25");
        ob3.setDay("Every 4th SUNDAY OF THE MONTH");
        ob3.setNoauction("First Auction Goes to Company");
        ob3.setDueday("Every 20th DAY OF MONTH");
        ob3.setDistribution("Every 25th DAY OF MONTH");
        ob3.setFrequency("MONTHLY 1 AUCTION");
        ob3.setSubscription("84.52% OF CHIT VALUE(4,22,600 INR PER TICKET)");
        ob3.setDividend("15.48% OF CHIT VALUE(77,400 INR PER TICKET)");
        ob3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob3.setEfees("1% OF CHIT VALUE(5,000 INR PER TICKET)");
        ob3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob3.setNoofguaranters("0");
        ob3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob3.setRollid("25");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob3.getCode())) {
            monthlyChitGroupsRepository.save(ob3);
        }

        MonthlyChitGroups ob4 = new MonthlyChitGroups();
        ob4.setMTitle("25 MONTHS 10,00,000 INR GROUP (P25M05L01)");
        ob4.setMVisibility("1");
        ob4.setMTotalNumberOfTickets("25");
        ob4.setMTotalNumberOfAvailableTickets("20");
        ob4.setMTotalNumberOfBookedTickets("4");
        ob4.setMTotalNumberOfVacantTickets("0");
        ob4.setMTotalNumberOfAuctions("24");
        ob4.setMTotalNumberOfTicketsSold("4");
        ob4.setMBookingStatus("OPEN");
        ob4.setMinBidRange("0% of Chit Value");
        ob4.setMaxBidRange("30% of Chit Value");
        ob4.setMinPrizeRange("7,00,000 Rs");
        ob4.setMaxPrizeRange("10,25,000 Rs");
        ob4.setMTotalNumberOfAgreementsSigned("4");
        ob4.setCode("P25M10L01");
        ob4.setNumberOfTickets("25");
        ob4.setAmount("40,000 INR PER TICKET");
        ob4.setValue("10,00,000 INR");
        ob4.setDuration("25 MONTHS");
        ob4.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        ob4.setTotalinstallmentsnumber("25");
        ob4.setDay("Every 4th SUNDAY OF THE MONTH");
        ob4.setNoauction("First Auction Goes to Company");
        ob4.setDueday("Every 20th DAY OF MONTH");
        ob4.setDistribution("Every 25th DAY OF MONTH");
        ob4.setFrequency("MONTHLY 1 AUCTION");
        ob4.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        ob4.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        ob4.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        ob4.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        ob4.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        ob4.setNoofguaranters("0");
        ob4.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        ob4.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        ob4.setRollid("25");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(ob4.getCode())) {
            monthlyChitGroupsRepository.save(ob4);
        }
    }

    private void mockMonthlyChitGroups30(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("30 MONTHS 10,00,000 INR GROUP (P30M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("30");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("29");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("29");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("SCHEDULED");
        monthlyChitGroups1.setMinBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMinPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P30M10L01");
        monthlyChitGroups1.setNumberOfTickets("30");
        monthlyChitGroups1.setAmount("33,334 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("30 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("30");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("TO BE DECIDED");
        monthlyChitGroups1.setDistribution("TO BE DECIDED");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("TO BE DECIDED");
        monthlyChitGroups1.setDividend("TO BE DECIDED");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("30");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }


    }

    private void mockMonthlyChitGroups35(MonthlyChitGroupsRepository monthlyChitGroupsRepository){
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("35 MONTHS 10,00,000 INR GROUP (P35M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("35");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("34");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("34");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("SCHEDULED");
        monthlyChitGroups1.setMinBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMinPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P35M10L01");
        monthlyChitGroups1.setNumberOfTickets("35");
        monthlyChitGroups1.setAmount("28,572 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("35 MONTHS");
        monthlyChitGroups1.setTime("TO BE DECIDEDWILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("35");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("TO BE DECIDED");
        monthlyChitGroups1.setDistribution("TO BE DECIDED");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("TO BE DECIDED");
        monthlyChitGroups1.setDividend("TO BE DECIDED");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("35");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
    }

    private void mockMonthlyChitGroups40(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("40 MONTHS 10,00,000 INR GROUP (P40M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("40");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("39");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("39");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("SCHEDULED");
        monthlyChitGroups1.setMinBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMinPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P40M10L01");
        monthlyChitGroups1.setNumberOfTickets("40");
        monthlyChitGroups1.setAmount("25,000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("40 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("40");
        monthlyChitGroups1.setDay("Every 4th SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("TO BE DECIDED");
        monthlyChitGroups1.setDistribution("TO BE DECIDED");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("TO BE DECIDED");
        monthlyChitGroups1.setDividend("TO BE DECIDED");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("40");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }


    }

    private void mockMonthlyChitGroups45(MonthlyChitGroupsRepository monthlyChitGroupsRepository){
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("45 MONTHS 10,00,000 INR GROUP (P45M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("45");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("44");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("44");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("SCHEDULED");
        monthlyChitGroups1.setMinBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMinPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P45M10L01");
        monthlyChitGroups1.setNumberOfTickets("45");
        monthlyChitGroups1.setAmount("22,223 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("45 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("45");
        monthlyChitGroups1.setDay("EVERY 4TH SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("TO BE DECIDED");
        monthlyChitGroups1.setDistribution("TO BE DECIDED");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("TO BE DECIDED");
        monthlyChitGroups1.setDividend("TO BE DECIDED");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("45");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
    }

    private void mockMonthlyChitGroups50(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("50 MONTHS 10,00,000 INR GROUP (P50M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("50");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("49");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("49");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("0");
        monthlyChitGroups1.setMBookingStatus("SCHEDULED");
        monthlyChitGroups1.setMinBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxBidRange("TO BE DECIDED");
        monthlyChitGroups1.setMinPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMaxPrizeRange("TO BE DECIDED");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("0");
        monthlyChitGroups1.setCode("P50M10L01");
        monthlyChitGroups1.setNumberOfTickets("50");
        monthlyChitGroups1.setAmount("20,000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("50 MONTHS");
        monthlyChitGroups1.setTime("WILL BE INFORMED BEFORE SECCOND AUCTION");
        monthlyChitGroups1.setTotalinstallmentsnumber("50");
        monthlyChitGroups1.setDay("EVERY 4TH SUNDAY OF THE MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("TO BE DECIDED");
        monthlyChitGroups1.setDistribution("TO BE DECIDED");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("TO BE DECIDED");
        monthlyChitGroups1.setDividend("TO BE DECIDED");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("0");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("50");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }

    }
}