package com.jai.Quiz.Controller;

import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.RestController;

import com.jai.Quiz.Entity.Question;
import com.jai.Quiz.ExceptionHandler.QuestionException;
import com.jai.Quiz.Service.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("question")
public class QuestionController {
	
	
	@Autowired
	QuestionService questionService;
	
	
  /*
   * 	HTTP Method: GET
   *    Path: question/allQuestions
   *    Return : ResponseEntity<List<Question>>
   */
	
	
	@GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
	
	
	
	
	/*
	   * 	HTTP Method: Post
	   *    Path: question/add
	   *    Return : Question added successfully
	   */
	
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
	    System.out.println("Received Question: " + question);
	    questionService.saveQuestion(question);
	    return ResponseEntity.ok("Question added successfully!" + question.getQuestionTitle());
	}
	
	
	/*
	   * 	HTTP Method: GET
	   *    Path: /difficulty/{level} 
	   *    Return : ResponseEntity<List<Question>>
	   */
	
	
	@GetMapping("/difficulty/{level}")
	public ResponseEntity<List<Question>> GetBydifficultylevel(@PathVariable String level) throws QuestionException{
		if (!level.equals("Easy") && !level.equals("Medium") && !level.equals("Hard")) {
	        throw new QuestionException("Invalid difficulty level: " + level);
	    }
	
		return questionService.GetBydifficultylevel(level);
	}
	
	
	
	

}
