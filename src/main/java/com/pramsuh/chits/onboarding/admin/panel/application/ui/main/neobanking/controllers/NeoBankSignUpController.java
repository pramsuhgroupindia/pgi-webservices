package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankMember;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankSignUp;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories.NeoBankMemberRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories.NeoBankSignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/neo/banking/web/services/customer/signup")
public class NeoBankSignUpController {
    @Autowired
    NeoBankSignUpRepository neoBankSignUpRepository;

    @Autowired
    NeoBankMemberRepository neoBankMemberRepository;

    @GetMapping("/all")
    public List<NeoBankSignUp> getAllProfiles() {
        return neoBankSignUpRepository.findAll();
    }

    @GetMapping("{mobile_number}")
    public Optional<NeoBankSignUp> getProfileByMobNum(@PathVariable String mobileNumber) {
        return neoBankSignUpRepository.findProfileByMobileNumber(mobileNumber);
    }

    @PostMapping
    public ResponseEntity<NeoBankSignUp> createRegistrationDetails(@RequestBody NeoBankSignUp neoBankSignUp) {
        if (!neoBankSignUpRepository.findProfileByMobileNumber(neoBankSignUp.getMobileNumber()).isPresent()) {
            NeoBankSignUp neoBankSignUp1 = neoBankSignUpRepository.save(neoBankSignUp);
            if (!neoBankMemberRepository.findProfileByMobileNumber(neoBankSignUp1.getMobileNumber()).isPresent()) {
                NeoBankMember neoBankMember = new NeoBankMember();
                neoBankMember.setFullName(neoBankSignUp1.getFullName());
                neoBankMember.setMobileNumber(neoBankSignUp1.getMobileNumber());
                neoBankMember.setEmailId(neoBankSignUp1.getEmailId());
                neoBankMember.setAddress(neoBankSignUp1.getAddress());
                neoBankMember.setCity(neoBankSignUp1.getCity());
                neoBankMember.setState(neoBankSignUp1.getState());
                neoBankMember.setPinCode(neoBankSignUp1.getPinCode());
                neoBankMember.setDateOfBirth(neoBankSignUp1.getDateOfBirth());
                neoBankMember.setOccupation(neoBankSignUp1.getOccupation());
                neoBankMember.setAadharNumber(neoBankSignUp1.getAadharNumber());
                neoBankMember.setPanNumber(neoBankSignUp1.getPanNumber());
                neoBankMember.setMessage(neoBankSignUp1.getMessage());
                neoBankMemberRepository.save(neoBankMember);
            }
            if(neoBankSignUp1 != null){
                neoBankSignUp1.setMessage("REGISTERED");
                return ResponseEntity.ok(neoBankSignUp1);
            }
        } else{
            neoBankSignUp.setMessage("ALREADY REGISTERED");
            return ResponseEntity.ok(neoBankSignUp);
        }
        neoBankSignUp.setMessage("ERROR");
        return ResponseEntity.ok(neoBankSignUp);
    }
}
