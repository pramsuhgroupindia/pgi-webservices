package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TriDailyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TriDailyChitGroupsRepository extends JpaRepository<TriDailyChitGroups, Long> {
    public TriDailyChitGroups findChitGroupByCode(String code);

    public List<TriDailyChitGroups> findAllChitGroupsByDuration(String duration);
}