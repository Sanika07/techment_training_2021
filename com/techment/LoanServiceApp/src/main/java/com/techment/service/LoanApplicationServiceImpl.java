package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.entity.LoanApplication;
import com.techment.repository.LoanApplicationRepository;

@Service
public class LoanApplicationServiceImpl implements ILoanApplicationService{

	@Autowired
	LoanApplicationRepository loanRepo;
	
	@Override
	public LoanApplication saveLoanApplication(LoanApplication loanApplication)throws Exception {
	
		return loanRepo.save(loanApplication);
	}

	@Override
	public LoanApplication approveLoanApplication(long loanId) {
		LoanApplication loanApplication = loanRepo.findById(loanId).get();
		loanApplication.setStatus("Approved");
		
		loanRepo.save(loanApplication);
		return loanApplication;
	}

	@Override
	public LoanApplication rejectLoanApplication(long loanId) {
		LoanApplication loanApplication = loanRepo.findById(loanId).get();
		loanApplication.setStatus("Rejected");
		loanRepo.save(loanApplication);
		return loanApplication;
	}

}
