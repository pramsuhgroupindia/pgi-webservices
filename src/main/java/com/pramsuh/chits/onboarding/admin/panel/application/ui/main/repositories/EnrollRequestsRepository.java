package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.EnrollRequests;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.EnrollmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollRequestsRepository extends JpaRepository<EnrollRequests, Long> {
    List<EnrollRequests> findAllByAadharNumber(String aadhar_number);

    List<EnrollRequests> findByAadharNumberAndStatus(String aadhar_number, EnrollmentStatus status);

}