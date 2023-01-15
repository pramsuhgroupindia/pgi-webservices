package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AuctionableSchemes;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AuctionableSchemesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuctionableSchemesMocker {

    @Autowired
    private AuctionableSchemesRepository auctionableSchemesRepository;

    public void mockAuctionableSchemes(){
        AuctionableSchemes auctionableSchemes = new AuctionableSchemes();
        auctionableSchemes.setE1d("DAILY(E1D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE2d("BI_DAILY(E2D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE7d("WEEKLY(E7D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE10d("TEEKLY(E10D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE14d("BI_WEEKLY(E14D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE30d("MONTHLY(E30D) ACTIONABLE CHIT GROUP SCHEMES");
        if(!auctionableSchemesRepository.existsById(Integer.toUnsignedLong(1))) {
            auctionableSchemesRepository.save(auctionableSchemes);
        }
    }
}
