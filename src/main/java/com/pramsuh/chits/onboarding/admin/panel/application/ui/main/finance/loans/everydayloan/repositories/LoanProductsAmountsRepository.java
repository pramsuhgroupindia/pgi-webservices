package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanProductsAmounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanProductsAmountsRepository extends JpaRepository<LoanProductsAmounts, Long> {
    LoanProductsAmounts findLoanProductByLoanNumber(int loanNumber);
}