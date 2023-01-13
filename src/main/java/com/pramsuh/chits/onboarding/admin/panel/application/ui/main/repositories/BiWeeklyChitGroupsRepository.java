package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiWeeklyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiWeeklyChitGroupsRepository extends JpaRepository<BiWeeklyChitGroups, Long> {
    public BiWeeklyChitGroups findChitGroupByCode(String code);

    public List<BiWeeklyChitGroups> findAllChitGroupsByDuration(String duration);
}