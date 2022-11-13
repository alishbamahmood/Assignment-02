package com.example.quizapp;

public class Quiz {

    public String que;
    public String[] opts;
    public String answer;

    public Quiz(String que, String[] opts, String answer) {
        this.que = que;
        this.opts = opts;
        this.answer = answer;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String[] getOpts() {
        return opts;
    }

    public void setOpts(String[] opts) {
        this.opts = opts;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
