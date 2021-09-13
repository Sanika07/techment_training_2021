package com.techment.exception;

public class LoanApplicationNotFound extends RuntimeException{

	/*
	 * public LoanApplicationNotFound(String msg) { super(msg); }
	 */
	
	String msg;

	public LoanApplicationNotFound(String msg) {
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
