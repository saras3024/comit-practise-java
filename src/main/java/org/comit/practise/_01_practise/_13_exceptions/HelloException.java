package org.comit.practise._01_practise._13_exceptions;

public class HelloException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */


	public HelloException() {
	}

	public HelloException(String message) {
		super(message);
	}

	public HelloException(Throwable cause) {
		super(cause);
	}

	public HelloException(String message, Throwable cause) {
		super(message, cause);
	}

	public HelloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
