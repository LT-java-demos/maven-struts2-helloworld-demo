package com.lt.action;

public class Test {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String execute() {
        if ("2".equals(answer)) {
            return "success";
        } else {
            return "false";
        }
    }
}
