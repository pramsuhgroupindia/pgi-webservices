package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.commons.mobiledatarepositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata.UserContacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactsRepository extends JpaRepository<UserContacts, Long> {
}