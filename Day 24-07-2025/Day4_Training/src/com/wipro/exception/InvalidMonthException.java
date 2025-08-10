package com.wipro.exception;

public class InvalidMonthException extends Exception {
	String message;
	public InvalidMonthException(String message) {
        super(message);
    }
}
