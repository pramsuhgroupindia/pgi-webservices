package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.repositories;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.finance.loans.everydayloan.models.LoanRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LoanRequestsRepository extends JpaRepository<LoanRequests, Long> {
    LoanRequests findLoanProductRequestsByLoanNumber(int loanNumber);

    LoanRequests findLoanProductRequestsByloanRequestNumber(int loanRequestNumber);
//    LoanRequests findLoanProductRequestsByAadhar_Number(String aadharNumber);

//    HttpStatusCode findAllLoanRequestsByAadharNumber(String aadharNumber);
}