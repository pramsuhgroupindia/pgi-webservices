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

    public static void main(String[] args) {
        SpringApplication.run(PramsuhWebservicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mock();
    }

    public void mock(){

        SignUpDetailsMocker signUpDetailsMocker = new SignUpDetailsMocker();
        signUpDetailsMocker.mockSignUpDetailsTableData();

        CustomerMocker customerMocker = new CustomerMocker();
        customerMocker.mockCustomerDataTable();

        UserContactsMocker userContactsMocker = new UserContactsMocker();
        userContactsMocker.mockUserContactsDataTable();

        LocationMocker locationMocker = new LocationMocker();
        locationMocker.mockLocationDataTable();

        AuctionableSchemesMocker auctionableSchemesMocker = new AuctionableSchemesMocker();
        auctionableSchemesMocker.mockAuctionableSchemes();

        DailyChitSchemesMocker dailyChitSchemesMocker = new DailyChitSchemesMocker();
        dailyChitSchemesMocker.mockDailySchemesTableData();

        BiDailyChitSchemesMocker biDailyChitSchemesMocker = new BiDailyChitSchemesMocker();
        biDailyChitSchemesMocker.mockBiDailySchemesTableData();

        WeeklyChitSchemesMocker weeklyChitSchemesMocker = new WeeklyChitSchemesMocker();
        weeklyChitSchemesMocker.mockWeeklySchemesTableData();

        TeeklyChitSchemesMocker teeklyChitSchemesMocker = new TeeklyChitSchemesMocker();
        teeklyChitSchemesMocker.mockTeeklySchemesTableData();

        BiWeeklyChitSchemesMocker biWeeklyChitSchemesMocker = new BiWeeklyChitSchemesMocker();
        biWeeklyChitSchemesMocker.mockBiWeeklySchemesTableData();

        MonthlyChitSchemesMocker monthlyChitSchemesMocker = new MonthlyChitSchemesMocker();
        monthlyChitSchemesMocker.mockMonthlySchemesTableData();
    }


}
