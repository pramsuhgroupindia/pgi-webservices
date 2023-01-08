package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup10Lakhs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChitGroup10LakhsRepository extends JpaRepository<ChitGroup10Lakhs, Long> {
    public ChitGroup10Lakhs findChitGroupBymTitle(String mTitle);
}