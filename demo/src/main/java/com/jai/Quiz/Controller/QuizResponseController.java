package com.jai.Quiz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.Quiz.Entity.QuizResult;
import com.jai.Quiz.Service.QuizService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/quiz")
public class QuizResponseController {
	
	@Autowired
	QuizService quizService;
	
	@PostMapping("/submit/{id}")
	public ResponseEntity<Integer> result(@PathVariable Integer id ,@RequestBody List<QuizResult>Responses ) {
		
		return quizService.calculate(id,Responses);
		
		
		
	}
	
	

	
	
	
}
