package com.pramsuh.chits.onboarding.admin.panel.application;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.*;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AdminDataRepo;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.commons.mobiledatarepositories.UserContactsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.LocationRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SignupDetailsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PramsuhWebservicesApplication implements CommandLineRunner {

    @Autowired
    private AdminDataRepo adminDataRepo;
    @Autowired
    private SignupDetailsRepository signupDetailsRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private UserContactsRepository userContactsRepository;

    @Autowired
    private AuctionableSchemesRepository auctionableSchemesRepository;

    @Autowired
    private WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository;

    @Autowired
    private MonthlyAuctionableDurationsRepository monthlyAuctionableDurationsRepository;

    @Autowired
    LocationRepository locationRepository;
    @Autowired
    private ChitGroup50KRepository chitGroup50KRepository;
    @Autowired
    private ChitGroup5LakhsRepository chitGroup5LakhsRepository;
    @Autowired
    private ChitGroup10LakhsRepository chitGroup10LakhsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PramsuhWebservicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mock2();
        mock3();
    }

    public void mock1(){
        /*ArrayList<ChitGroup50000Rs> cg50k20w_list = new ArrayList<>();

        AdminData adminData = new AdminData();

        ScreenData screenData = new ScreenData();

        ScreenDataStatistics screenDataStatistics = new ScreenDataStatistics();
        screenDataStatistics.setTitle("ScreenDataStatistics");
        screenDataStatistics.setMNumofCatPlanned("6");
        screenDataStatistics.setMNumofCatPublished("2");
        screenDataStatistics.setMNumOfCatStarted("2");
        screenDataStatistics.setMVisibility("VISIBLE");
        screenDataStatistics.setMTotalNumberOfTickets("500");
        screenDataStatistics.setMTotalNumberOfAvailableTickets("500");
        screenDataStatistics.setMTotalNumberOfVacantTickets("500");
        screenDataStatistics.setMTotalNumberOfBookedTickets("0");
        screenDataStatistics.setMTotalNumberOfAuctions("500");
        screenDataStatistics.setMTotalNumberOfAgreementsSigned("0");
        screenDataStatistics.setMTotalNumberOfTicketsSold("0");
        screenDataStatistics.setMBookingStatus("OPEN");
        screenDataStatistics.setMinBidRange("0% Of Chit Value");
        screenDataStatistics.setMaxBidRange("30% Of Chit Value");
        screenDataStatistics.setMinPrizeRange("70% Of Chit Value");
        screenDataStatistics.setMaxPrizeRange("100% Of Chit Value");

        Screen screen = new Screen();

        WACS_SCREEN wacsScreen = new WACS_SCREEN();

        Wacs_Screen_CGCategories wacsScreenCgCategories = new Wacs_Screen_CGCategories();

        Wacs_Screen_Statistics wacsScreenStatistics = new Wacs_Screen_Statistics();
        wacsScreenStatistics.setMTitle("Wacs_Screen_Statistics");
        wacsScreenStatistics.setMVisibility("VISIBLE");
        wacsScreenStatistics.setMTotalNumberOfTickets("200");
        wacsScreenStatistics.setMTotalNumberOfAuctions("180");
        wacsScreenStatistics.setMTotalNumberOfBookedTickets("0");
        wacsScreenStatistics.setMTotalNumberOfTicketsSold("0");
        wacsScreenStatistics.setMTotalNumberOfAvailableTickets("180");
        wacsScreenStatistics.setMTotalNumberOfVacantTickets("0");
        wacsScreenStatistics.setMTotalNumberOfAgreementsSigned("0");
        wacsScreenStatistics.setMBookingStatus("OPEN");
        wacsScreenStatistics.setMinBidRange("0% Of Chit Value");
        wacsScreenStatistics.setMaxBidRange("25% Of Chit Value");
        wacsScreenStatistics.setMinPrizeRange("75% Of Chit Value");
        wacsScreenStatistics.setMaxPrizeRange("100% Of Chit Value");

        Wacs_Screen_CGCategories_Duration wacsScreenCgCategoriesDuration = new Wacs_Screen_CGCategories_Duration();

        Wacs_Screen_20Weeks_Data wacsScreen20WeeksData = new Wacs_Screen_20Weeks_Data();
        SubData subData20Weeks = new SubData();
        subData20Weeks.setMTitle("20Weeks");
        subData20Weeks.setMaxBidRange("25% Of Chit Value");
        subData20Weeks.setMinBidRange("0% Of Chit Value");
        subData20Weeks.setMBookingStatus("OPEN");
        subData20Weeks.setMaxPrizeRange("100% Of Chit Value");
        subData20Weeks.setMinPrizeRange("75% Of Chit Value");
        subData20Weeks.setMVisibility("VISIBLE");
        subData20Weeks.setMTotalNumberOfAuctions("180");
        subData20Weeks.setMTotalNumberOfTickets("180");
        subData20Weeks.setMTotalNumberOfAgreementsSigned("0");
        subData20Weeks.setMTotalNumberOfBookedTickets("0");
        subData20Weeks.setMTotalNumberOfTicketsSold("0");
        subData20Weeks.setMTotalNumberOfVacantTickets("0");
        subData20Weeks.setMTotalNumberOfAvailableTickets("180");
        wacsScreen20WeeksData.setMSubData(subData20Weeks);

        ChitGroup50000Rs cg20Weeks50K1 = new ChitGroup50000Rs();
        SubData subData10W50K1 = new SubData();
        subData10W50K1.setMTitle("20Weeks50K1");
        subData10W50K1.setMaxBidRange("25% Of Chit Value");
        subData10W50K1.setMinBidRange("0% Of Chit Value");
        subData10W50K1.setMBookingStatus("OPEN");
        subData10W50K1.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K1.setMinPrizeRange("75% Of Chit Value");
        subData10W50K1.setMVisibility("VISIBLE");
        subData10W50K1.setMTotalNumberOfAuctions("19");
        subData10W50K1.setMTotalNumberOfTickets("19");
        subData10W50K1.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K1.setMTotalNumberOfBookedTickets("0");
        subData10W50K1.setMTotalNumberOfTicketsSold("0");
        subData10W50K1.setMTotalNumberOfVacantTickets("0");
        subData10W50K1.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K1.setMSubData(subData10W50K1);
        cg50k20w_list.add(cg20Weeks50K1);

        ChitGroup50000Rs cg20Weeks50K2 = new ChitGroup50000Rs();
        SubData subData10W50K2 = new SubData();
        subData10W50K2.setMTitle("20Weeks50K2");
        subData10W50K2.setMaxBidRange("25% Of Chit Value");
        subData10W50K2.setMinBidRange("0% Of Chit Value");
        subData10W50K2.setMBookingStatus("SCHEDULED");
        subData10W50K2.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K2.setMinPrizeRange("75% Of Chit Value");
        subData10W50K2.setMVisibility("VISIBLE");
        subData10W50K2.setMTotalNumberOfAuctions("19");
        subData10W50K2.setMTotalNumberOfTickets("19");
        subData10W50K2.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K2.setMTotalNumberOfBookedTickets("0");
        subData10W50K2.setMTotalNumberOfTicketsSold("0");
        subData10W50K2.setMTotalNumberOfVacantTickets("0");
        subData10W50K2.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K2.setMSubData(subData10W50K2);
        cg50k20w_list.add(cg20Weeks50K2);

        ChitGroup50000Rs cg20Weeks50K3 = new ChitGroup50000Rs();
        SubData subData10W50K3 = new SubData();
        subData10W50K3.setMTitle("20Weeks50K3");
        subData10W50K3.setMaxBidRange("25% Of Chit Value");
        subData10W50K3.setMinBidRange("0% Of Chit Value");
        subData10W50K3.setMBookingStatus("SCHEDULED");
        subData10W50K3.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K3.setMinPrizeRange("75% Of Chit Value");
        subData10W50K3.setMVisibility("VISIBLE");
        subData10W50K3.setMTotalNumberOfAuctions("19");
        subData10W50K3.setMTotalNumberOfTickets("19");
        subData10W50K3.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K3.setMTotalNumberOfBookedTickets("0");
        subData10W50K3.setMTotalNumberOfTicketsSold("0");
        subData10W50K3.setMTotalNumberOfVacantTickets("0");
        subData10W50K3.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K3.setMSubData(subData10W50K3);
        cg50k20w_list.add(cg20Weeks50K3);

        ChitGroup50000Rs cg20Weeks50K4 = new ChitGroup50000Rs();
        SubData subData10W50K4 = new SubData();
        subData10W50K4.setMTitle("20Weeks50K4");
        subData10W50K4.setMaxBidRange("25% Of Chit Value");
        subData10W50K4.setMinBidRange("0% Of Chit Value");
        subData10W50K4.setMBookingStatus("SCHEDULED");
        subData10W50K4.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K4.setMinPrizeRange("75% Of Chit Value");
        subData10W50K4.setMVisibility("VISIBLE");
        subData10W50K4.setMTotalNumberOfAuctions("19");
        subData10W50K4.setMTotalNumberOfTickets("19");
        subData10W50K4.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K4.setMTotalNumberOfBookedTickets("0");
        subData10W50K4.setMTotalNumberOfTicketsSold("0");
        subData10W50K4.setMTotalNumberOfVacantTickets("0");
        subData10W50K4.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K4.setMSubData(subData10W50K4);
        cg50k20w_list.add(cg20Weeks50K4);

        ChitGroup50000Rs cg20Weeks50K5 = new ChitGroup50000Rs();
        SubData subData10W50K5 = new SubData();
        subData10W50K5.setMTitle("20Weeks50K5");
        subData10W50K5.setMaxBidRange("25% Of Chit Value");
        subData10W50K5.setMinBidRange("0% Of Chit Value");
        subData10W50K5.setMBookingStatus("SCHEDULED");
        subData10W50K5.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K5.setMinPrizeRange("75% Of Chit Value");
        subData10W50K5.setMVisibility("VISIBLE");
        subData10W50K5.setMTotalNumberOfAuctions("19");
        subData10W50K5.setMTotalNumberOfTickets("19");
        subData10W50K5.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K5.setMTotalNumberOfBookedTickets("0");
        subData10W50K5.setMTotalNumberOfTicketsSold("0");
        subData10W50K5.setMTotalNumberOfVacantTickets("0");
        subData10W50K5.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K5.setMSubData(subData10W50K5);
        cg50k20w_list.add(cg20Weeks50K5);

        ChitGroup50000Rs cg20Weeks50K6 = new ChitGroup50000Rs();
        SubData subData10W50K6 = new SubData();
        subData10W50K6.setMTitle("20Weeks50K6");
        subData10W50K6.setMaxBidRange("25% Of Chit Value");
        subData10W50K6.setMinBidRange("0% Of Chit Value");
        subData10W50K6.setMBookingStatus("SCHEDULED");
        subData10W50K6.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K6.setMinPrizeRange("75% Of Chit Value");
        subData10W50K6.setMVisibility("VISIBLE");
        subData10W50K6.setMTotalNumberOfAuctions("19");
        subData10W50K6.setMTotalNumberOfTickets("19");
        subData10W50K6.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K6.setMTotalNumberOfBookedTickets("0");
        subData10W50K6.setMTotalNumberOfTicketsSold("0");
        subData10W50K6.setMTotalNumberOfVacantTickets("0");
        subData10W50K6.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K6.setMSubData(subData10W50K6);
        cg50k20w_list.add(cg20Weeks50K6);

        ChitGroup50000Rs cg20Weeks50K7 = new ChitGroup50000Rs();
        SubData subData10W50K7 = new SubData();
        subData10W50K7.setMTitle("20Weeks50K7");
        subData10W50K7.setMaxBidRange("25% Of Chit Value");
        subData10W50K7.setMinBidRange("0% Of Chit Value");
        subData10W50K7.setMBookingStatus("SCHEDULED");
        subData10W50K7.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K7.setMinPrizeRange("75% Of Chit Value");
        subData10W50K7.setMVisibility("VISIBLE");
        subData10W50K7.setMTotalNumberOfAuctions("19");
        subData10W50K7.setMTotalNumberOfTickets("19");
        subData10W50K7.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K7.setMTotalNumberOfBookedTickets("0");
        subData10W50K7.setMTotalNumberOfTicketsSold("0");
        subData10W50K7.setMTotalNumberOfVacantTickets("0");
        subData10W50K7.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K7.setMSubData(subData10W50K7);
        cg50k20w_list.add(cg20Weeks50K7);

        ChitGroup50000Rs cg20Weeks50K8 = new ChitGroup50000Rs();
        SubData subData10W50K8 = new SubData();
        subData10W50K8.setMTitle("20Weeks50K8");
        subData10W50K8.setMaxBidRange("25% Of Chit Value");
        subData10W50K8.setMinBidRange("0% Of Chit Value");
        subData10W50K8.setMBookingStatus("SCHEDULED");
        subData10W50K8.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K8.setMinPrizeRange("75% Of Chit Value");
        subData10W50K8.setMVisibility("VISIBLE");
        subData10W50K8.setMTotalNumberOfAuctions("19");
        subData10W50K8.setMTotalNumberOfTickets("19");
        subData10W50K8.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K8.setMTotalNumberOfBookedTickets("0");
        subData10W50K8.setMTotalNumberOfTicketsSold("0");
        subData10W50K8.setMTotalNumberOfVacantTickets("0");
        subData10W50K8.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K8.setMSubData(subData10W50K8);
        cg50k20w_list.add(cg20Weeks50K8);


        ChitGroup50000Rs cg20Weeks50K9 = new ChitGroup50000Rs();
        SubData subData10W50K9 = new SubData();
        subData10W50K9.setMTitle("20Weeks50K9");
        subData10W50K9.setMaxBidRange("25% Of Chit Value");
        subData10W50K9.setMinBidRange("0% Of Chit Value");
        subData10W50K9.setMBookingStatus("SCHEDULED");
        subData10W50K9.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K9.setMinPrizeRange("75% Of Chit Value");
        subData10W50K9.setMVisibility("VISIBLE");
        subData10W50K9.setMTotalNumberOfAuctions("19");
        subData10W50K9.setMTotalNumberOfTickets("19");
        subData10W50K9.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K9.setMTotalNumberOfBookedTickets("0");
        subData10W50K9.setMTotalNumberOfTicketsSold("0");
        subData10W50K9.setMTotalNumberOfVacantTickets("0");
        subData10W50K9.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K9.setMSubData(subData10W50K9);
        cg50k20w_list.add(cg20Weeks50K9);


        ChitGroup50000Rs cg20Weeks50K10 = new ChitGroup50000Rs();
        SubData subData10W50K10 = new SubData();
        subData10W50K10.setMTitle("20Weeks50K10");
        subData10W50K10.setMaxBidRange("25% Of Chit Value");
        subData10W50K10.setMinBidRange("0% Of Chit Value");
        subData10W50K10.setMBookingStatus("SCHEDULED");
        subData10W50K10.setMaxPrizeRange("100% Of Chit Value");
        subData10W50K10.setMinPrizeRange("75% Of Chit Value");
        subData10W50K10.setMVisibility("VISIBLE");
        subData10W50K10.setMTotalNumberOfAuctions("19");
        subData10W50K10.setMTotalNumberOfTickets("19");
        subData10W50K10.setMTotalNumberOfAgreementsSigned("0");
        subData10W50K10.setMTotalNumberOfBookedTickets("0");
        subData10W50K10.setMTotalNumberOfTicketsSold("0");
        subData10W50K10.setMTotalNumberOfVacantTickets("0");
        subData10W50K10.setMTotalNumberOfAvailableTickets("0");
        cg20Weeks50K10.setMSubData(subData10W50K10);
        cg50k20w_list.add(cg20Weeks50K10);

        wacsScreen20WeeksData.setMChitGroup50000Rs(cg50k20w_list);

        wacsScreenCgCategoriesDuration.setMWacs_Screen_20Weeks_Data(wacsScreen20WeeksData);

        wacsScreenCgCategories.setMWacs_screen_cgCategories_duration(wacsScreenCgCategoriesDuration);

        wacsScreen.setMTitle("WACS_SCREEN_TITLE");
        wacsScreen.setMWacs_screen_statistics(wacsScreenStatistics);
        wacsScreen.setMWacs_screen_cgCategories(wacsScreenCgCategories);

        screen.setMWacsScreenVisibility("VISIBLE");
        screen.setMWacsScreenTitle("WACS_SCREEN");
        screen.setMScreenTitle("Screen");
        screen.setMWacsScreen(wacsScreen);

        screenData.setScreen(screen);
        screenData.setMData("screendata");
        screenData.setScreenDataStatistics(screenDataStatistics);

        adminData.setMData("admindata");
        adminData.setScreenData(screenData);
        adminDataRepo.save(adminData);

        SignupDetails registrationDetails = new SignupDetails();
        registrationDetails.setAddress("Shamshabad");
        registrationDetails.setAadharCard(null);
        registrationDetails.setPanCard(null);
        registrationDetails.setFullName("Jeetendra Wawdhane");
        registrationDetails.setMobileNumber("9581286452");
        registrationDetails.setEmailId("jeetuwaw@gmail.com");
        registrationDetails.setAadharNumber("597961516428");
        registrationDetails.setPanNumber("ABCPW3300J");
        registrationDetails.setPassword("123456");
        registrationDetails.setConfirmPassword(registrationDetails.getPassword());
        if (!signupDetailsRepository.findProfileByMobileNumber(registrationDetails.getMobileNumber()).isPresent()) {
            registrationDetails = signupDetailsRepository.save(registrationDetails);
            if (registrationDetails != null) {
                Customer customer = new Customer();
                customer.setCustomerName(registrationDetails.getFullName());
                customer.setMobileNumber(registrationDetails.getMobileNumber());
                customer.setPassword(registrationDetails.getPassword());
                customer.setMessage("Registered");
                customerRepository.save(customer);
            }
        }

        UserContacts userContacts = new UserContacts();
        userContacts.setFirst_name("USER99");
        userContacts.setMobile_number("9999999999");
        userContacts.setLast_name("CONTACT");
        userContacts.setUsernumber("9581286452");
        userContacts.setUser_name("MAINUSER");
        userContactsRepository.save(userContacts);

        UserContacts userContacts2 = new UserContacts();
        userContacts2.setFirst_name("USER29");
        userContacts2.setMobile_number("9999999990");
        userContacts2.setLast_name("CONTACT2");
        userContacts2.setUsernumber("9581286452");
        userContacts2.setUser_name("MAINUSER");
        userContactsRepository.save(userContacts2);

        new FileStorageServicesImpl().init("9581286452", "aadhar");

        Location location = new Location();
        location.setMobileNumber("1");
        location.setAddress("Hyderabad");
        location.setCustomerName("1");
        locationRepository.save(location);*/
    }

    public void mock2(){
        AuctionableSchemes auctionableSchemes = new AuctionableSchemes();
        auctionableSchemes.setE1d("DAILY(E1D) AUCTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE2d("BI_DAILY(E2D) AUCTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE7d("WEEKLY(E7D) AUCTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE10d("TEEKLY(E10D) AUCTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE14d("BI_WEEKLY(E14D) AUCTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE30d("MONTHLY(E30D) AUCTIONABLE CHIT GROUP SCHEMES");
        if(!auctionableSchemesRepository.existsById(Integer.toUnsignedLong(1))) {
            auctionableSchemesRepository.save(auctionableSchemes);
        }

        WeeklyAuctionableDurations weeklyAuctionableDurations = new WeeklyAuctionableDurations();
        weeklyAuctionableDurations.setW10("10 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW15("15 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW20("20 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW25("25 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW30("30 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW40("40 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW50("50 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW60("60 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW70("70 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW80("80 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW90("90 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        weeklyAuctionableDurations.setW100("100 WEEKS DURATIONS WEEKLY CHIT GROUPS");
        if(!weeklyAuctionableDurationsRepository.existsById(Integer.toUnsignedLong(1))) {
            weeklyAuctionableDurationsRepository.save(weeklyAuctionableDurations);
        }

        ChitGroup50K chitGroup50K1 = new ChitGroup50K();
        chitGroup50K1.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K01)");
        chitGroup50K1.setMVisibility("1");
        chitGroup50K1.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K1.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K1.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K1.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K1.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K1.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K1.setMBookingStatus("Booking: OPEN");
        chitGroup50K1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K1.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K1.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K1.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K1.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K1.setCode("P20W50K01");
        chitGroup50K1.setNumberOfTickets("20");
        chitGroup50K1.setAmount("2500 INR PER TICKET");
        chitGroup50K1.setValue("50,000 INR");
        chitGroup50K1.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K1.setTime("08:00 PM");
        chitGroup50K1.setWeeks("20");
        chitGroup50K1.setDay("Every Friday of Week");
        chitGroup50K1.setNoauction("First Auction Goes to Company");
        chitGroup50K1.setDueday("Every Wednesday of Week");
        chitGroup50K1.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K1.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K1);
        }
        ChitGroup50K chitGroup50K2 = new ChitGroup50K();
        chitGroup50K2.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K02)");
        chitGroup50K2.setMVisibility("1");
        chitGroup50K2.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K2.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K2.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K2.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K2.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K2.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K2.setMBookingStatus("Booking: OPEN");
        chitGroup50K2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K2.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K2.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K2.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K2.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K2.setCode("P20W50K02");
        chitGroup50K2.setNumberOfTickets("20");
        chitGroup50K2.setAmount("2500 INR PER TICKET");
        chitGroup50K2.setValue("50,000 INR");
        chitGroup50K2.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K2.setTime("08:10 PM");
        chitGroup50K2.setWeeks("20");
        chitGroup50K2.setDay("Every Friday of Week");
        chitGroup50K2.setNoauction("First Auction Goes to Company");
        chitGroup50K2.setDueday("Every Wednesday of Week");
        chitGroup50K2.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K2.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K2);
        }
        ChitGroup50K chitGroup50K3 = new ChitGroup50K();
        chitGroup50K3.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K03)");
        chitGroup50K3.setMVisibility("0");
        chitGroup50K3.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K3.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K3.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K3.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K3.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K3.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K3.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K3.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K3.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K3.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K3.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K3.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K3.setCode("P20W50K03");
        chitGroup50K3.setNumberOfTickets("20");
        chitGroup50K3.setAmount("2500 INR PER TICKET");
        chitGroup50K3.setValue("50,000 INR");
        chitGroup50K3.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K3.setTime("08:20 PM");
        chitGroup50K3.setWeeks("20");
        chitGroup50K3.setDay("Every Friday of Week");
        chitGroup50K3.setNoauction("First Auction Goes to Company");
        chitGroup50K3.setDueday("Every Wednesday of Week");
        chitGroup50K3.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K3.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K3);
        }
        ChitGroup50K chitGroup50K4 = new ChitGroup50K();
        chitGroup50K4.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K04)");
        chitGroup50K4.setMVisibility("0");
        chitGroup50K4.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K4.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K4.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K4.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K4.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K4.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K4.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K4.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K4.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K4.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K4.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K4.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K4.setCode("P20W50K04");
        chitGroup50K4.setNumberOfTickets("20");
        chitGroup50K4.setAmount("2500 INR PER TICKET");
        chitGroup50K4.setValue("50,000 INR");
        chitGroup50K4.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K4.setTime("08:30 PM");
        chitGroup50K4.setWeeks("20");
        chitGroup50K4.setDay("Every Friday of Week");
        chitGroup50K4.setNoauction("First Auction Goes to Company");
        chitGroup50K4.setDueday("Every Wednesday of Week");
        chitGroup50K4.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K4.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K4);
        }
        ChitGroup50K chitGroup50K5 = new ChitGroup50K();
        chitGroup50K5.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K05)");
        chitGroup50K5.setMVisibility("0");
        chitGroup50K5.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K5.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K5.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K5.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K5.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K5.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K5.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K5.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K5.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K5.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K5.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K5.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K5.setCode("P20W50K05");
        chitGroup50K5.setNumberOfTickets("20");
        chitGroup50K5.setAmount("2500 INR PER TICKET");
        chitGroup50K5.setValue("50,000 INR");
        chitGroup50K5.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K5.setTime("08:40 PM");
        chitGroup50K5.setWeeks("20");
        chitGroup50K5.setDay("Every Friday of Week");
        chitGroup50K5.setNoauction("First Auction Goes to Company");
        chitGroup50K5.setDueday("Every Wednesday of Week");
        chitGroup50K5.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K5.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K5);
        }
        ChitGroup50K chitGroup50K6 = new ChitGroup50K();
        chitGroup50K6.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K06)");
        chitGroup50K6.setMVisibility("0");
        chitGroup50K6.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K6.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K6.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K6.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K6.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K6.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K6.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K6.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K6.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K6.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K6.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K6.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K6.setCode("P20W50K06");
        chitGroup50K6.setNumberOfTickets("20");
        chitGroup50K6.setAmount("2500 INR PER TICKET");
        chitGroup50K6.setValue("50,000 INR");
        chitGroup50K6.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K6.setTime("08:50 PM");
        chitGroup50K6.setWeeks("20");
        chitGroup50K6.setDay("Every Friday of Week");
        chitGroup50K6.setNoauction("First Auction Goes to Company");
        chitGroup50K6.setDueday("Every Wednesday of Week");
        chitGroup50K6.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K6.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K6);
        }
        ChitGroup50K chitGroup50K7 = new ChitGroup50K();
        chitGroup50K7.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K07)");
        chitGroup50K7.setMVisibility("0");
        chitGroup50K7.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K7.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K7.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K7.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K7.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K7.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K7.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K7.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K7.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K7.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K7.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K7.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K7.setCode("P20W50K07");
        chitGroup50K7.setNumberOfTickets("20");
        chitGroup50K7.setAmount("2500 INR PER TICKET");
        chitGroup50K7.setValue("50,000 INR");
        chitGroup50K7.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K7.setTime("09:00 PM");
        chitGroup50K7.setWeeks("20");
        chitGroup50K7.setDay("Every Friday of Week");
        chitGroup50K7.setNoauction("First Auction Goes to Company");
        chitGroup50K7.setDueday("Every Wednesday of Week");
        chitGroup50K7.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K7.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K7);
        }
        ChitGroup50K chitGroup50K8 = new ChitGroup50K();
        chitGroup50K8.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K08)");
        chitGroup50K8.setMVisibility("0");
        chitGroup50K8.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K8.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K8.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K8.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K8.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K8.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K8.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K8.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K8.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K8.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K8.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K8.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K8.setCode("P20W50K08");
        chitGroup50K8.setNumberOfTickets("20");
        chitGroup50K8.setAmount("2500 INR PER TICKET");
        chitGroup50K8.setValue("50,000 INR");
        chitGroup50K8.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K8.setTime("09:10 PM");
        chitGroup50K8.setWeeks("20");
        chitGroup50K8.setDay("Every Friday of Week");
        chitGroup50K8.setNoauction("First Auction Goes to Company");
        chitGroup50K8.setDueday("Every Wednesday of Week");
        chitGroup50K8.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K8.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K8);
        }
        ChitGroup50K chitGroup50K9 = new ChitGroup50K();
        chitGroup50K9.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K09)");
        chitGroup50K9.setMVisibility("0");
        chitGroup50K9.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K9.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K9.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K9.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K9.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K9.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K9.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K9.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K9.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K9.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K9.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K9.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K9.setCode("P20W50K09");
        chitGroup50K9.setNumberOfTickets("20");
        chitGroup50K9.setAmount("2500 INR PER TICKET");
        chitGroup50K9.setValue("50,000 INR");
        chitGroup50K9.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K9.setTime("09:20 PM");
        chitGroup50K9.setWeeks("20");
        chitGroup50K9.setDay("Every Friday of Week");
        chitGroup50K9.setNoauction("First Auction Goes to Company");
        chitGroup50K9.setDueday("Every Wednesday of Week");
        chitGroup50K9.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K9.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K9);
        }
        ChitGroup50K chitGroup50K10 = new ChitGroup50K();
        chitGroup50K10.setMTitle("20 WEEKS 50 THOUSAND INR GROUP (P20W50K10)");
        chitGroup50K10.setMVisibility("0");
        chitGroup50K10.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup50K10.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup50K10.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup50K10.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup50K10.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup50K10.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup50K10.setMBookingStatus("Booking: NOT OPEN");
        chitGroup50K10.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup50K10.setMaxBidRange("Maximum Bid%: 25% of Chit Value");
        chitGroup50K10.setMinPrizeRange("Minimum Prize: 37,500 Rs");
        chitGroup50K10.setMaxPrizeRange("Maximum Prize: 50,000 Rs");
        chitGroup50K10.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup50K10.setCode("P20W50K10");
        chitGroup50K10.setNumberOfTickets("20");
        chitGroup50K10.setAmount("2500 INR PER TICKET");
        chitGroup50K10.setValue("50,000 INR");
        chitGroup50K10.setDuration("20 WEEKS FROM BEGINING OF CHIT GROUP");
        chitGroup50K10.setTime("09:30 PM");
        chitGroup50K10.setWeeks("20");
        chitGroup50K10.setDay("Every Friday of Week");
        chitGroup50K10.setNoauction("First Auction Goes to Company");
        chitGroup50K10.setDueday("Every Wednesday of Week");
        chitGroup50K10.setDistribution("Every Monday of Week");
        if(null == chitGroup50KRepository.findChitGroupBymTitle(chitGroup50K10.getMTitle())){
            chitGroup50KRepository.save(chitGroup50K10);
        }
    }

    public void mock3(){
        MonthlyAuctionableDurations monthlyAuctionableDurations = new MonthlyAuctionableDurations();
        monthlyAuctionableDurations.setM10("10 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM12("12 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM15("15 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM20("20 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM25("25 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM30("30 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM35("35 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM40("40 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM45("45 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        monthlyAuctionableDurations.setM50("50 MONTHS DURATIONS MONTHLY CHIT GROUPS");
        if(!monthlyAuctionableDurationsRepository.existsById(Integer.toUnsignedLong(1))) {
            monthlyAuctionableDurationsRepository.save(monthlyAuctionableDurations);
        }

        ChitGroup5Lakhs chitGroup5Lakhs1 = new ChitGroup5Lakhs();
        chitGroup5Lakhs1.setMTitle("20 MONTHS 5 LAKHS INR GROUP (P20M05L01)");
        chitGroup5Lakhs1.setMVisibility("1");
        chitGroup5Lakhs1.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup5Lakhs1.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup5Lakhs1.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup5Lakhs1.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup5Lakhs1.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup5Lakhs1.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup5Lakhs1.setMBookingStatus("Booking: OPEN");
        chitGroup5Lakhs1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup5Lakhs1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup5Lakhs1.setMinPrizeRange("Minimum Prize: 3,50,000 Rs");
        chitGroup5Lakhs1.setMaxPrizeRange("Maximum Prize: 5,25,000 Rs");
        chitGroup5Lakhs1.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup5Lakhs1.setCode("P20M05L01");
        chitGroup5Lakhs1.setNumberOfTickets("20");
        chitGroup5Lakhs1.setAmount("25000 INR PER TICKET");
        chitGroup5Lakhs1.setValue("5,00,000 INR");
        chitGroup5Lakhs1.setDuration("20 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup5Lakhs1.setTime("07:00 PM");
        chitGroup5Lakhs1.setMonths("20");
        chitGroup5Lakhs1.setDay("Every 20th Day of Month");
        chitGroup5Lakhs1.setNoauction("First Auction Goes to Company");
        chitGroup5Lakhs1.setDueday("Every 10th Day of Month");
        chitGroup5Lakhs1.setDistribution("Every 10th Day of Month");
        if(null == chitGroup5LakhsRepository.findChitGroupBymTitle(chitGroup5Lakhs1.getMTitle())){
            chitGroup5LakhsRepository.save(chitGroup5Lakhs1);
        }
        ChitGroup5Lakhs chitGroup5Lakhs2 = new ChitGroup5Lakhs();
        chitGroup5Lakhs2.setMTitle("20 MONTHS 5 LAKHS INR GROUP (P20M05L02)");
        chitGroup5Lakhs2.setMVisibility("1");
        chitGroup5Lakhs2.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup5Lakhs2.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup5Lakhs2.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup5Lakhs2.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup5Lakhs2.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup5Lakhs2.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup5Lakhs2.setMBookingStatus("Booking: OPEN");
        chitGroup5Lakhs2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup5Lakhs2.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup5Lakhs2.setMinPrizeRange("Minimum Prize: 3,50,000 Rs");
        chitGroup5Lakhs2.setMaxPrizeRange("Maximum Prize: 5,25,000 Rs");
        chitGroup5Lakhs2.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup5Lakhs2.setCode("P20M05L02");
        chitGroup5Lakhs2.setNumberOfTickets("20");
        chitGroup5Lakhs2.setAmount("25000 INR PER TICKET");
        chitGroup5Lakhs2.setValue("5,00,000 INR");
        chitGroup5Lakhs2.setDuration("20 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup5Lakhs2.setTime("07:10 PM");
        chitGroup5Lakhs2.setMonths("20");
        chitGroup5Lakhs2.setDay("Every 20th Day of Month");
        chitGroup5Lakhs2.setNoauction("First Auction Goes to Company");
        chitGroup5Lakhs2.setDueday("Every 10th Day of Month");
        chitGroup5Lakhs2.setDistribution("Every 10th Day of Month");
        if(null == chitGroup5LakhsRepository.findChitGroupBymTitle(chitGroup5Lakhs2.getMTitle())){
            chitGroup5LakhsRepository.save(chitGroup5Lakhs2);
        }

        ChitGroup5Lakhs chitGroup5Lakhs3 = new ChitGroup5Lakhs();
        chitGroup5Lakhs3.setMTitle("20 MONTHS 5 LAKHS INR GROUP (P20M05L03)");
        chitGroup5Lakhs3.setMVisibility("0");
        chitGroup5Lakhs3.setMTotalNumberOfTickets("TotalNumberOfTickets: 20");
        chitGroup5Lakhs3.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 19");
        chitGroup5Lakhs3.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup5Lakhs3.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup5Lakhs3.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 19");
        chitGroup5Lakhs3.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup5Lakhs3.setMBookingStatus("Booking: SCHEDULED");
        chitGroup5Lakhs3.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup5Lakhs3.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup5Lakhs3.setMinPrizeRange("Minimum Prize: 3,50,000 Rs");
        chitGroup5Lakhs3.setMaxPrizeRange("Maximum Prize: 5,25,000 Rs");
        chitGroup5Lakhs3.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup5Lakhs3.setCode("P20M05L03");
        chitGroup5Lakhs3.setNumberOfTickets("20");
        chitGroup5Lakhs3.setAmount("25000 INR PER TICKET");
        chitGroup5Lakhs3.setValue("5,00,000 INR");
        chitGroup5Lakhs3.setDuration("20 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup5Lakhs3.setTime("07:20 PM");
        chitGroup5Lakhs3.setMonths("20");
        chitGroup5Lakhs3.setDay("Every 20th Day of Month");
        chitGroup5Lakhs3.setNoauction("First Auction Goes to Company");
        chitGroup5Lakhs3.setDueday("Every 10th Day of Month");
        chitGroup5Lakhs3.setDistribution("Every 10th Day of Month");
        if(null == chitGroup5LakhsRepository.findChitGroupBymTitle(chitGroup5Lakhs3.getMTitle())){
            chitGroup5LakhsRepository.save(chitGroup5Lakhs3);
        }

        ChitGroup10Lakhs chitGroup10Lakhs1 = new ChitGroup10Lakhs();
        chitGroup10Lakhs1.setMTitle("25 MONTHS 10 LAKHS INR GROUP (P25M10L01)");
        chitGroup10Lakhs1.setMVisibility("1");
        chitGroup10Lakhs1.setMTotalNumberOfTickets("TotalNumberOfTickets: 25");
        chitGroup10Lakhs1.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 24");
        chitGroup10Lakhs1.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup10Lakhs1.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup10Lakhs1.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 24");
        chitGroup10Lakhs1.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup10Lakhs1.setMBookingStatus("Booking: OPEN");
        chitGroup10Lakhs1.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup10Lakhs1.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup10Lakhs1.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        chitGroup10Lakhs1.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        chitGroup10Lakhs1.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup10Lakhs1.setCode("P25M10L01");
        chitGroup10Lakhs1.setNumberOfTickets("25");
        chitGroup10Lakhs1.setAmount("40,000 INR PER TICKET");
        chitGroup10Lakhs1.setValue("10,00,000 INR");
        chitGroup10Lakhs1.setDuration("25 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup10Lakhs1.setTime("08:00 PM");
        chitGroup10Lakhs1.setMonths("25");
        chitGroup10Lakhs1.setDay("Every 20th Day of Month");
        chitGroup10Lakhs1.setNoauction("First Auction Goes to Company");
        chitGroup10Lakhs1.setDueday("Every 10th Day of Month");
        chitGroup10Lakhs1.setDistribution("Every 10th Day of Month");
        if(null == chitGroup10LakhsRepository.findChitGroupBymTitle(chitGroup10Lakhs1.getMTitle())){
            chitGroup10LakhsRepository.save(chitGroup10Lakhs1);
        }

        ChitGroup10Lakhs chitGroup10Lakhs2 = new ChitGroup10Lakhs();
        chitGroup10Lakhs2.setMTitle("25 MONTHS 10 LAKHS INR GROUP (P25M10L02)");
        chitGroup10Lakhs2.setMVisibility("1");
        chitGroup10Lakhs2.setMTotalNumberOfTickets("TotalNumberOfTickets: 25");
        chitGroup10Lakhs2.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 24");
        chitGroup10Lakhs2.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup10Lakhs2.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup10Lakhs2.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 24");
        chitGroup10Lakhs2.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup10Lakhs2.setMBookingStatus("Booking: OPEN");
        chitGroup10Lakhs2.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup10Lakhs2.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup10Lakhs2.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        chitGroup10Lakhs2.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        chitGroup10Lakhs2.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup10Lakhs2.setCode("P25M10L02");
        chitGroup10Lakhs2.setNumberOfTickets("25");
        chitGroup10Lakhs2.setAmount("40,000 INR PER TICKET");
        chitGroup10Lakhs2.setValue("10,00,000 INR");
        chitGroup10Lakhs2.setDuration("25 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup10Lakhs2.setTime("08:10 PM");
        chitGroup10Lakhs2.setMonths("25");
        chitGroup10Lakhs2.setDay("Every 20th Day of Month");
        chitGroup10Lakhs2.setNoauction("First Auction Goes to Company");
        chitGroup10Lakhs2.setDueday("Every 10th Day of Month");
        chitGroup10Lakhs2.setDistribution("Every 10th Day of Month");
        if(null == chitGroup10LakhsRepository.findChitGroupBymTitle(chitGroup10Lakhs2.getMTitle())){
            chitGroup10LakhsRepository.save(chitGroup10Lakhs2);
        }

        ChitGroup10Lakhs chitGroup10Lakhs3 = new ChitGroup10Lakhs();
        chitGroup10Lakhs3.setMTitle("25 MONTHS 10 LAKHS INR GROUP (P25M10L03)");
        chitGroup10Lakhs3.setMVisibility("0");
        chitGroup10Lakhs3.setMTotalNumberOfTickets("TotalNumberOfTickets: 25");
        chitGroup10Lakhs3.setMTotalNumberOfAvailableTickets("TotalNumberOfAvailableTickets: 24");
        chitGroup10Lakhs3.setMTotalNumberOfBookedTickets("TotalNumberOfBookedTickets: 0");
        chitGroup10Lakhs3.setMTotalNumberOfVacantTickets("TotalNumberOfVacantTickets: 0");
        chitGroup10Lakhs3.setMTotalNumberOfAuctions("TotalNumberOfAuctions: 24");
        chitGroup10Lakhs3.setMTotalNumberOfTicketsSold("TotalNumberOfTicketsSold: 0");
        chitGroup10Lakhs3.setMBookingStatus("Booking: OPEN");
        chitGroup10Lakhs3.setMinBidRange("Minimum Bid%: 0% of Chit Value");
        chitGroup10Lakhs3.setMaxBidRange("Maximum Bid%: 30% of Chit Value");
        chitGroup10Lakhs3.setMinPrizeRange("Minimum Prize: 7,00,000 Rs");
        chitGroup10Lakhs3.setMaxPrizeRange("Maximum Prize: 10,25,000 Rs");
        chitGroup10Lakhs3.setMTotalNumberOfAgreementsSigned("TotalNumberOfAgreementsSigned: 0");
        chitGroup10Lakhs3.setCode("P25M10L03");
        chitGroup10Lakhs3.setNumberOfTickets("25");
        chitGroup10Lakhs3.setAmount("40,000 INR PER TICKET");
        chitGroup10Lakhs3.setValue("10,00,000 INR");
        chitGroup10Lakhs3.setDuration("25 MONTHS FROM BEGINING OF CHIT GROUP");
        chitGroup10Lakhs3.setTime("08:20 PM");
        chitGroup10Lakhs3.setMonths("25");
        chitGroup10Lakhs3.setDay("Every 20th Day of Month");
        chitGroup10Lakhs3.setNoauction("First Auction Goes to Company");
        chitGroup10Lakhs3.setDueday("Every 10th Day of Month");
        chitGroup10Lakhs3.setDistribution("Every 10th Day of Month");
        if(null == chitGroup10LakhsRepository.findChitGroupBymTitle(chitGroup10Lakhs3.getMTitle())){
            chitGroup10LakhsRepository.save(chitGroup10Lakhs3);
        }
    }
}
