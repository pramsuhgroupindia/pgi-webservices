package com.pramsuh.chits.onboarding.admin.panel.application;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.*;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups.ChitGroup40000Rs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.chitgroups.ChitGroup50000Rs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata.UserContacts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.screenmodels.WACS_SCREEN;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_10Weeks_Data;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_CGCategories;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_CGCategories_Duration;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.weeklychitmodels.Wacs_Screen_Statistics;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AdminDataRepo;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.commons.mobiledatarepositories.UserContactsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.RegistrationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PramsuhWebservicesApplication implements CommandLineRunner {

    @Autowired
    private AdminDataRepo adminDataRepo;
    @Autowired
    private RegistrationDetailsRepository registrationDetailsRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private UserContactsRepository userContactsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PramsuhWebservicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AdminData adminData = new AdminData();

        ScreenData screenData = new ScreenData();

        ScreenDataStatistics screenDataStatistics = new ScreenDataStatistics();
        screenDataStatistics.setTitle("ScreenDataStatistics");
        screenDataStatistics.setMNumofCatPlanned("1");
        screenDataStatistics.setMNumofCatPublished("1");
        screenDataStatistics.setMNumOfCatStarted("1");
        screenDataStatistics.setMVisibility("VISIBLE");
        screenDataStatistics.setMTotalNumberOfTickets("810");
        screenDataStatistics.setMTotalNumberOfAvailableTickets("40");
        screenDataStatistics.setMTotalNumberOfVacantTickets("50");
        screenDataStatistics.setMTotalNumberOfBookedTickets("40");
        screenDataStatistics.setMTotalNumberOfAuctions("90");
        screenDataStatistics.setMTotalNumberOfAgreementsSigned("40");
        screenDataStatistics.setMTotalNumberOfTicketsSold("40");
        screenDataStatistics.setMBookingStatus("OPEN");
        screenDataStatistics.setMinBidRange("0% Of Chit Value");
        screenDataStatistics.setMaxBidRange("20% Of Chit Value");
        screenDataStatistics.setMinPrizeRange("80% Of Chit Value");
        screenDataStatistics.setMaxPrizeRange("100% Of Chit Value");

        Screen screen = new Screen();

        WACS_SCREEN wacsScreen = new WACS_SCREEN();

        Wacs_Screen_CGCategories wacsScreenCgCategories = new Wacs_Screen_CGCategories();

        Wacs_Screen_Statistics wacsScreenStatistics = new Wacs_Screen_Statistics();
        wacsScreenStatistics.setMTitle("Wacs_Screen_Statistics");
        wacsScreenStatistics.setMVisibility("VISIBLE");
        wacsScreenStatistics.setMTotalNumberOfTickets("90");
        wacsScreenStatistics.setMTotalNumberOfAuctions("1080");
        wacsScreenStatistics.setMTotalNumberOfBookedTickets("280");
        wacsScreenStatistics.setMTotalNumberOfTicketsSold("280");
        wacsScreenStatistics.setMTotalNumberOfAvailableTickets("800");
        wacsScreenStatistics.setMTotalNumberOfVacantTickets("800");
        wacsScreenStatistics.setMTotalNumberOfAgreementsSigned("280");
        wacsScreenStatistics.setMBookingStatus("OPEN");
        wacsScreenStatistics.setMinBidRange("0%");
        wacsScreenStatistics.setMaxBidRange("20%");
        wacsScreenStatistics.setMinPrizeRange("80%");
        wacsScreenStatistics.setMaxPrizeRange("100%");

        Wacs_Screen_CGCategories_Duration wacsScreenCgCategoriesDuration = new Wacs_Screen_CGCategories_Duration();

        Wacs_Screen_10Weeks_Data wacsScreen10WeeksData = new Wacs_Screen_10Weeks_Data();
        SubData subData10Weeks = new SubData();
        subData10Weeks.setMTitle("10Weeks");
        subData10Weeks.setMaxBidRange("20%");
        subData10Weeks.setMinBidRange("0%");
        subData10Weeks.setMBookingStatus("OPEN");
        subData10Weeks.setMaxPrizeRange("100%");
        subData10Weeks.setMinPrizeRange("80%");
        subData10Weeks.setMVisibility("VISIBLE");
        subData10Weeks.setMTotalNumberOfAuctions("120");
        subData10Weeks.setMTotalNumberOfTickets("120");
        subData10Weeks.setMTotalNumberOfAgreementsSigned("60");
        subData10Weeks.setMTotalNumberOfBookedTickets("60");
        subData10Weeks.setMTotalNumberOfTicketsSold("60");
        subData10Weeks.setMTotalNumberOfVacantTickets("60");
        subData10Weeks.setMTotalNumberOfAvailableTickets("60");
        wacsScreen10WeeksData.setMSubData(subData10Weeks);

        ChitGroup50000Rs chitGroup50000Rs = new ChitGroup50000Rs();
        SubData subData10W50K = new SubData();
        subData10W50K.setMTitle("10Weeks50000Rs");
        subData10W50K.setMaxBidRange("20%");
        subData10W50K.setMinBidRange("0%");
        subData10W50K.setMBookingStatus("RUNNING");
        subData10W50K.setMaxPrizeRange("100%");
        subData10W50K.setMinPrizeRange("80%");
        subData10W50K.setMVisibility("VISIBLE");
        subData10W50K.setMTotalNumberOfAuctions("120");
        subData10W50K.setMTotalNumberOfTickets("120");
        subData10W50K.setMTotalNumberOfAgreementsSigned("60");
        subData10W50K.setMTotalNumberOfBookedTickets("60");
        subData10W50K.setMTotalNumberOfTicketsSold("60");
        subData10W50K.setMTotalNumberOfVacantTickets("60");
        subData10W50K.setMTotalNumberOfAvailableTickets("60");
        chitGroup50000Rs.setMSubData(subData10W50K);
        wacsScreen10WeeksData.setMChitGroup50000Rs(chitGroup50000Rs);

        ChitGroup40000Rs chitGroup40000Rs = new ChitGroup40000Rs();
        SubData subData10W40K = new SubData();
        subData10W40K.setMTitle("10Weeks40000Rs");
        subData10W40K.setMaxBidRange("20%");
        subData10W40K.setMinBidRange("0%");
        subData10W40K.setMBookingStatus("Running");
        subData10W40K.setMaxPrizeRange("100%");
        subData10W40K.setMinPrizeRange("80%");
        subData10W40K.setMVisibility("VISIBLE");
        subData10W40K.setMTotalNumberOfAuctions("120");
        subData10W40K.setMTotalNumberOfTickets("120");
        subData10W40K.setMTotalNumberOfAgreementsSigned("60");
        subData10W40K.setMTotalNumberOfBookedTickets("60");
        subData10W40K.setMTotalNumberOfTicketsSold("60");
        subData10W40K.setMTotalNumberOfVacantTickets("60");
        subData10W40K.setMTotalNumberOfAvailableTickets("60");
        chitGroup40000Rs.setMSubData(subData10W40K);
        wacsScreen10WeeksData.setMChitGroup40000Rs(chitGroup40000Rs);

        wacsScreenCgCategoriesDuration.setMWacs_Screen_10Weeks_Data(wacsScreen10WeeksData);

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

        RegistrationDetails registrationDetails = new RegistrationDetails();
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
        if (!registrationDetailsRepository.findProfileByMobileNumber(registrationDetails.getMobileNumber()).isPresent()) {
            registrationDetails = registrationDetailsRepository.save(registrationDetails);
            if (registrationDetails != null) {
                Customer customer = new Customer();
                customer.setMobileNumber(registrationDetails.getMobileNumber());
                customer.setPassword(registrationDetails.getPassword());
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

    }
}
