package com.jai.Quiz.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionWrapper {
	public int id;
    public String questionTitle;
    public String option1;
    public String option2;
    public String option3;
    public String option4;
   
}
