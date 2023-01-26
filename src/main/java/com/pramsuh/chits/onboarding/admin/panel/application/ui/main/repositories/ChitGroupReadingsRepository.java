package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ChitGroupReadings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChitGroupReadingsRepository extends JpaRepository<ChitGroupReadings, Long> {
    public List<ChitGroupReadings> findAllReadingsByCode(String code);
}