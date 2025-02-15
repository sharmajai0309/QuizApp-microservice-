package com.jai.Quiz.GlobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jai.Quiz.ExceptionHandler.QuestionException;

@ControllerAdvice
@Component
public class GlobalHandler {
	
	@ExceptionHandler(QuestionException.class)
	public ResponseEntity<String> handleQuestionEx (QuestionException qe){
		return new ResponseEntity<String>(qe.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlegenericException(Exception Ex){
		return new ResponseEntity<String>(Ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
