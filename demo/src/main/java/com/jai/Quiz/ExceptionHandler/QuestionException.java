package com.jai.Quiz.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Component
public class QuestionException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public QuestionException() {
		super("Question not found");
	}

	public QuestionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	// Constructor with a custom message and cause
    public QuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with a cause
    public QuestionException(Throwable cause) {
        super(cause);
    }
}
