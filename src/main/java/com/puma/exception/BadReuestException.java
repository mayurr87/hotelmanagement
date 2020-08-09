package com.puma.exception;

/**
 * @author Mayur Rahatekar Custom Exception
 *
 */
public class BadReuestException extends RuntimeException {

	private static final long serialVersionUID = -525252343942950551L;

	public BadReuestException(String s) {
		super(s);
	}

}
