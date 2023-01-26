package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllScheduledChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllScheduledChitGroupsRepository extends JpaRepository<AllScheduledChitGroups, Long> {
    public AllScheduledChitGroups findScheduledChitGroupByCode(String code);

}