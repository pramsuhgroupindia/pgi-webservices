package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AuctionableSchemes;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AuctionableSchemesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuctionableSchemesMocker {


    public void mockAuctionableSchemes(AuctionableSchemesRepository auctionableSchemesRepository) {
        AuctionableSchemes auctionableSchemes = new AuctionableSchemes();
        auctionableSchemes.setE1d("DAILY(E1D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE1dtoggle("0");
        auctionableSchemes.setE2d("BI_DAILY(E2D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE2dtoggle("0");
        auctionableSchemes.setE7d("WEEKLY(E7D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE7dtoggle("1");
        auctionableSchemes.setE10d("TEEKLY(E10D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE10dtoggle("0");
        auctionableSchemes.setE14d("BI_WEEKLY(E14D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE14dtoggle("0");
        auctionableSchemes.setE30d("MONTHLY(E30D) ACTIONABLE CHIT GROUP SCHEMES");
        auctionableSchemes.setE30dtoggle("1");
        if(!auctionableSchemesRepository.existsById(Integer.toUnsignedLong(1))) {
            auctionableSchemesRepository.save(auctionableSchemes);
        }
    }
}
