package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiDailyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiDailyChitGroupsRepository extends JpaRepository<BiDailyChitGroups, Long> {
    public BiDailyChitGroups findChitGroupByCode(String code);

    public List<BiDailyChitGroups> findAllChitGroupsByDuration(String duration);
}