package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.BiMonthlyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiMonthlyChitGroupsRepository extends JpaRepository<BiMonthlyChitGroups, Long> {
    public BiMonthlyChitGroups findChitGroupByCode(String code);

    public List<BiMonthlyChitGroups> findAllChitGroupsByDuration(String duration);
}