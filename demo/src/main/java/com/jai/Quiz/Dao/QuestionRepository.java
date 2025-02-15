package com.jai.Quiz.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jai.Quiz.Entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByDifficultylevel(String level);

    @Query(value = "SELECT * FROM question WHERE difficultylevel = ?1 ORDER BY RAND()", nativeQuery = true)
    List<Question> findRandomQuestionsByLevel(String level);






}