package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SMSInbox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SMSInboxRepository extends JpaRepository<SMSInbox, Long> {
    List<SMSInbox> findAllByaadharNumber(String aadharNumber);
}