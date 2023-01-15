package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DailyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyChitGroupsRepository extends JpaRepository<DailyChitGroups, Long> {
    public DailyChitGroups findChitGroupByCode(String code);

    public List<DailyChitGroups> findAllChitGroupsByDuration(String duration);
}