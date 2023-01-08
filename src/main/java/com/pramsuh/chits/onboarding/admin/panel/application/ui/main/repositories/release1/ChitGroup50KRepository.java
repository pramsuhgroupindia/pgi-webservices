package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.ChitGroup50K;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChitGroup50KRepository extends JpaRepository<ChitGroup50K, Long> {
    public ChitGroup50K findChitGroupBymTitle(String mTitle);
}