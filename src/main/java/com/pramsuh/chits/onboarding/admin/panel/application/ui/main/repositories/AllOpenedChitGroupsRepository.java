package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllOpenedChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllOpenedChitGroupsRepository extends JpaRepository<AllOpenedChitGroups, Long> {
    public AllOpenedChitGroups findOpenChitGroupByCode(String code);

}