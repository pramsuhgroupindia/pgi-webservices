package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.WeeklyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeeklyChitGroupsRepository extends JpaRepository<WeeklyChitGroups, Long> {
    public WeeklyChitGroups findChitGroupByCode(String code);

    public List<WeeklyChitGroups> findAllChitGroupsByDuration(String duration);
}