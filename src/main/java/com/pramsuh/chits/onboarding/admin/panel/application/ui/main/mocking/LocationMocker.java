package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Location;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.LocationRepository;

public class LocationMocker {


    public void mockLocationDataTable(LocationRepository locationRepository, Customer customer){
        Location location = new Location();
        location.setMobileNumber(customer.getMobileNumber());
        location.setAadharNumber(customer.getAadharNumber());
        location.setAddress("SHAMSHABAD");
        location.setCustomerName(customer.getCustomerName());
        locationRepository.save(location);

    }
}
