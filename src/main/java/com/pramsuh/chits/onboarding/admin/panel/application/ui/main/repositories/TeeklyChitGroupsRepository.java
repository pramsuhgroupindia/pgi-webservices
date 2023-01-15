package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.TeeklyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeeklyChitGroupsRepository extends JpaRepository<TeeklyChitGroups, Long> {

    public TeeklyChitGroups findChitGroupByCode(String code);

    public List<TeeklyChitGroups> findAllChitGroupsByDuration(String duration);
}