package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllRunningChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllRunningChitGroupsRepository extends JpaRepository<AllRunningChitGroups, Long> {
    public AllRunningChitGroups findRunningChitGroupByCode(String code);

}