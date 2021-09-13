package com.techment.exception;

public class LoanApplicationAlreadyExist extends RuntimeException{

	/*
	 * public LoanApplicationAlreadyExist(String msg) { super(msg); }
	 */
	
	String msg;

	public LoanApplicationAlreadyExist(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
