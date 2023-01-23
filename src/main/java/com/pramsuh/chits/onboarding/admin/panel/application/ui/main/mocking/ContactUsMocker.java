package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ContactUs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.ContactUsRepository;

public class ContactUsMocker {

    public ContactUs mockBranchInfo(ContactUsRepository contactUsRepository){
        ContactUs contactUs = new ContactUs();
        contactUs.setName("PRAMSUH CHIT FUND PRIVATE LIMITED");
        contactUs.setCode("PRAMSUH001");
        contactUs.setArea("MADHAPUR");
        contactUs.setCity("HYDERABAD");
        contactUs.setState("TELANGANA");
        contactUs.setPin("500081");
        contactUs.setAddress("G1. 651, SA SOCIETY, ROAD 35, KHANAMET, MADHAPUR, HYDERABAD, TELANGANA");
        contactUs.setType("Head Quarter");
        contactUs.setNumber1("+91-9581286452");
        contactUs.setNumber2("+91-6300532342");
        contactUs.setEmail1("info@pramsuh.com");
        contactUs.setEmail1("support@pramsuh.com");
        contactUs.setHours("11:00 AM to 05:00 PM");
        contactUs.setDir1("JEETENDRA WAWDHANE");
        contactUs.setDir2("RAMLING NAGNATH SWAMI");
        contactUs.setWebsite("https://www.pramsuhchits.com");
        if(null == contactUsRepository.findByCode(contactUs.getCode())){
            return contactUsRepository.save(contactUs);
        }
        return contactUs;
    }
}
