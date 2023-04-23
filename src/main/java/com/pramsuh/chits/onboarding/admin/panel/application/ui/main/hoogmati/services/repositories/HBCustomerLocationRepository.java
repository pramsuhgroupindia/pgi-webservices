package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HBCustomerLocationRepository extends JpaRepository<HBCustomerLocation, Long> {
    Optional<HBCustomerLocation> findLocationByaadharNumber(String aadharNumber);
}