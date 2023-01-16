package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.SignupDetailsRepository;

public class SignUpDetailsMocker {

    public SignupDetails mockSignUpDetailsTableData(SignupDetailsRepository signupDetailsRepository){
        SignupDetails signupDetails = new SignupDetails();
        signupDetails.setFullName("PRAMSUH WAWDHANE");
        signupDetails.setMobileNumber("9581286452");
        signupDetails.setEmailId("pramsuh@gmail.com");
        signupDetails.setDateOfBirth("18/06/1985");
        signupDetails.setOccupation("CEO");
        signupDetails.setAddress("SHAMSHABAD");
        signupDetails.setAadharNumber("597961516428");
        signupDetails.setPanNumber("ABCPW3300J");
        signupDetails.setAadharCard(null);
        signupDetails.setPanCard(null);
        signupDetails.setAddressCard(null);
        signupDetails.setPassword("12345678");
        signupDetails.setConfirmPassword("12345678");
        signupDetails.setNomineeFullName("JEETENDRA WAWDHANE");
        signupDetails.setNomineeAge("37");
        signupDetails.setNomineeAddress("SHAMSHABAD");
        signupDetails.setNomineeAadharNumber("597961516428");
        signupDetails.setNomineePanNumber("ASDFG5678H");
        signupDetails.setNomineeMobNumber("9949268070");
        signupDetails.setNomineeOccupation("CEO");
        signupDetails.setNomineeRelation("SON");
        signupDetails.setCibilConsent(Boolean.toString(Boolean.TRUE));
        signupDetails.setCfaConsent(Boolean.toString(Boolean.TRUE));
        signupDetails.setPrivacyConsent(Boolean.toString(Boolean.TRUE));
        signupDetails.setDataConsent(Boolean.toString(Boolean.TRUE));
        if(!signupDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent()){
            signupDetailsRepository.save(signupDetails);
        }
        return signupDetails;
    }
}
