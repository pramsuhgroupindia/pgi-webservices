package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.mockers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankMember;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.models.NeoBankSignUp;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories.NeoBankMemberRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.neobanking.repositories.NeoBankSignUpRepository;

public class NeoBankSignUpMocker {
    public NeoBankSignUp mockSignUpDetailsTableData(NeoBankSignUpRepository neoBankSignUpRepository,
                                                    NeoBankMemberRepository neoBankMemberRepository){
        NeoBankSignUp neoBankSignUp = new NeoBankSignUp();
        neoBankSignUp.setFullName("PRAMSUH WAWDHANE");
        neoBankSignUp.setMobileNumber("9581286452");
        neoBankSignUp.setEmailId("pramsuh@gmail.com");
        neoBankSignUp.setAddress("Villa 225 Road 12 Rallaguda Road Shamshabad");
        neoBankSignUp.setCity("Hyderabad");
        neoBankSignUp.setState("Telangana");
        neoBankSignUp.setPinCode("500081");
        neoBankSignUp.setDateOfBirth("18/06/1985");
        neoBankSignUp.setOccupation("CEO");
        neoBankSignUp.setAadharNumber("597961516428");
        neoBankSignUp.setPanNumber("ABCPW3300J");
        neoBankSignUp.setMessage("Registering..");
        if(!neoBankSignUpRepository.findProfileByMobileNumber(neoBankSignUp.getMobileNumber()).isPresent()){
            NeoBankSignUp neoBankSignUp1 = neoBankSignUpRepository.save(neoBankSignUp);
            if(neoBankSignUp1 != null){
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
                neoBankMember.setMessage("Registering..");
                neoBankMemberRepository.save(neoBankMember);
            }
        }
        return neoBankSignUp;
    }
}
