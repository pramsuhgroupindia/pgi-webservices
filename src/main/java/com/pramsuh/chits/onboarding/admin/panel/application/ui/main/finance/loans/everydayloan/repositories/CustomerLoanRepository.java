package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.CustomerLoanInfo;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.CustomerLoans;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.workers.LoanRequestsStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerLoanRepository extends JpaRepository<CustomerLoans, Long> {
    CustomerLoanInfo findInfoByLoanNumber(int loanNumber);

    CustomerLoanInfo findInfoByLoanNumberAndStatus(int loanNumber, LoanRequestsStatus status);

}