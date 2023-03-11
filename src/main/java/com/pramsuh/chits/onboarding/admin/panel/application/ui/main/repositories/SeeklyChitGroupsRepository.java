package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.FeeklyChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SeeklyChitGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeeklyChitGroupsRepository extends JpaRepository<SeeklyChitGroups, Long> {
    public SeeklyChitGroups findChitGroupByCode(String code);

    public List<SeeklyChitGroups> findAllChitGroupsByDuration(String duration);
}