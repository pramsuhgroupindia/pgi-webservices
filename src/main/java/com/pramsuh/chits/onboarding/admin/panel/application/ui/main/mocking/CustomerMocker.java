package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.CustomerRepository;

public class CustomerMocker {


    public Customer mockCustomerDataTable(CustomerRepository customerRepository, SignupDetails signupDetails){
        Customer customer = new Customer();
        customer.setCustomerName(signupDetails.getFullName());
        customer.setPassword(signupDetails.getPassword());
        customer.setAadharNumber(signupDetails.getAadharNumber());
        customer.setMobileNumber(signupDetails.getMobileNumber());
        customer.setMessage("REGISTERED");
        if(!customerRepository.findProfileByaadharNumber(customer.getAadharNumber()).isPresent()){
            customerRepository.save(customer);
        }
        return customer;
    }
}
