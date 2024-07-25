package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        if(question == "What is your name?")
        return "Jack will win this for us";

        else if(question.contains("plus")) {
            var split = question.split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[4]);
            return Integer.toString(first + second);
        }

        else if(question.contains("multiplied by")) {
            var split = question.split(" ");
            var first = Integer.parseInt(split[2]);
            var second = Integer.parseInt(split[5]);
            return Integer.toString(first * second);
        } else {
            return "foo";
        }
    }
}
