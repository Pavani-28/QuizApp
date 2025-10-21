package com.pavani.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
    private Long id;
    private String option1;
    private String option2;
    private String option3;

    public QuestionWrapper(Long id, String option1, String option2, String option4, String option3, String questionTitle) {
        this.id = id;
        this.option1 = option1;
        this.option2 = option2;
        this.option4 = option4;
        this.option3 = option3;
        this.questionTitle = questionTitle;
    }

    private String option4;
    private String questionTitle;
}
