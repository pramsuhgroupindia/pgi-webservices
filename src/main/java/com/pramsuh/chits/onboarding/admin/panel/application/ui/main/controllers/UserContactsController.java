package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata.UserContacts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.commons.mobiledatarepositories.UserContactsRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/customer/contacts")
public class UserContactsController {
    @Autowired
    UserContactsRepository userContactsRepository;
    private EntityManager entityManager;
    @GetMapping
    public List<UserContacts> getAllUserContacts() {
        return userContactsRepository.findAll();
    }

    @GetMapping("{userNumber}")
    public List<UserContacts> getAllUserContactsMainUserWise(@PathVariable String userNumber) {
        return userContactsRepository.findAllByuserNumber(userNumber);
    }

//    @PostMapping
//    public UserContacts createUserContactsData(@RequestBody UserContacts userContacts) {
//        return userContactsRepository.save(userContacts);
//    }

    @PostMapping
    public ResponseEntity<String> createUserContactsListData(@RequestBody List<UserContacts> userContacts) {
        for (UserContacts userContact : userContacts) {
            userContact.setMessage("SUCCESS");
        }
        List<UserContacts> contactsList = userContactsRepository.saveAll(userContacts);
        if(null != this.entityManager) {
            entityManager.persist(userContacts);
        }
        if(contactsList == null){
            return ResponseEntity.ok("ERROR");
        }
        return ResponseEntity.ok("SUCCESS");
    }


}
