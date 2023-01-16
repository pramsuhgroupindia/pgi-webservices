package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MemberDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MemberDetailsRepository;

public class MemberDetailsMocker {

    public MemberDetails mockMemberDetailsTableData(MemberDetailsRepository memberDetailsRepository, SignupDetails signupDetails){
        MemberDetails memberDetails = null;
        if (!memberDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent()) {
            memberDetails = new MemberDetails();
            memberDetails.setFullName(signupDetails.getFullName());
            memberDetails.setEmailId(signupDetails.getEmailId());
            memberDetails.setMobileNumber(signupDetails.getMobileNumber());
            memberDetails.setDateOfBirth(signupDetails.getDateOfBirth());
            memberDetails.setOccupation(signupDetails.getOccupation());
            memberDetails.setAddress(signupDetails.getAddress());
            memberDetails.setAadharNumber(signupDetails.getAadharNumber());
            memberDetails.setPanNumber(signupDetails.getPanNumber());
            memberDetails.setPassword(signupDetails.getPassword());
            memberDetails.setConfirmPassword(signupDetails.getConfirmPassword());
            memberDetails.setNomineeFullName(signupDetails.getNomineeFullName());
            memberDetails.setAadharCard(signupDetails.getAadharCard());
            memberDetails.setPanCard(signupDetails.getPanCard());
            memberDetails.setAddressCard(signupDetails.getAddressCard());
            memberDetails.setNomineeAge(signupDetails.getNomineeAge());
            memberDetails.setNomineeAddress(signupDetails.getNomineeAddress());
            memberDetails.setNomineeAadharNumber(signupDetails.getNomineeAadharNumber());
            memberDetails.setNomineePanNumber(signupDetails.getNomineePanNumber());
            memberDetails.setNomineeMobNumber(signupDetails.getNomineeMobNumber());
            memberDetails.setOccupation(signupDetails.getOccupation());
            memberDetails.setNomineeRelation(signupDetails.getNomineeRelation());
            memberDetails.setMessage("REGISTERED");
            memberDetailsRepository.save(memberDetails);
        }
        return memberDetails;
    }
}
