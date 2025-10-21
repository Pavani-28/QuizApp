package com.pavani.quizapp.dao;

import com.pavani.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizDao extends JpaRepository<Quiz,Integer> {


}
