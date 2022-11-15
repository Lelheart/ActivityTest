package com.example.lesson1;

public class Question {
    private String ques;
    private boolean answ;

    public Question(String ques, boolean answ) {
        this.ques = ques;
        this.answ = answ;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public boolean isAnsw() {
        return answ;
    }

    public void setAnsw(boolean answ) {
        this.answ = answ;
    }
}
