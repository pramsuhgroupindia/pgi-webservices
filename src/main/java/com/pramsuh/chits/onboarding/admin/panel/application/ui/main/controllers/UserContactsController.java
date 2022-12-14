package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata.UserContacts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.commons.mobiledatarepositories.UserContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/user/contacts")
public class UserContactsController {
    @Autowired
    UserContactsRepository userContactsRepository;


    @GetMapping
    public List<UserContacts> getAllUserContacts(){
        return userContactsRepository.findAll();
    }

    @PostMapping
    public UserContacts createUserContactsData(@RequestBody UserContacts userContacts){
        return userContactsRepository.save(userContacts);
    }

    @PostMapping
    public List<UserContacts> createUserContactsListData(@RequestBody List<UserContacts> userContacts){
        for (UserContacts userContact : userContacts) {
            userContactsRepository.save(userContact);
        }
        return userContacts;
    }



}
