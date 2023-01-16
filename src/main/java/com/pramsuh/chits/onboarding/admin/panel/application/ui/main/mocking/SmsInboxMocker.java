package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SMSInbox;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.SMSInboxRepository;

public class SmsInboxMocker {
    public void mockSmsInboxTbaleData(SMSInboxRepository smsInboxRepository, Customer customer){
        SMSInbox smsInbox = new SMSInbox();
        smsInbox.setAadharNumber(customer.getAadharNumber());
        smsInbox.setAddress("SHAMSHABAD");
        smsInbox.setFoldername("INBOX");
        smsInbox.setIdentifier("1");
        smsInbox.setMessage("MESSAGE");
        smsInbox.setTime("13/01/2023,20:08 hrs");
        smsInbox.setCustName(customer.getCustomerName());
        smsInbox.setReadstate("1");
        smsInboxRepository.save(smsInbox);
    }
}
