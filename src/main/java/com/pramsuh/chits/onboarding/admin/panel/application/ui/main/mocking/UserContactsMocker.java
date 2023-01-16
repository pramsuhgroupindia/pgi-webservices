package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.UserContacts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.UserContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserContactsMocker {
    @Autowired
    private UserContactsRepository userContactsRepository;

    public void mockUserContactsDataTable(UserContactsRepository userContactsRepository, Customer customer){
        UserContacts ob1 = new UserContacts();
        ob1.setUserName(customer.getCustomerName());
        ob1.setUserNumber(customer.getMobileNumber());
        ob1.setMessage("UPLOADED");
        ob1.setAadharNumber(customer.getAadharNumber());
        ob1.setFirstName("USER");
        ob1.setLastName("ONE");
        ob1.setMobileNumber("9876543210");

        UserContacts ob2 = new UserContacts();
        ob2.setUserName(customer.getCustomerName());
        ob2.setUserNumber(customer.getMobileNumber());
        ob2.setMessage("UPLOADED");
        ob2.setAadharNumber(customer.getAadharNumber());
        ob2.setFirstName("USER");
        ob2.setLastName("TWO");
        ob2.setMobileNumber("9012345678");

        UserContacts ob3 = new UserContacts();
        ob3.setUserName(customer.getCustomerName());
        ob3.setUserNumber(customer.getMobileNumber());
        ob3.setMessage("UPLOADED");
        ob3.setAadharNumber(customer.getAadharNumber());
        ob3.setFirstName("USER");
        ob3.setLastName("THREE");
        ob3.setMobileNumber("9786543210");

        List<UserContacts> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        userContactsRepository.saveAll(list);
    }
}
