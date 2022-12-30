package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesDbRepository extends JpaRepository<FileDB, Long> {


}