package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllClosedChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllClosedChitGroupsRepository extends JpaRepository<AllClosedChitGroups, Long> {
    public AllClosedChitGroups findClosedChitGroupByCode(String code);

}