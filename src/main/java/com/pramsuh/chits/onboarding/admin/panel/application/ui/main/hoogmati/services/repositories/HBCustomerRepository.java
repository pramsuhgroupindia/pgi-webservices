package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HBCustomerRepository extends JpaRepository<HBCustomer, Long> {
}