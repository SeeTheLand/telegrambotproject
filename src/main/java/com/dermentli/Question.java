package com.dermentli;

import lombok.Data;

@Data
public class Question {
    private String id;
    private String language;
    private String category;
    private String content;
    private String answer;
    private int difficulty;
    private int likes;

    public Question next() {

    }

    public Question previous() {

    }



}