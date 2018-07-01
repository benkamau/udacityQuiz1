package com.example.bennj.udacityquiz;

public class Quiz {
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int answer;

    public Quiz(){

    }

    public Quiz(String question, String choice1, String choice2, String choice3, String choice4, int answer) {
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuiz(String question){
        this.question = question;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer){
        this.answer = answer;
    }
}
