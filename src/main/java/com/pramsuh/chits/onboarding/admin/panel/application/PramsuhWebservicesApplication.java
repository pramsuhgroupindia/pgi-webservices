package com.pramsuh.chits.onboarding.admin.panel.application;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking.*;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.*;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PramsuhWebservicesApplication implements CommandLineRunner {

    @Autowired
    private SignupDetailsRepository signupDetailsRepository;

    @Autowired
    private MemberDetailsRepository memberDetailsRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private UserContactsRepository userContactsRepository;

    @Autowired
    private SMSInboxRepository smsInboxRepository;

    @Autowired
    private AuctionableSchemesRepository auctionableSchemesRepository;

    @Autowired
    private DailyChitGroupsRepository dailyChitGroupsRepository;

    @Autowired
    private DailyAuctionableDurationsRepository dailyAuctionableDurationsRepository;

    @Autowired
    private BiDailyAuctionableDurationsRepository biDailyAuctionableDurationsRepository;

    @Autowired
    private BiDailyChitGroupsRepository biDailyChitGroupsRepository;

    @Autowired
    private WeeklyAuctionableDurationsRepository weeklyAuctionableDurationsRepository;

    @Autowired
    private WeeklyChitGroupsRepository weeklyChitGroupsRepository;

    @Autowired
    private TeeklyAuctionableDurationsRepository teeklyAuctionableDurationsRepository;

    @Autowired
    private TeeklyChitGroupsRepository teeklyChitGroupsRepository;

    @Autowired
    private BiWeeklyAuctionableDurationsRepository biWeeklyAuctionableDurationsRepository;

    @Autowired
    private BiWeeklyChitGroupsRepository biWeeklyChitGroupsRepository;

    @Autowired
    private MonthlyAuctionableDurationsRepository monthlyAuctionableDurationsRepository;

    @Autowired
    private MonthlyChitGroupsRepository monthlyChitGroupsRepository;

    public static void main(String[] args) {
        SpringApplication.run(PramsuhWebservicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     //   mock();
    }

    public void mock(){

        SignUpDetailsMocker signUpDetailsMocker = new SignUpDetailsMocker();
        SignupDetails signupDetails = signUpDetailsMocker.mockSignUpDetailsTableData(signupDetailsRepository);

        MemberDetailsMocker memberDetailsMocker = new MemberDetailsMocker();
        MemberDetails memberDetails = memberDetailsMocker.mockMemberDetailsTableData(memberDetailsRepository, signupDetails);

        CustomerMocker customerMocker = new CustomerMocker();
        Customer customer = customerMocker.mockCustomerDataTable(customerRepository, signupDetails);

        UserContactsMocker userContactsMocker = new UserContactsMocker();
        userContactsMocker.mockUserContactsDataTable(userContactsRepository, customer);

        LocationMocker locationMocker = new LocationMocker();
        locationMocker.mockLocationDataTable(locationRepository, customer);

        SmsInboxMocker smsInboxMocker = new SmsInboxMocker();
        smsInboxMocker.mockSmsInboxTbaleData(smsInboxRepository, customer);

        SignInMocker signInMocker = new SignInMocker();
        signInMocker.mockSignInTableData(customerRepository, memberDetails);

        AuctionableSchemesMocker auctionableSchemesMocker = new AuctionableSchemesMocker();
        auctionableSchemesMocker.mockAuctionableSchemes(auctionableSchemesRepository);

        DailyChitSchemesMocker dailyChitSchemesMocker = new DailyChitSchemesMocker();
        dailyChitSchemesMocker.mockDailySchemesTableData(dailyAuctionableDurationsRepository, dailyChitGroupsRepository);

        BiDailyChitSchemesMocker biDailyChitSchemesMocker = new BiDailyChitSchemesMocker();
        biDailyChitSchemesMocker.mockBiDailySchemesTableData(biDailyAuctionableDurationsRepository, biDailyChitGroupsRepository);

        WeeklyChitSchemesMocker weeklyChitSchemesMocker = new WeeklyChitSchemesMocker();
        weeklyChitSchemesMocker.mockWeeklySchemesTableData(weeklyAuctionableDurationsRepository, weeklyChitGroupsRepository);

        TeeklyChitSchemesMocker teeklyChitSchemesMocker = new TeeklyChitSchemesMocker();
        teeklyChitSchemesMocker.mockTeeklySchemesTableData(teeklyAuctionableDurationsRepository, teeklyChitGroupsRepository);

        BiWeeklyChitSchemesMocker biWeeklyChitSchemesMocker = new BiWeeklyChitSchemesMocker();
        biWeeklyChitSchemesMocker.mockBiWeeklySchemesTableData(biWeeklyAuctionableDurationsRepository, biWeeklyChitGroupsRepository);

        MonthlyChitSchemesMocker monthlyChitSchemesMocker = new MonthlyChitSchemesMocker();
        monthlyChitSchemesMocker.mockMonthlySchemesTableData(monthlyAuctionableDurationsRepository, monthlyChitGroupsRepository);
    }


}
