package com.jai.Quiz.Entity;



import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class QuizResult {
    private Integer id;  // ID for the quiz result
    private String answer; // User's answer
}