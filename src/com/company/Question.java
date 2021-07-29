package com.company;

public class Question {
    @JsonProperty
    String question;
    @JsonProperty
    String [] offeredAnswers;
    @JsonProperty
    String [] correctAnswer;
    @JsonProperty
    String tag;

    public Question(String question, String[] offeredAnswers, String[] correctAnswer, String tag) {
        this.question = question;
        this.offeredAnswers = offeredAnswers;
        this.correctAnswer = correctAnswer;
        this.tag = tag;
    }
}
