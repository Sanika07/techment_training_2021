package com.techment.exception;

public class IdNotFoundException extends RuntimeException {
	
	String msg;

	public IdNotFoundException(String msg) {
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
