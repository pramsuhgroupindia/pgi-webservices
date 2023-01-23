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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 10");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 9");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 9");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 40,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P10M50K01");
        monthlyChitGroups1.setNumberOfTickets("10");
        monthlyChitGroups1.setAmount("5000 INR PER TICKET");
        monthlyChitGroups1.setValue("50,000 INR");
        monthlyChitGroups1.setDuration("10 MONTHS");
        monthlyChitGroups1.setTime("02:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("10");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("94.30% OF CHIT VALUE()(47,435 INR PER TICKET)");
        monthlyChitGroups1.setDividend("5.70% OF CHIT VALUE(2,565 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("ONE GUARANTOR IS REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }

        MonthlyChitGroups monthlyChitGroups3 = new MonthlyChitGroups();
        monthlyChitGroups3.setMTitle("10 MONTHS 75,000 INR GROUP (P10M01L01)");
        monthlyChitGroups3.setMVisibility("1");
        monthlyChitGroups3.setMTotalNumberOfTickets("Total Tickets: 10");
        monthlyChitGroups3.setMTotalNumberOfAvailableTickets("Total Available Tickets: 9");
        monthlyChitGroups3.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups3.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups3.setMTotalNumberOfAuctions("Total  Auctions: 9");
        monthlyChitGroups3.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups3.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups3.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups3.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        monthlyChitGroups3.setMinPrizeRange("Minimum Prize: 57,500 Rs");
        monthlyChitGroups3.setMaxPrizeRange("Maximum Prize: 75,000 Rs");
        monthlyChitGroups3.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups3.setCode("P10M75K01");
        monthlyChitGroups3.setNumberOfTickets("10");
        monthlyChitGroups3.setAmount("7,500 INR PER TICKET");
        monthlyChitGroups3.setValue("75,000 INR");
        monthlyChitGroups3.setDuration("10 MONTHS");
        monthlyChitGroups3.setTime("02:20 PM");
        monthlyChitGroups3.setTotalinstallmentsnumber("10");
        monthlyChitGroups3.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setNoauction("First Auction Goes to Company");
        monthlyChitGroups3.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups3.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups3.setSubscription("94.30% OF CHIT VALUE(70,725 INR PER TICKET)");
        monthlyChitGroups3.setDividend("5.70% OF CHIT VALUE(4,275 INR PER TICKET)");
        monthlyChitGroups3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups3.setEfees("1% OF CHIT VALUE(750 INR PER TICKET)");
        monthlyChitGroups3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups3.setNoofguaranters("ONE GUARANTOR IS REQUIRED");
        monthlyChitGroups3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups3.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups3.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups3);
        }

        MonthlyChitGroups monthlyChitGroups2 = new MonthlyChitGroups();
        monthlyChitGroups2.setMTitle("10 MONTHS 1,00,000 INR GROUP (P10M01L01)");
        monthlyChitGroups2.setMVisibility("1");
        monthlyChitGroups2.setMTotalNumberOfTickets("Total Tickets: 10");
        monthlyChitGroups2.setMTotalNumberOfAvailableTickets("Total Available Tickets: 9");
        monthlyChitGroups2.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups2.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups2.setMTotalNumberOfAuctions("Total  Auctions: 9");
        monthlyChitGroups2.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups2.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups2.setMaxBidRange("Maximum Bid%: 20% of Chit Value");
        monthlyChitGroups2.setMinPrizeRange("Minimum Prize: 80,000 Rs");
        monthlyChitGroups2.setMaxPrizeRange("Maximum Prize: 1,00,000 Rs");
        monthlyChitGroups2.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups2.setCode("P10M01L01");
        monthlyChitGroups2.setNumberOfTickets("10");
        monthlyChitGroups2.setAmount("10,000 INR PER TICKET");
        monthlyChitGroups2.setValue("1,00,000 INR");
        monthlyChitGroups2.setDuration("10 MONTHS");
        monthlyChitGroups2.setTime("02:10 PM");
        monthlyChitGroups2.setTotalinstallmentsnumber("10");
        monthlyChitGroups2.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setNoauction("First Auction Goes to Company");
        monthlyChitGroups2.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups2.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups2.setSubscription("94.30% OF CHIT VALUE()(94,870 INR PER TICKET)");
        monthlyChitGroups2.setDividend("5.70% OF CHIT VALUE(5,130 INR PER TICKET)");
        monthlyChitGroups2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups2.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        monthlyChitGroups2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups2.setNoofguaranters("ONE GUARANTOR IS REQUIRED");
        monthlyChitGroups2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups2.setRollid("10");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups2.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups2);
        }
    }

    private void mockMonthlyChitGroups12(MonthlyChitGroupsRepository monthlyChitGroupsRepository){
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("12 MONTHS 5,00,000 INR GROUP (P12M05L01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 15");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 14");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 14");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 14");
        monthlyChitGroups1.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 3,50,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 5,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 15");
        monthlyChitGroups1.setCode("P12M05L01");
        monthlyChitGroups1.setNumberOfTickets("15");
        monthlyChitGroups1.setAmount("25000 INR PER TICKET");
        monthlyChitGroups1.setValue("5,00,000 INR");
        monthlyChitGroups1.setDuration("15 MONTHS");
        monthlyChitGroups1.setTime("02:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("15");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.80% OF CHIT VALUE()(4,24,000 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.20% OF CHIT VALUE(76,000 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(5000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("THREE GUARANTORS ARE REQUIRED");
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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 15");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 14");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 14");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 35,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P15M50K01");
        monthlyChitGroups1.setNumberOfTickets("15");
        monthlyChitGroups1.setAmount("3,334 INR PER TICKET");
        monthlyChitGroups1.setValue("50,000 INR");
        monthlyChitGroups1.setDuration("15 MONTHS");
        monthlyChitGroups1.setTime("03:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("15");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.80% OF CHIT VALUE(42,400 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.20% OF CHIT VALUE(7,600 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(500 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("THREE GUARANTORS ARE REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
        MonthlyChitGroups monthlyChitGroups2 = new MonthlyChitGroups();
        monthlyChitGroups2.setMTitle("15 MONTHS 75,000 INR GROUP (P15M75K01)");
        monthlyChitGroups2.setMVisibility("1");
        monthlyChitGroups2.setMTotalNumberOfTickets("Total Tickets: 15");
        monthlyChitGroups2.setMTotalNumberOfAvailableTickets("Total Available Tickets: 14");
        monthlyChitGroups2.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups2.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups2.setMTotalNumberOfAuctions("Total  Auctions: 14");
        monthlyChitGroups2.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups2.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups2.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups2.setMinPrizeRange("Minimum Prize: 52,500 Rs");
        monthlyChitGroups2.setMaxPrizeRange("Maximum Prize: 75,000 Rs");
        monthlyChitGroups2.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups2.setCode("P15M75K01");
        monthlyChitGroups2.setNumberOfTickets("15");
        monthlyChitGroups2.setAmount("5,000 INR PER TICKET");
        monthlyChitGroups2.setValue("75,000 INR");
        monthlyChitGroups2.setDuration("15 MONTHS");
        monthlyChitGroups2.setTime("03:10 PM");
        monthlyChitGroups2.setTotalinstallmentsnumber("15");
        monthlyChitGroups2.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setNoauction("First Auction Goes to Company");
        monthlyChitGroups2.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups2.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups2.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups2.setSubscription("84.80% OF CHIT VALUE(63,600 INR PER TICKET)");
        monthlyChitGroups2.setDividend("15.20% OF CHIT VALUE(11,400 INR PER TICKET)");
        monthlyChitGroups2.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups2.setEfees("1% OF CHIT VALUE(750 INR PER TICKET)");
        monthlyChitGroups2.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups2.setNoofguaranters("THREE GUARANTORS ARE REQUIRED");
        monthlyChitGroups2.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups2.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups2.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups2.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups2);
        }
        MonthlyChitGroups monthlyChitGroups3 = new MonthlyChitGroups();
        monthlyChitGroups3.setMTitle("15 MONTHS 1,00,000 INR GROUP (P15M01L01)");
        monthlyChitGroups3.setMVisibility("0");
        monthlyChitGroups3.setMTotalNumberOfTickets("Total Tickets: 15");
        monthlyChitGroups3.setMTotalNumberOfAvailableTickets("Total Available Tickets: 14");
        monthlyChitGroups3.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups3.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups3.setMTotalNumberOfAuctions("Total  Auctions: 14");
        monthlyChitGroups3.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups3.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups3.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups3.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups3.setMinPrizeRange("Minimum Prize: 70,000 Rs");
        monthlyChitGroups3.setMaxPrizeRange("Maximum Prize: 1,00,000 Rs");
        monthlyChitGroups3.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups3.setCode("P15M01L01");
        monthlyChitGroups3.setNumberOfTickets("15");
        monthlyChitGroups3.setAmount("6,667 INR PER TICKET");
        monthlyChitGroups3.setValue("1,00,000 INR");
        monthlyChitGroups3.setDuration("15 MONTHS");
        monthlyChitGroups3.setTime("03:30 PM");
        monthlyChitGroups3.setTotalinstallmentsnumber("15");
        monthlyChitGroups3.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setNoauction("First Auction Goes to Company");
        monthlyChitGroups3.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups3.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups3.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups3.setSubscription("84.80% OF CHIT VALUE()(84,800 INR PER TICKET)");
        monthlyChitGroups3.setDividend("15.20% OF CHIT VALUE(15,200 INR PER TICKET)");
        monthlyChitGroups3.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups3.setEfees("1% OF CHIT VALUE(1,000 INR PER TICKET)");
        monthlyChitGroups3.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups3.setNoofguaranters("THREE GUARANTORS ARE REQUIRED");
        monthlyChitGroups3.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups3.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups3.setRollid("15");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups3.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups3);
        }

    }

    private void mockMonthlyChitGroups20(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("20 MONTHS 5,00,000 INR GROUP (P20M05L01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 20");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 10");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 9");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 19");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 9");
        monthlyChitGroups1.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 3,50,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 5,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 15");
        monthlyChitGroups1.setCode("P20M05L01");
        monthlyChitGroups1.setNumberOfTickets("20");
        monthlyChitGroups1.setAmount("25000 INR PER TICKET");
        monthlyChitGroups1.setValue("5,00,000 INR");
        monthlyChitGroups1.setDuration("20 MONTHS");
        monthlyChitGroups1.setTime("04:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("20");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.80% OF CHIT VALUE()(4,24,000 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.20% OF CHIT VALUE(76,000 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(5000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("THREE GUARANTORS ARE REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("20");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }
    }

    private void mockMonthlyChitGroups25(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("25 MONTHS 10,00,000 INR GROUP (P25M10L01)");
        monthlyChitGroups1.setMVisibility("1");
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 25");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 20");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 4");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 24");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 4");
        monthlyChitGroups1.setMBookingStatus("Booking: OPEN");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 4");
        monthlyChitGroups1.setCode("P25M10L01");
        monthlyChitGroups1.setNumberOfTickets("20");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("25 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("25");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("25");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }

    }

    private void mockMonthlyChitGroups30(MonthlyChitGroupsRepository monthlyChitGroupsRepository) {
        MonthlyChitGroups monthlyChitGroups1 = new MonthlyChitGroups();
        monthlyChitGroups1.setMTitle("30 MONTHS 10,00,000 INR GROUP (P30M10L01)");
        monthlyChitGroups1.setMVisibility("0");
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 30");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P30M10L01");
        monthlyChitGroups1.setNumberOfTickets("30");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("30 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("30");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW IN AUCTION HOUSE WITH PRESENCE OF ALL SUBSCRIBERS");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 30");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 29");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 29");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P35M10L01");
        monthlyChitGroups1.setNumberOfTickets("30");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("30 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("30");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 40");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 39");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 39");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P40M10L01");
        monthlyChitGroups1.setNumberOfTickets("40");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("40 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("40");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 40");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 39");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 39");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P45M10L01");
        monthlyChitGroups1.setNumberOfTickets("40");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("40 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("40");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
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
        monthlyChitGroups1.setMTotalNumberOfTickets("Total Tickets: 50");
        monthlyChitGroups1.setMTotalNumberOfAvailableTickets("Total Available Tickets: 49");
        monthlyChitGroups1.setMTotalNumberOfBookedTickets("Total Booked Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfVacantTickets("Total Vacant Tickets: 0");
        monthlyChitGroups1.setMTotalNumberOfAuctions("Total  Auctions: 49");
        monthlyChitGroups1.setMTotalNumberOfTicketsSold("Total Tickets Sold: 0");
        monthlyChitGroups1.setMBookingStatus("Booking: SCHEDULED");
        monthlyChitGroups1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        monthlyChitGroups1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        monthlyChitGroups1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        monthlyChitGroups1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        monthlyChitGroups1.setMTotalNumberOfAgreementsSigned("Total Agreements Signed: 0");
        monthlyChitGroups1.setCode("P50M10L01");
        monthlyChitGroups1.setNumberOfTickets("50");
        monthlyChitGroups1.setAmount("40000 INR PER TICKET");
        monthlyChitGroups1.setValue("10,00,000 INR");
        monthlyChitGroups1.setDuration("50 MONTHS");
        monthlyChitGroups1.setTime("06:00 PM");
        monthlyChitGroups1.setTotalinstallmentsnumber("50");
        monthlyChitGroups1.setDay("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setNoauction("First Auction Goes to Company");
        monthlyChitGroups1.setDueday("Every 20th DAY OF MONTH");
        monthlyChitGroups1.setDistribution("Every 25th DAY OF MONTH");
        monthlyChitGroups1.setFrequency("MONTHLY 1 AUCTION");
        monthlyChitGroups1.setSubscription("84.52% OF CHIT VALUE(8,45,200 INR PER TICKET)");
        monthlyChitGroups1.setDividend("15.48% OF CHIT VALUE(1,54,800 INR PER TICKET)");
        monthlyChitGroups1.setMethod("LUCKY DRAW ON COMPANY MOBILE APP");
        monthlyChitGroups1.setEfees("1% OF CHIT VALUE(10,000 INR PER TICKET)");
        monthlyChitGroups1.setPaymentfrequency("MONTHLY, DAILY, WEEKLY, BIWEEKLY");
        monthlyChitGroups1.setNoofguaranters("FOUR GUARANTORS ARE REQUIRED");
        monthlyChitGroups1.setJoiningdocs("AADHAAR CARD, PAN CARD, ADDRESS PROOF");
        monthlyChitGroups1.setPrizeclaimdocs("INCOME PROOF, BANK STATEMENT, 3 SIGNED CHEQUES, 3 SIGNED PROMISSORY NOTES");
        monthlyChitGroups1.setRollid("50");
        if (null == monthlyChitGroupsRepository.findChitGroupByCode(monthlyChitGroups1.getCode())) {
            monthlyChitGroupsRepository.save(monthlyChitGroups1);
        }

    }
}
