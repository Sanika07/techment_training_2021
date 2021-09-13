package com.techment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.UserDto;
import com.techment.entity.LoanApplication;
import com.techment.entity.User;
import com.techment.exception.LoanApplicationAlreadyExist;
import com.techment.exception.LoanApplicationNotFound;
import com.techment.exception.UnAuthorisedException;
import com.techment.service.ILoanApplicationService;
import com.techment.service.IUserService;

@RestController
@RequestMapping("/api/v1")
public class LoanApplicationController {

	@Autowired
	ILoanApplicationService loanService;

	@Autowired
	IUserService userService;

	@PostMapping("/applyloan")
	public ResponseEntity<LoanApplication> saveLoanApplication(@RequestBody LoanApplication loanApplication,
			@RequestHeader String token) {
		try {

			Optional<UserDto> user = userService.findUserByToken(token);

			if (!user.isEmpty())
				throw new UnAuthorisedException("unauthorised ");
			else {
				LoanApplication loanapp = loanService.saveLoanApplication(loanApplication);
				return new ResponseEntity<LoanApplication>(loanapp, HttpStatus.CREATED);
			}

		} 
		catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("Unauthorized User");
		}
		
		catch (Exception e) {
			throw new LoanApplicationAlreadyExist("User Already Exists");
		}
	}

	@PutMapping("/approveLoan/{loanId}")
	public ResponseEntity<LoanApplication> approveLoanApplication(@PathVariable long loanId,
			@RequestHeader String token) {
		try {

			Optional<UserDto> user = userService.findUserByToken(token);
	
			if (user.isEmpty())
				throw new UnAuthorisedException("token not correct");

			else {
				LoanApplication newLoanApplication = loanService.approveLoanApplication(loanId);
				return new ResponseEntity<LoanApplication>(newLoanApplication, HttpStatus.OK);
			}

		} catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("Unauthorized User hence not approved");
		}
		
		catch (Exception e) {
			throw new LoanApplicationNotFound("Loan Application not found");
		}
	}

	@PutMapping("/rejectLoan/{loanId}")
	public ResponseEntity<LoanApplication> rejectLoanApplication(@PathVariable long loanId,
			@RequestHeader String token) {
		try {
			Optional<UserDto> user = userService.findUserByToken(token);
			if (user.isEmpty()) {
				throw new UnAuthorisedException("token not correct");
			}

			else {

				LoanApplication loanapp = loanService.rejectLoanApplication(loanId);
				return new ResponseEntity<LoanApplication>(loanapp, HttpStatus.OK);
			}

		} 
		catch(UnAuthorisedException e) {
			throw new UnAuthorisedException("Unauthorized User so rejected");
		}
		
		catch (Exception e) {
			throw new LoanApplicationNotFound("Loan Application not found");
		}
	}

}
