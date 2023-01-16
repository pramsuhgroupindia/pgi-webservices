package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.EnrollRequests;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollRequestsRepository extends JpaRepository<EnrollRequests, Long> {
    List<EnrollRequests> findAllByAadharNumber(String aadhar_number);
}