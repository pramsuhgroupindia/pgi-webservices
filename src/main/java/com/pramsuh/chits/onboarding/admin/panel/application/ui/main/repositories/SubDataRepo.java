package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.SubData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubDataRepo extends JpaRepository<SubData, Long> {
}
