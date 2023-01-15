package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SMSInbox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SMSInboxRepository extends JpaRepository<SMSInbox, Long> {
    List<SMSInbox> findAllByaadharNumber(String aadharNumber);
}