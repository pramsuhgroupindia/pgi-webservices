package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanProductsDurations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanProductsDurationsRepository extends JpaRepository<LoanProductsDurations, Long> {
    LoanProductsDurations findLoanProductDurationByDurationInDays(int durationInDays);
}