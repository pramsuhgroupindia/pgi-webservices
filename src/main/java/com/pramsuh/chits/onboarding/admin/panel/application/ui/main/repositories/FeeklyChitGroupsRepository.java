package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.FeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TriDailyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeeklyChitGroupsRepository extends JpaRepository<FeeklyChitGroups, Long> {
    public FeeklyChitGroups findChitGroupByCode(String code);

    public List<FeeklyChitGroups> findAllChitGroupsByDuration(String duration);
}