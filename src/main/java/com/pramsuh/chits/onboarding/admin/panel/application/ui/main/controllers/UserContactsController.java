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

    @GetMapping("{usernumber}")
    public List<UserContacts> getAllUserContactsMainUserWise(@PathVariable String usernumber) {
        return userContactsRepository.findAllByusernumber(usernumber);
    }

//    @PostMapping
//    public UserContacts createUserContactsData(@RequestBody UserContacts userContacts) {
//        return userContactsRepository.save(userContacts);
//    }

    @PostMapping
    public ResponseEntity<String> createUserContactsListData(@RequestBody List<UserContacts> userContacts) {
        for (UserContacts userContact : userContacts) {
            userContact.setMessage("Uploaded");
        }
        userContactsRepository.saveAll(userContacts);
        if(null != this.entityManager) {
            entityManager.persist(userContacts);
        }
        return ResponseEntity.ok("Uploaded");
    }


}
