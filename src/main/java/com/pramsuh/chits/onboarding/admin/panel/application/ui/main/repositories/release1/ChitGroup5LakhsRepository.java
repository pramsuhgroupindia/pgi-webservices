package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup5Lakhs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChitGroup5LakhsRepository extends JpaRepository<ChitGroup5Lakhs, Long> {
    public ChitGroup5Lakhs findChitGroupBymTitle(String mTitle);

}