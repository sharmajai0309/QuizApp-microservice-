package com.jai.Quiz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jai.Quiz.Dao.QuizRepo;
import com.jai.Quiz.Entity.Question;
import com.jai.Quiz.Entity.Quiz;
import com.jai.Quiz.Service.QuizService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@Autowired
	QuizRepo quizRepo;
	
	
	

	/*
	 * Endpoint Details 
	 * URL: /quiz/create 
	 * HTTP Method: POST Consumes:
	 * application/x-www-form-urlencoded Produces: text/plain
	 */
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String level, @RequestParam int numQ) {
        List<Question> questions = quizService.findRandomQuestionsByLevelWithLimit(level, numQ);

        if (questions.isEmpty()) {
            return new ResponseEntity<>("No questions available for the specified difficulty level.", HttpStatus.NOT_FOUND);
        }

        // Logic for creating and saving the quiz
        Quiz quiz = new Quiz();
        quiz.setLevel(level);
        quiz.setQuestion(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("Quiz created successfully with " + questions.size() + " questions.", HttpStatus.CREATED);
    }
    
    
    
}
		
	
